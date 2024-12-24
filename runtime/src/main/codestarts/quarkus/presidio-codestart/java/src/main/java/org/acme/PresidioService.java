package org.acme;

import io.quarkiverse.presidio.runtime.Analyzer;
import io.quarkiverse.presidio.runtime.Anonymizer;
import io.quarkiverse.presidio.runtime.model.AnalyzeRequest;
import io.quarkiverse.presidio.runtime.model.AnonymizeRequest;
import io.quarkiverse.presidio.runtime.model.AnonymizeResponse;
import io.quarkiverse.presidio.runtime.model.Mask;
import io.quarkiverse.presidio.runtime.model.RecognizerResultWithAnaysisExplanation;
import io.quarkiverse.presidio.runtime.model.Redact;
import io.quarkiverse.presidio.runtime.model.Replace;

import java.util.Collections;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class PresidioService {

    @RestClient
    Analyzer analyzer;

    @RestClient
    Anonymizer anonymizer;

    public String process(String text) {
        final List<RecognizerResultWithAnaysisExplanation> analyzed = analyze(text, "en");
        return anonymize(text, analyzed).getText();
    }

    private List<RecognizerResultWithAnaysisExplanation> analyze(String text, String language) {
        AnalyzeRequest analyzeRequest = new AnalyzeRequest();
        analyzeRequest.text(text);
        analyzeRequest.language(language);

        return analyzer
            .analyzePost(analyzeRequest);
    }

    static Replace REPLACE = new Replace("ANONYMIZED");
    static Mask MASK = new Mask("*", 4, true);
    static Redact REDACT = new Redact();

    private AnonymizeResponse anonymize(String text, List<RecognizerResultWithAnaysisExplanation> recognizerResults) {

        AnonymizeRequest anonymizeRequest = new AnonymizeRequest();

        anonymizeRequest.setText(text);

        anonymizeRequest.putAnonymizersItem("DEFAULT", REPLACE);
        anonymizeRequest.putAnonymizersItem("PHONE_NUMBER", MASK);
        anonymizeRequest.putAnonymizersItem("EMAIL_ADDRESS", REDACT);
        anonymizeRequest.analyzerResults(
            Collections.unmodifiableList(recognizerResults));

        return this.anonymizer.anonymizePost(anonymizeRequest);
    }

}