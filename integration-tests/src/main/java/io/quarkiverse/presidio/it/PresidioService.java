package io.quarkiverse.presidio.it;

import java.util.Collections;
import java.util.List;

import io.quarkiverse.presidio.runtime.model.*;
import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkiverse.presidio.runtime.Analyzer;
import io.quarkiverse.presidio.runtime.Anonymizer;

@ApplicationScoped
public class PresidioService {

    @RestClient
    Analyzer analyzer;

    @RestClient
    Anonymizer anonymizer;

    static AnonymizeRequestAnonymizersValue REPLACE = new AnonymizeRequestAnonymizersValue();
    static AnonymizeRequestAnonymizersValue PHONE = new AnonymizeRequestAnonymizersValue();

    public PresidioService() {

        REPLACE.setType("replace");
        REPLACE.setNewValue("ANONYMIZED");

        PHONE.setType("mask");
        PHONE.setMaskingChar("*");
        PHONE.setCharsToMask(4);
        PHONE.setFromEnd(true);

    }

    public List<RecognizerResultWithAnaysisExplanation> analyze(String text, String language) {
        AnalyzeRequest analyzeRequest = new AnalyzeRequest();
        analyzeRequest.text(text);
        analyzeRequest.language(language);

        return analyzer
                .analyzePost(analyzeRequest);
    }

    public AnonymizeResponse anonymize(String text, List<RecognizerResultWithAnaysisExplanation> recognizerResults) {

        AnonymizeRequest anonymizeRequest = new AnonymizeRequest();

        anonymizeRequest.setText(text);

        anonymizeRequest.putAnonymizersItem("DEFAULT", REPLACE);
        anonymizeRequest.putAnonymizersItem("PHONE_NUMBER", PHONE);
        anonymizeRequest.analyzerResults(
                Collections.unmodifiableList(recognizerResults)
        );


        return this.anonymizer.anonymizePost(anonymizeRequest);
    }
}
