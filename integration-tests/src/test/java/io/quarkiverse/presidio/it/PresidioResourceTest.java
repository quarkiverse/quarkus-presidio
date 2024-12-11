package io.quarkiverse.presidio.it;

import io.quarkiverse.presidio.runtime.Analyzer;
import io.quarkiverse.presidio.runtime.Anonymizer;
import io.quarkiverse.presidio.runtime.model.AnalyzeRequest;
import io.quarkiverse.presidio.runtime.model.AnonymizeRequest;
import io.quarkiverse.presidio.runtime.model.AnonymizeRequestAnonymizersValue;
import io.quarkiverse.presidio.runtime.model.AnonymizeResponse;
import io.quarkiverse.presidio.runtime.model.RecognizerResult;
import io.quarkiverse.presidio.runtime.model.RecognizerResultWithAnaysisExplanation;
import java.util.List;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
public class PresidioResourceTest {

    @RestClient
    Analyzer analyzer;

    @RestClient
    Anonymizer anonymizer;

    @Test
    public void shouldAnalyzeText() {
        AnalyzeRequest analyzeRequest = new AnalyzeRequest();
        analyzeRequest.text("John Smith drivers license is AC432223");
        analyzeRequest.language("en");

        List<RecognizerResultWithAnaysisExplanation> recognizerResultWithAnaysisExplanations = analyzer.analyzePost(analyzeRequest);

        assertThat(recognizerResultWithAnaysisExplanations).hasSize(2);

        final RecognizerResultWithAnaysisExplanation personEntity = recognizerResultWithAnaysisExplanations.get(0);
        assertThat(personEntity.getEntityType()).isEqualTo("PERSON");
        assertThat(personEntity.getStart()).isEqualTo(0);
        assertThat(personEntity.getEnd()).isEqualTo(10);

        int lastElementPosition = recognizerResultWithAnaysisExplanations.size() - 1;

        final RecognizerResultWithAnaysisExplanation driverLicenseEntity = recognizerResultWithAnaysisExplanations.get(lastElementPosition);
        assertThat(driverLicenseEntity.getEntityType()).isEqualTo("US_DRIVER_LICENSE");
        assertThat(driverLicenseEntity.getStart()).isEqualTo(30);
        assertThat(driverLicenseEntity.getEnd()).isEqualTo(38);
    }

    @Test
    public void shouldAnonymizeData() {

        String text = "hello world, my name is Jane Doe. My number is: 034453334";

        AnalyzeRequest analyzeRequest = new AnalyzeRequest();
        analyzeRequest.language("en");
        analyzeRequest.text(text);

        List<RecognizerResultWithAnaysisExplanation> recognizerResults = analyzer.analyzePost(analyzeRequest);

        AnonymizeRequestAnonymizersValue REPLACE = new AnonymizeRequestAnonymizersValue();
        REPLACE.setType("replace");
        REPLACE.setNewValue("ANONYMIZED");

        AnonymizeRequestAnonymizersValue PHONE = new AnonymizeRequestAnonymizersValue();
        PHONE.setType("mask");
        PHONE.setMaskingChar("*");
        PHONE.setCharsToMask(4);
        PHONE.setFromEnd(true);

        AnonymizeRequest anonymizeRequest = new AnonymizeRequest();

        anonymizeRequest.setText(text);

        anonymizeRequest.putAnonymizersItem("DEFAULT", REPLACE);
        anonymizeRequest.putAnonymizersItem("PHONE_NUMBER", PHONE);

        recognizerResults
            .stream()
            .map(r -> {
                RecognizerResult recognizerResult = new RecognizerResult();
                recognizerResult.setEnd(r.getEnd());
                recognizerResult.setEntityType(r.getEntityType());
                recognizerResult.setStart(r.getStart());
                recognizerResult.setScore(r.getScore());

                return recognizerResult;
            })
            .forEach(anonymizeRequest::addAnalyzerResultsItem);

        AnonymizeResponse anonymizeResponse = anonymizer.anonymizePost(anonymizeRequest);

        assertThat(anonymizeResponse.getText())
            .isEqualTo("hello world, my name is ANONYMIZED. My number is: 03445****");
        assertThat(anonymizeResponse.getItems()).hasSize(2);

    }
}
