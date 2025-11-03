package io.quarkiverse.presidio.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.util.AnnotationLiteral;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkiverse.presidio.runtime.model.AnalyzeRequest;
import io.quarkiverse.presidio.runtime.model.AnonymizeRequest;
import io.quarkiverse.presidio.runtime.model.Operator;
import io.quarkiverse.presidio.runtime.model.RecognizerResultWithAnaysisExplanation;
import io.quarkiverse.presidio.runtime.model.SupportedEntities;

public class PresidioPipeline {

    private final Analyzer analyzer;
    private final Anonymizer anonymizer;
    private final List<String> entities;
    private final Map<String, Operator> anonymizers;

    public PresidioPipeline(Analyzer analyzer, Anonymizer anonymizer,
            List<String> entities,
            Map<String, Operator> anonymizers) {
        this.analyzer = analyzer;
        this.anonymizer = anonymizer;
        this.entities = entities;
        this.anonymizers = anonymizers;
    }

    public String process(String text, String language) {
        AnalyzeRequest analyzeRequest = new AnalyzeRequest();
        analyzeRequest.text(text);
        analyzeRequest.language(language);

        if (!this.entities.isEmpty()) {
            analyzeRequest.setEntities(this.entities);
        }

        List<RecognizerResultWithAnaysisExplanation> recognizerResults = this.analyzer.analyzePost(analyzeRequest);

        AnonymizeRequest anonymizeRequest = new AnonymizeRequest();
        anonymizeRequest.setText(text);

        if (!this.anonymizers.isEmpty()) {
            anonymizeRequest.setAnonymizers(this.anonymizers);
        }

        anonymizeRequest.analyzerResults(
                Collections.unmodifiableList(recognizerResults));

        return this.anonymizer
                .anonymizePost(anonymizeRequest)
                .getText();
    }

    public static Builder builder(Analyzer analyzer, Anonymizer anonymizer) {
        return new Builder(analyzer, anonymizer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Analyzer analyzer;
        private Anonymizer anonymizer;
        private List<String> entities = new ArrayList<>();
        private Map<String, Operator> anonymizers = new HashMap<>();

        public Builder() {
            this.analyzer = CDI.current().select(Analyzer.class, new AnnotationLiteral<RestClient>() {
            }).get();
            this.anonymizer = CDI.current().select(Anonymizer.class, new AnnotationLiteral<RestClient>() {
            }).get();
        }

        public Builder(Analyzer analyzer, Anonymizer anonymizer) {
            this.analyzer = analyzer;
            this.anonymizer = anonymizer;
        }

        public Builder entities(String... entities) {
            this.entities.addAll(List.of(entities));
            return this;
        }

        public Builder withSupportedEntities(SupportedEntities... entities) {
            this.entities.addAll(Arrays.stream(entities)
                    .map(SupportedEntities::name)
                    .toList());
            return this;
        }

        public Builder withSupportedAnonymizers(Map<SupportedEntities, Operator> anonymizers) {
            Set<Map.Entry<SupportedEntities, Operator>> entries = anonymizers.entrySet();
            for (Map.Entry<SupportedEntities, Operator> entry : entries) {
                this.anonymizers.put(entry.getKey().name(), entry.getValue());
            }
            return this;
        }

        public Builder anonymizers(Map<String, Operator> anonymizers) {
            this.anonymizers.putAll(anonymizers);
            return this;
        }

        public PresidioPipeline build() {
            return new PresidioPipeline(this.analyzer, this.anonymizer,
                    this.entities, this.anonymizers);
        }
    }
}
