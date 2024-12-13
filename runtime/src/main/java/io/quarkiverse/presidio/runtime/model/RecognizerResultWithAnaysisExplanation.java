package io.quarkiverse.presidio.runtime.model;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecognizerResultWithAnaysisExplanation extends RecognizerResult {

    private AnalysisExplanation analysisExplanation;

    /**
     * Get analysisExplanation
     *
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
    public static class RecognizerResultWithAnaysisExplanationQueryParam extends RecognizerResultQueryParam {

        @QueryParam("analysisExplanation")
        private AnalysisExplanation analysisExplanation;

        /**
         * Get analysisExplanation
         *
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
