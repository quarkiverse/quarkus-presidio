package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AnalysisExplanation {

    private String recognizer;
    private String patternName;
    private String pattern;
    private Double originalScore;
    private Double score;
    private String textualExplanation;
    private Double scoreContextImprovement;
    private String supportiveContextWord;
    private Double validationResult;

    /**
     * Name of recognizer that made the decision
     *
     * @return recognizer
     **/
    @JsonProperty("recognizer")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRecognizer() {
        return recognizer;
    }

    /**
     * Set recognizer
     **/
    public void setRecognizer(String recognizer) {
        this.recognizer = recognizer;
    }

    public AnalysisExplanation recognizer(String recognizer) {
        this.recognizer = recognizer;
        return this;
    }

    /**
     * name of pattern (if decision was made by a PatternRecognizer)
     *
     * @return patternName
     **/
    @JsonProperty("pattern_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPatternName() {
        return patternName;
    }

    /**
     * Set patternName
     **/
    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    public AnalysisExplanation patternName(String patternName) {
        this.patternName = patternName;
        return this;
    }

    /**
     * Regex pattern that was applied (if PatternRecognizer)
     *
     * @return pattern
     **/
    @JsonProperty("pattern")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPattern() {
        return pattern;
    }

    /**
     * Set pattern
     **/
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public AnalysisExplanation pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Recognizer's confidence in result
     *
     * @return originalScore
     **/
    @JsonProperty("original_score")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Double getOriginalScore() {
        return originalScore;
    }

    /**
     * Set originalScore
     **/
    public void setOriginalScore(Double originalScore) {
        this.originalScore = originalScore;
    }

    public AnalysisExplanation originalScore(Double originalScore) {
        this.originalScore = originalScore;
        return this;
    }

    /**
     * The PII detection score
     *
     * @return score
     **/
    @JsonProperty("score")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Double getScore() {
        return score;
    }

    /**
     * Set score
     **/
    public void setScore(Double score) {
        this.score = score;
    }

    public AnalysisExplanation score(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Free text for describing a decision of a logic or model
     *
     * @return textualExplanation
     **/
    @JsonProperty("textual_explanation")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTextualExplanation() {
        return textualExplanation;
    }

    /**
     * Set textualExplanation
     **/
    public void setTextualExplanation(String textualExplanation) {
        this.textualExplanation = textualExplanation;
    }

    public AnalysisExplanation textualExplanation(String textualExplanation) {
        this.textualExplanation = textualExplanation;
        return this;
    }

    /**
     * Difference from the original score
     *
     * @return scoreContextImprovement
     **/
    @JsonProperty("score_context_improvement")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Double getScoreContextImprovement() {
        return scoreContextImprovement;
    }

    /**
     * Set scoreContextImprovement
     **/
    public void setScoreContextImprovement(Double scoreContextImprovement) {
        this.scoreContextImprovement = scoreContextImprovement;
    }

    public AnalysisExplanation scoreContextImprovement(Double scoreContextImprovement) {
        this.scoreContextImprovement = scoreContextImprovement;
        return this;
    }

    /**
     * The context word which helped increase the score
     *
     * @return supportiveContextWord
     **/
    @JsonProperty("supportive_context_word")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSupportiveContextWord() {
        return supportiveContextWord;
    }

    /**
     * Set supportiveContextWord
     **/
    public void setSupportiveContextWord(String supportiveContextWord) {
        this.supportiveContextWord = supportiveContextWord;
    }

    public AnalysisExplanation supportiveContextWord(String supportiveContextWord) {
        this.supportiveContextWord = supportiveContextWord;
        return this;
    }

    /**
     * Result of a validation (e.g. checksum)
     *
     * @return validationResult
     **/
    @JsonProperty("validation_result")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Double getValidationResult() {
        return validationResult;
    }

    /**
     * Set validationResult
     **/
    public void setValidationResult(Double validationResult) {
        this.validationResult = validationResult;
    }

    public AnalysisExplanation validationResult(Double validationResult) {
        this.validationResult = validationResult;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalysisExplanation {\n");

        sb.append("    recognizer: ").append(toIndentedString(recognizer)).append("\n");
        sb.append("    patternName: ").append(toIndentedString(patternName)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    originalScore: ").append(toIndentedString(originalScore)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    textualExplanation: ").append(toIndentedString(textualExplanation)).append("\n");
        sb.append("    scoreContextImprovement: ").append(toIndentedString(scoreContextImprovement)).append("\n");
        sb.append("    supportiveContextWord: ").append(toIndentedString(supportiveContextWord)).append("\n");
        sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");

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
    public static class AnalysisExplanationQueryParam {

        @jakarta.ws.rs.QueryParam("recognizer")
        private String recognizer;
        @jakarta.ws.rs.QueryParam("patternName")
        private String patternName;
        @jakarta.ws.rs.QueryParam("pattern")
        private String pattern;
        @jakarta.ws.rs.QueryParam("originalScore")
        private Double originalScore;
        @jakarta.ws.rs.QueryParam("score")
        private Double score;
        @jakarta.ws.rs.QueryParam("textualExplanation")
        private String textualExplanation;
        @jakarta.ws.rs.QueryParam("scoreContextImprovement")
        private Double scoreContextImprovement;
        @jakarta.ws.rs.QueryParam("supportiveContextWord")
        private String supportiveContextWord;
        @jakarta.ws.rs.QueryParam("validationResult")
        private Double validationResult;

        /**
         * Name of recognizer that made the decision
         *
         * @return recognizer
         **/
        @JsonProperty("recognizer")
        public String getRecognizer() {
            return recognizer;
        }

        /**
         * Set recognizer
         **/
        public void setRecognizer(String recognizer) {
            this.recognizer = recognizer;
        }

        public AnalysisExplanationQueryParam recognizer(String recognizer) {
            this.recognizer = recognizer;
            return this;
        }

        /**
         * name of pattern (if decision was made by a PatternRecognizer)
         *
         * @return patternName
         **/
        @JsonProperty("pattern_name")
        public String getPatternName() {
            return patternName;
        }

        /**
         * Set patternName
         **/
        public void setPatternName(String patternName) {
            this.patternName = patternName;
        }

        public AnalysisExplanationQueryParam patternName(String patternName) {
            this.patternName = patternName;
            return this;
        }

        /**
         * Regex pattern that was applied (if PatternRecognizer)
         *
         * @return pattern
         **/
        @JsonProperty("pattern")
        public String getPattern() {
            return pattern;
        }

        /**
         * Set pattern
         **/
        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public AnalysisExplanationQueryParam pattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        /**
         * Recognizer's confidence in result
         *
         * @return originalScore
         **/
        @JsonProperty("original_score")
        public Double getOriginalScore() {
            return originalScore;
        }

        /**
         * Set originalScore
         **/
        public void setOriginalScore(Double originalScore) {
            this.originalScore = originalScore;
        }

        public AnalysisExplanationQueryParam originalScore(Double originalScore) {
            this.originalScore = originalScore;
            return this;
        }

        /**
         * The PII detection score
         *
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

        public AnalysisExplanationQueryParam score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * Free text for describing a decision of a logic or model
         *
         * @return textualExplanation
         **/
        @JsonProperty("textual_explanation")
        public String getTextualExplanation() {
            return textualExplanation;
        }

        /**
         * Set textualExplanation
         **/
        public void setTextualExplanation(String textualExplanation) {
            this.textualExplanation = textualExplanation;
        }

        public AnalysisExplanationQueryParam textualExplanation(String textualExplanation) {
            this.textualExplanation = textualExplanation;
            return this;
        }

        /**
         * Difference from the original score
         *
         * @return scoreContextImprovement
         **/
        @JsonProperty("score_context_improvement")
        public Double getScoreContextImprovement() {
            return scoreContextImprovement;
        }

        /**
         * Set scoreContextImprovement
         **/
        public void setScoreContextImprovement(Double scoreContextImprovement) {
            this.scoreContextImprovement = scoreContextImprovement;
        }

        public AnalysisExplanationQueryParam scoreContextImprovement(Double scoreContextImprovement) {
            this.scoreContextImprovement = scoreContextImprovement;
            return this;
        }

        /**
         * The context word which helped increase the score
         *
         * @return supportiveContextWord
         **/
        @JsonProperty("supportive_context_word")
        public String getSupportiveContextWord() {
            return supportiveContextWord;
        }

        /**
         * Set supportiveContextWord
         **/
        public void setSupportiveContextWord(String supportiveContextWord) {
            this.supportiveContextWord = supportiveContextWord;
        }

        public AnalysisExplanationQueryParam supportiveContextWord(String supportiveContextWord) {
            this.supportiveContextWord = supportiveContextWord;
            return this;
        }

        /**
         * Result of a validation (e.g. checksum)
         *
         * @return validationResult
         **/
        @JsonProperty("validation_result")
        public Double getValidationResult() {
            return validationResult;
        }

        /**
         * Set validationResult
         **/
        public void setValidationResult(Double validationResult) {
            this.validationResult = validationResult;
        }

        public AnalysisExplanationQueryParam validationResult(Double validationResult) {
            this.validationResult = validationResult;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnalysisExplanationQueryParam {\n");

            sb.append("    recognizer: ").append(toIndentedString(recognizer)).append("\n");
            sb.append("    patternName: ").append(toIndentedString(patternName)).append("\n");
            sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
            sb.append("    originalScore: ").append(toIndentedString(originalScore)).append("\n");
            sb.append("    score: ").append(toIndentedString(score)).append("\n");
            sb.append("    textualExplanation: ").append(toIndentedString(textualExplanation)).append("\n");
            sb.append("    scoreContextImprovement: ").append(toIndentedString(scoreContextImprovement)).append("\n");
            sb.append("    supportiveContextWord: ").append(toIndentedString(supportiveContextWord)).append("\n");
            sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
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
