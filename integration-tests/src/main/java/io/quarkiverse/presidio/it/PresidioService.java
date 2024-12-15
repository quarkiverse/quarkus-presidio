package io.quarkiverse.presidio.it;

import java.util.Collections;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkiverse.presidio.runtime.Analyzer;
import io.quarkiverse.presidio.runtime.Anonymizer;
import io.quarkiverse.presidio.runtime.model.*;

@ApplicationScoped
public class PresidioService {

    static Replace REPLACE = new Replace("ANONYMIZED");
    static Mask PHONE = new Mask("*", 4, true);

    @RestClient
    Analyzer analyzer;

    @RestClient
    Anonymizer anonymizer;

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
                Collections.unmodifiableList(recognizerResults));

        return this.anonymizer.anonymizePost(anonymizeRequest);
    }
}
