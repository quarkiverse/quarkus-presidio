package io.quarkiverse.presidio.runtime.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AnalyzeRequest {

    private String text;
    private String language;
    private String correlationId;
    private Double scoreThreshold;
    private List<String> entities;
    private Boolean returnDecisionProcess;
    private List<PatternRecognizer> adHocRecognizers;
    private List<String> context;

    /**
     * The text to analyze
     *
     * @return text
     **/
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Set text
     **/
    public void setText(String text) {
        this.text = text;
    }

    public AnalyzeRequest text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Two characters for the desired language in ISO_639-1 format
     *
     * @return language
     **/
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * Set language
     **/
    public void setLanguage(String language) {
        this.language = language;
    }

    public AnalyzeRequest language(String language) {
        this.language = language;
        return this;
    }

    /**
     * A correlation id to append to headers and traces
     *
     * @return correlationId
     **/
    @JsonProperty("correlation_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Set correlationId
     **/
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public AnalyzeRequest correlationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * The minimal detection score threshold
     *
     * @return scoreThreshold
     **/
    @JsonProperty("score_threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getScoreThreshold() {
        return scoreThreshold;
    }

    /**
     * Set scoreThreshold
     **/
    public void setScoreThreshold(Double scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }

    public AnalyzeRequest scoreThreshold(Double scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }

    /**
     * A list of entities to analyze
     *
     * @return entities
     **/
    @JsonProperty("entities")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getEntities() {
        return entities;
    }

    /**
     * Set entities
     **/
    public void setEntities(List<String> entities) {
        this.entities = entities;
    }

    public AnalyzeRequest entities(List<String> entities) {
        this.entities = entities;
        return this;
    }

    public AnalyzeRequest addEntitiesItem(String entitiesItem) {
        if (this.entities == null) {
            entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public AnalyzeRequest entities(SupportedEntities... entities) {
        this.setEntities(Arrays.stream(entities)
                .map(SupportedEntities::name)
                .toList());
        return this;
    }

    public AnalyzeRequest addEntitiesItem(SupportedEntities supportedEntities) {
        return this.addEntitiesItem(supportedEntities.name());
    }

    /**
     * Whether to include analysis explanation in the response
     *
     * @return returnDecisionProcess
     **/
    @JsonProperty("return_decision_process")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getReturnDecisionProcess() {
        return returnDecisionProcess;
    }

    /**
     * Set returnDecisionProcess
     **/
    public void setReturnDecisionProcess(Boolean returnDecisionProcess) {
        this.returnDecisionProcess = returnDecisionProcess;
    }

    public AnalyzeRequest returnDecisionProcess(Boolean returnDecisionProcess) {
        this.returnDecisionProcess = returnDecisionProcess;
        return this;
    }

    /**
     * list of recognizers to be used in the context of this request only (ad-hoc).
     *
     * @return adHocRecognizers
     **/
    @JsonProperty("ad_hoc_recognizers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PatternRecognizer> getAdHocRecognizers() {
        return adHocRecognizers;
    }

    /**
     * Set adHocRecognizers
     **/
    public void setAdHocRecognizers(List<PatternRecognizer> adHocRecognizers) {
        this.adHocRecognizers = adHocRecognizers;
    }

    public AnalyzeRequest adHocRecognizers(List<PatternRecognizer> adHocRecognizers) {
        this.adHocRecognizers = adHocRecognizers;
        return this;
    }

    public AnalyzeRequest addAdHocRecognizersItem(PatternRecognizer adHocRecognizersItem) {
        if (this.adHocRecognizers == null) {
            adHocRecognizers = new ArrayList<>();
        }
        this.adHocRecognizers.add(adHocRecognizersItem);
        return this;
    }

    /**
     * list of context words which may help to raise recognized entities confidence
     *
     * @return context
     **/
    @JsonProperty("context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getContext() {
        return context;
    }

    /**
     * Set context
     **/
    public void setContext(List<String> context) {
        this.context = context;
    }

    public AnalyzeRequest context(List<String> context) {
        this.context = context;
        return this;
    }

    public AnalyzeRequest addContextItem(String contextItem) {
        if (this.context == null) {
            context = new ArrayList<>();
        }
        this.context.add(contextItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyzeRequest {\n");

        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
        sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    returnDecisionProcess: ").append(toIndentedString(returnDecisionProcess)).append("\n");
        sb.append("    adHocRecognizers: ").append(toIndentedString(adHocRecognizers)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AnalyzeRequestQueryParam {

        @QueryParam("text")
        private String text;
        @QueryParam("language")
        private String language;
        @QueryParam("correlationId")
        private String correlationId;
        @QueryParam("scoreThreshold")
        private Double scoreThreshold;
        @QueryParam("entities")
        private List<String> entities = null;
        @QueryParam("returnDecisionProcess")
        private Boolean returnDecisionProcess;
        @QueryParam("adHocRecognizers")
        private List<PatternRecognizer> adHocRecognizers = null;
        @QueryParam("context")
        private List<String> context = null;

        /**
         * The text to analyze
         *
         * @return text
         **/
        @JsonProperty("text")
        public String getText() {
            return text;
        }

        /**
         * Set text
         **/
        public void setText(String text) {
            this.text = text;
        }

        public AnalyzeRequestQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Two characters for the desired language in ISO_639-1 format
         *
         * @return language
         **/
        @JsonProperty("language")
        public String getLanguage() {
            return language;
        }

        /**
         * Set language
         **/
        public void setLanguage(String language) {
            this.language = language;
        }

        public AnalyzeRequestQueryParam language(String language) {
            this.language = language;
            return this;
        }

        /**
         * A correlation id to append to headers and traces
         *
         * @return correlationId
         **/
        @JsonProperty("correlation_id")
        public String getCorrelationId() {
            return correlationId;
        }

        /**
         * Set correlationId
         **/
        public void setCorrelationId(String correlationId) {
            this.correlationId = correlationId;
        }

        public AnalyzeRequestQueryParam correlationId(String correlationId) {
            this.correlationId = correlationId;
            return this;
        }

        /**
         * The minimal detection score threshold
         *
         * @return scoreThreshold
         **/
        @JsonProperty("score_threshold")
        public Double getScoreThreshold() {
            return scoreThreshold;
        }

        /**
         * Set scoreThreshold
         **/
        public void setScoreThreshold(Double scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
        }

        public AnalyzeRequestQueryParam scoreThreshold(Double scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }

        /**
         * A list of entities to analyze
         *
         * @return entities
         **/
        @JsonProperty("entities")
        public List<String> getEntities() {
            return entities;
        }

        /**
         * Set entities
         **/
        public void setEntities(List<String> entities) {
            this.entities = entities;
        }

        public AnalyzeRequestQueryParam entities(List<String> entities) {
            this.entities = entities;
            return this;
        }

        public AnalyzeRequestQueryParam addEntitiesItem(String entitiesItem) {
            this.entities.add(entitiesItem);
            return this;
        }

        /**
         * Whether to include analysis explanation in the response
         *
         * @return returnDecisionProcess
         **/
        @JsonProperty("return_decision_process")
        public Boolean getReturnDecisionProcess() {
            return returnDecisionProcess;
        }

        /**
         * Set returnDecisionProcess
         **/
        public void setReturnDecisionProcess(Boolean returnDecisionProcess) {
            this.returnDecisionProcess = returnDecisionProcess;
        }

        public AnalyzeRequestQueryParam returnDecisionProcess(Boolean returnDecisionProcess) {
            this.returnDecisionProcess = returnDecisionProcess;
            return this;
        }

        /**
         * list of recognizers to be used in the context of this request only (ad-hoc).
         *
         * @return adHocRecognizers
         **/
        @JsonProperty("ad_hoc_recognizers")
        public List<PatternRecognizer> getAdHocRecognizers() {
            return adHocRecognizers;
        }

        /**
         * Set adHocRecognizers
         **/
        public void setAdHocRecognizers(List<PatternRecognizer> adHocRecognizers) {
            this.adHocRecognizers = adHocRecognizers;
        }

        public AnalyzeRequestQueryParam adHocRecognizers(List<PatternRecognizer> adHocRecognizers) {
            this.adHocRecognizers = adHocRecognizers;
            return this;
        }

        public AnalyzeRequestQueryParam addAdHocRecognizersItem(PatternRecognizer adHocRecognizersItem) {
            this.adHocRecognizers.add(adHocRecognizersItem);
            return this;
        }

        /**
         * list of context words which may help to raise recognized entities confidence
         *
         * @return context
         **/
        @JsonProperty("context")
        public List<String> getContext() {
            return context;
        }

        /**
         * Set context
         **/
        public void setContext(List<String> context) {
            this.context = context;
        }

        public AnalyzeRequestQueryParam context(List<String> context) {
            this.context = context;
            return this;
        }

        public AnalyzeRequestQueryParam addContextItem(String contextItem) {
            this.context.add(contextItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnalyzeRequestQueryParam {\n");

            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    language: ").append(toIndentedString(language)).append("\n");
            sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
            sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
            sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
            sb.append("    returnDecisionProcess: ").append(toIndentedString(returnDecisionProcess)).append("\n");
            sb.append("    adHocRecognizers: ").append(toIndentedString(adHocRecognizers)).append("\n");
            sb.append("    context: ").append(toIndentedString(context)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}
