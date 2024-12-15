package io.quarkiverse.presidio.runtime.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeanonymizeRequest {

    private String text;
    private Map<String, Operator> deanonymizers = new HashMap<>();
    private List<OperatorResult> anonymizerResults = new ArrayList<>();

    /**
     * The anonymized text
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

    public DeanonymizeRequest text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Object where the key is DEFAULT or the ENTITY_TYPE and the value is decrypt since it is the only one supported
     *
     * @return deanonymizers
     **/
    @JsonProperty("deanonymizers")
    public Map<String, Operator> getDeanonymizers() {
        return deanonymizers;
    }

    /**
     * Set deanonymizers
     **/
    public void setDeanonymizers(Map<String, Operator> deanonymizers) {
        this.deanonymizers = deanonymizers;
    }

    public DeanonymizeRequest deanonymizers(Map<String, Operator> deanonymizers) {
        this.deanonymizers = deanonymizers;
        return this;
    }

    public DeanonymizeRequest putDeanonymizersItem(String key, Operator deanonymizersItem) {
        if (this.deanonymizers == null) {
            deanonymizers = new HashMap<>();
        }
        this.deanonymizers.put(key, deanonymizersItem);
        return this;
    }

    /**
     * Array of anonymized PIIs
     *
     * @return anonymizerResults
     **/
    @JsonProperty("anonymizer_results")
    public List<OperatorResult> getAnonymizerResults() {
        return anonymizerResults;
    }

    /**
     * Set anonymizerResults
     **/
    public void setAnonymizerResults(List<OperatorResult> anonymizerResults) {
        this.anonymizerResults = anonymizerResults;
    }

    public DeanonymizeRequest anonymizerResults(List<OperatorResult> anonymizerResults) {
        this.anonymizerResults = anonymizerResults;
        return this;
    }

    public DeanonymizeRequest addAnonymizerResultsItem(OperatorResult anonymizerResultsItem) {
        if (this.anonymizerResults == null) {
            anonymizerResults = new ArrayList<>();
        }
        this.anonymizerResults.add(anonymizerResultsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeanonymizeRequest {\n");

        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    deanonymizers: ").append(toIndentedString(deanonymizers)).append("\n");
        sb.append("    anonymizerResults: ").append(toIndentedString(anonymizerResults)).append("\n");

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
    public static class DeanonymizeRequestQueryParam {

        @QueryParam("text")
        private String text;
        @QueryParam("deanonymizers")
        private Map<String, OperatorQueryParam> deanonymizers = null;
        @QueryParam("anonymizerResults")
        private List<OperatorResult> anonymizerResults = null;

        /**
         * The anonymized text
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

        public DeanonymizeRequestQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Object where the key is DEFAULT or the ENTITY_TYPE and the value is decrypt since it is the only one supported
         *
         * @return deanonymizers
         **/
        @JsonProperty("deanonymizers")
        public Map<String, OperatorQueryParam> getDeanonymizers() {
            return deanonymizers;
        }

        /**
         * Set deanonymizers
         **/
        public void setDeanonymizers(Map<String, OperatorQueryParam> deanonymizers) {
            this.deanonymizers = deanonymizers;
        }

        public DeanonymizeRequestQueryParam deanonymizers(Map<String, OperatorQueryParam> deanonymizers) {
            this.deanonymizers = deanonymizers;
            return this;
        }

        public DeanonymizeRequestQueryParam putDeanonymizersItem(String key,
                OperatorQueryParam deanonymizersItem) {
            this.deanonymizers.put(key, deanonymizersItem);
            return this;
        }

        /**
         * Array of anonymized PIIs
         *
         * @return anonymizerResults
         **/
        @JsonProperty("anonymizer_results")
        public List<OperatorResult> getAnonymizerResults() {
            return anonymizerResults;
        }

        /**
         * Set anonymizerResults
         **/
        public void setAnonymizerResults(List<OperatorResult> anonymizerResults) {
            this.anonymizerResults = anonymizerResults;
        }

        public DeanonymizeRequestQueryParam anonymizerResults(List<OperatorResult> anonymizerResults) {
            this.anonymizerResults = anonymizerResults;
            return this;
        }

        public DeanonymizeRequestQueryParam addAnonymizerResultsItem(OperatorResult anonymizerResultsItem) {
            this.anonymizerResults.add(anonymizerResultsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DeanonymizeRequestQueryParam {\n");

            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    deanonymizers: ").append(toIndentedString(deanonymizers)).append("\n");
            sb.append("    anonymizerResults: ").append(toIndentedString(anonymizerResults)).append("\n");
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
