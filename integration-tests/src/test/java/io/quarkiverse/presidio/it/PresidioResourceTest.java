package io.quarkiverse.presidio.it;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;

import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkiverse.presidio.runtime.model.AnonymizeRequest;
import io.quarkiverse.presidio.runtime.model.AnonymizeRequestAnonymizersValue;
import io.quarkiverse.presidio.runtime.model.AnonymizeResponse;
import io.quarkiverse.presidio.runtime.model.RecognizerResult;
import io.quarkiverse.presidio.runtime.model.RecognizerResultWithAnaysisExplanation;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PresidioResourceTest {

    @Inject
    PresidioService presidioService;

    @Test
    public void shouldAnalyzeText() {

        List<RecognizerResultWithAnaysisExplanation> recognizerResultWithAnaysisExplanations = presidioService
                .analyze("John Smith drivers license is AC432223", "en");

        assertThat(recognizerResultWithAnaysisExplanations).hasSize(2);

        final RecognizerResultWithAnaysisExplanation personEntity = recognizerResultWithAnaysisExplanations.get(0);
        assertThat(personEntity.getEntityType()).isEqualTo("PERSON");
        assertThat(personEntity.getStart()).isEqualTo(0);
        assertThat(personEntity.getEnd()).isEqualTo(10);

        int lastElementPosition = recognizerResultWithAnaysisExplanations.size() - 1;

        final RecognizerResultWithAnaysisExplanation driverLicenseEntity = recognizerResultWithAnaysisExplanations
                .get(lastElementPosition);
        assertThat(driverLicenseEntity.getEntityType()).isEqualTo("US_DRIVER_LICENSE");
        assertThat(driverLicenseEntity.getStart()).isEqualTo(30);
        assertThat(driverLicenseEntity.getEnd()).isEqualTo(38);
    }

    @Test
    public void shouldAnonymizeData() {

        String text = "hello world, my name is Jane Doe. My number is: 034453334";

        List<RecognizerResultWithAnaysisExplanation> recognizerResults = presidioService.analyze(text, "en");
        AnonymizeResponse anonymizeResponse = this.presidioService.anonymize(text, recognizerResults);

        assertThat(anonymizeResponse.getText())
                .isEqualTo("hello world, my name is ANONYMIZED. My number is: 03445****");
        assertThat(anonymizeResponse.getItems()).hasSize(2);

    }
}
