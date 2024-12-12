package io.quarkiverse.presidio.it;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkiverse.presidio.runtime.Analyzer;
import io.quarkiverse.presidio.runtime.Anonymizer;
import io.quarkiverse.presidio.runtime.model.AnalyzeRequest;
import io.quarkiverse.presidio.runtime.model.AnonymizeRequest;
import io.quarkiverse.presidio.runtime.model.AnonymizeResponse;
import io.quarkiverse.presidio.runtime.model.RecognizerResultWithAnaysisExplanation;

@ApplicationScoped
public class PresidioService {

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

    public AnonymizeResponse anonymize(AnonymizeRequest anonymizeRequest) {
        return this.anonymizer.anonymizePost(anonymizeRequest);
    }
}
