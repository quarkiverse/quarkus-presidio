package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.ws.rs.QueryParam;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecognizerResultWithAnaysisExplanation  {

    private Integer start;
    private Integer end;
    private Double score;
    private String entityType;
    private RecognizedMetadata recognitionMetadata;
    private AnalysisExplanation analysisExplanation;

    /**
    * Where the PII starts
    * @return start
    **/
    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    /**
     * Set start
     **/
    public void setStart(Integer start) {
        this.start = start;
    }

    public RecognizerResultWithAnaysisExplanation start(Integer start) {
        this.start = start;
        return this;
    }

    /**
    * Where the PII ends
    * @return end
    **/
    @JsonProperty("end")
    public Integer getEnd() {
        return end;
    }

    /**
     * Set end
     **/
    public void setEnd(Integer end) {
        this.end = end;
    }

    public RecognizerResultWithAnaysisExplanation end(Integer end) {
        this.end = end;
        return this;
    }

    /**
    * The PII detection score
    * @return score
    **/
    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    /**
     * Set score
     **/
    public void setScore(Double score) {
        this.score = score;
    }

    public RecognizerResultWithAnaysisExplanation score(Double score) {
        this.score = score;
        return this;
    }

    /**
    * The supported PII entity types.
    * @return entityType
    **/
    @JsonProperty("entity_type")
    public String getEntityType() {
        return entityType;
    }

    /**
     * Set entityType
     **/
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public RecognizerResultWithAnaysisExplanation entityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
    * Get recognitionMetadata
    * @return recognitionMetadata
    **/
    @JsonProperty("recognition_metadata")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public RecognizedMetadata getRecognitionMetadata() {
        return recognitionMetadata;
    }

    /**
     * Set recognitionMetadata
     **/
    public void setRecognitionMetadata(RecognizedMetadata recognitionMetadata) {
        this.recognitionMetadata = recognitionMetadata;
    }

    public RecognizerResultWithAnaysisExplanation recognitionMetadata(RecognizedMetadata recognitionMetadata) {
        this.recognitionMetadata = recognitionMetadata;
        return this;
    }

    /**
    * Get analysisExplanation
    * @return analysisExplanation
    **/
    @JsonProperty("analysis_explanation")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public AnalysisExplanation getAnalysisExplanation() {
        return analysisExplanation;
    }

    /**
     * Set analysisExplanation
     **/
    public void setAnalysisExplanation(AnalysisExplanation analysisExplanation) {
        this.analysisExplanation = analysisExplanation;
    }

    public RecognizerResultWithAnaysisExplanation analysisExplanation(AnalysisExplanation analysisExplanation) {
        this.analysisExplanation = analysisExplanation;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizerResultWithAnaysisExplanation {\n");

        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    recognitionMetadata: ").append(toIndentedString(recognitionMetadata)).append("\n");
        sb.append("    analysisExplanation: ").append(toIndentedString(analysisExplanation)).append("\n");
        
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
    public static class RecognizerResultWithAnaysisExplanationQueryParam  {

        @QueryParam("start")
        private Integer start;
        @QueryParam("end")
        private Integer end;
        @QueryParam("score")
        private Double score;
        @QueryParam("entityType")
        private String entityType;
        @QueryParam("recognitionMetadata")
        private RecognizedMetadata recognitionMetadata;
        @QueryParam("analysisExplanation")
        private AnalysisExplanation analysisExplanation;

        /**
        * Where the PII starts
        * @return start
        **/
        @JsonProperty("start")
        public Integer getStart() {
            return start;
        }

        /**
         * Set start
         **/
        public void setStart(Integer start) {
            this.start = start;
        }

        public RecognizerResultWithAnaysisExplanationQueryParam start(Integer start) {
            this.start = start;
            return this;
        }

        /**
        * Where the PII ends
        * @return end
        **/
        @JsonProperty("end")
        public Integer getEnd() {
            return end;
        }

        /**
         * Set end
         **/
        public void setEnd(Integer end) {
            this.end = end;
        }

        public RecognizerResultWithAnaysisExplanationQueryParam end(Integer end) {
            this.end = end;
            return this;
        }

        /**
        * The PII detection score
        * @return score
        **/
        @JsonProperty("score")
        public Double getScore() {
            return score;
        }

        /**
         * Set score
         **/
        public void setScore(Double score) {
            this.score = score;
        }

        public RecognizerResultWithAnaysisExplanationQueryParam score(Double score) {
            this.score = score;
            return this;
        }

        /**
        * The supported PII entity types.
        * @return entityType
        **/
        @JsonProperty("entity_type")
        public String getEntityType() {
            return entityType;
        }

        /**
         * Set entityType
         **/
        public void setEntityType(String entityType) {
            this.entityType = entityType;
        }

        public RecognizerResultWithAnaysisExplanationQueryParam entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
        * Get recognitionMetadata
        * @return recognitionMetadata
        **/
        @JsonProperty("recognition_metadata")
        public RecognizedMetadata getRecognitionMetadata() {
            return recognitionMetadata;
        }

        /**
         * Set recognitionMetadata
         **/
        public void setRecognitionMetadata(RecognizedMetadata recognitionMetadata) {
            this.recognitionMetadata = recognitionMetadata;
        }

        public RecognizerResultWithAnaysisExplanationQueryParam recognitionMetadata(RecognizedMetadata recognitionMetadata) {
            this.recognitionMetadata = recognitionMetadata;
            return this;
        }

        /**
        * Get analysisExplanation
        * @return analysisExplanation
        **/
        @JsonProperty("analysis_explanation")
        public AnalysisExplanation getAnalysisExplanation() {
            return analysisExplanation;
        }

        /**
         * Set analysisExplanation
         **/
        public void setAnalysisExplanation(AnalysisExplanation analysisExplanation) {
            this.analysisExplanation = analysisExplanation;
        }

        public RecognizerResultWithAnaysisExplanationQueryParam analysisExplanation(AnalysisExplanation analysisExplanation) {
            this.analysisExplanation = analysisExplanation;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RecognizerResultWithAnaysisExplanationQueryParam {\n");

            sb.append("    start: ").append(toIndentedString(start)).append("\n");
            sb.append("    end: ").append(toIndentedString(end)).append("\n");
            sb.append("    score: ").append(toIndentedString(score)).append("\n");
            sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
            sb.append("    recognitionMetadata: ").append(toIndentedString(recognitionMetadata)).append("\n");
            sb.append("    analysisExplanation: ").append(toIndentedString(analysisExplanation)).append("\n");
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