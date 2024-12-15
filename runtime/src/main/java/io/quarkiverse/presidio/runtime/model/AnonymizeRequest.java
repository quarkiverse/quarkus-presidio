package io.quarkiverse.presidio.runtime.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AnonymizeRequest {

    private String text;
    private Map<String, Operator> anonymizers;
    private List<RecognizerResult> analyzerResults = new ArrayList<>();

    /**
     * The text to anonymize
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

    public AnonymizeRequest text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Object where the key is DEFAULT or the ENTITY_TYPE and the value is the anonymizer definition
     *
     * @return anonymizers
     **/
    @JsonProperty("anonymizers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, Operator> getAnonymizers() {
        return anonymizers;
    }

    /**
     * Set anonymizers
     **/
    public void setAnonymizers(Map<String, Operator> anonymizers) {
        this.anonymizers = anonymizers;
    }

    public AnonymizeRequest anonymizers(Map<String, Operator> anonymizers) {
        this.anonymizers = anonymizers;
        return this;
    }

    public AnonymizeRequest putAnonymizersItem(String key, Operator anonymizersItem) {
        if (this.anonymizers == null) {
            anonymizers = new HashMap<>();
        }
        this.anonymizers.put(key, anonymizersItem);
        return this;
    }

    /**
     * Array of analyzer detections
     *
     * @return analyzerResults
     **/
    @JsonProperty("analyzer_results")
    public List<RecognizerResult> getAnalyzerResults() {
        return analyzerResults;
    }

    /**
     * Set analyzerResults
     **/
    public void setAnalyzerResults(List<RecognizerResult> analyzerResults) {
        this.analyzerResults = analyzerResults;
    }

    public AnonymizeRequest analyzerResults(List<RecognizerResult> analyzerResults) {
        this.analyzerResults = analyzerResults;
        return this;
    }

    public AnonymizeRequest addAnalyzerResultsItem(RecognizerResult analyzerResultsItem) {
        if (this.analyzerResults == null) {
            analyzerResults = new ArrayList<>();
        }
        this.analyzerResults.add(analyzerResultsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnonymizeRequest {\n");

        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    anonymizers: ").append(toIndentedString(anonymizers)).append("\n");
        sb.append("    analyzerResults: ").append(toIndentedString(analyzerResults)).append("\n");

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
    public static class AnonymizeRequestQueryParam {

        @QueryParam("text")
        private String text;
        @QueryParam("anonymizers")
        private Map<String, OperatorQueryParam> anonymizers = null;
        @QueryParam("analyzerResults")
        private List<RecognizerResult> analyzerResults = null;

        /**
         * The text to anonymize
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

        public AnonymizeRequestQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Object where the key is DEFAULT or the ENTITY_TYPE and the value is the anonymizer definition
         *
         * @return anonymizers
         **/
        @JsonProperty("anonymizers")
        public Map<String, OperatorQueryParam> getAnonymizers() {
            return anonymizers;
        }

        /**
         * Set anonymizers
         **/
        public void setAnonymizers(Map<String, OperatorQueryParam> anonymizers) {
            this.anonymizers = anonymizers;
        }

        public AnonymizeRequestQueryParam anonymizers(Map<String, OperatorQueryParam> anonymizers) {
            this.anonymizers = anonymizers;
            return this;
        }

        public AnonymizeRequestQueryParam putAnonymizersItem(String key, OperatorQueryParam anonymizersItem) {
            this.anonymizers.put(key, anonymizersItem);
            return this;
        }

        /**
         * Array of analyzer detections
         *
         * @return analyzerResults
         **/
        @JsonProperty("analyzer_results")
        public List<RecognizerResult> getAnalyzerResults() {
            return analyzerResults;
        }

        /**
         * Set analyzerResults
         **/
        public void setAnalyzerResults(List<RecognizerResult> analyzerResults) {
            this.analyzerResults = analyzerResults;
        }

        public AnonymizeRequestQueryParam analyzerResults(List<RecognizerResult> analyzerResults) {
            this.analyzerResults = analyzerResults;
            return this;
        }

        public AnonymizeRequestQueryParam addAnalyzerResultsItem(RecognizerResult analyzerResultsItem) {
            this.analyzerResults.add(analyzerResultsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnonymizeRequestQueryParam {\n");

            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    anonymizers: ").append(toIndentedString(anonymizers)).append("\n");
            sb.append("    analyzerResults: ").append(toIndentedString(analyzerResults)).append("\n");
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
