package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.ws.rs.QueryParam;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pattern  {

    private String name;
    private String regex;
    private Double score;

    /**
    * Name of regular expression pattern
    * @return name
    **/
    @JsonProperty("name")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public Pattern name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Regex pattern string
    * @return regex
    **/
    @JsonProperty("regex")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRegex() {
        return regex;
    }

    /**
     * Set regex
     **/
    public void setRegex(String regex) {
        this.regex = regex;
    }

    public Pattern regex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
    * Detection confidence of this pattern (0.01 if very noisy, 0.6-1.0 if very specific)
    * @return score
    **/
    @JsonProperty("score")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getScore() {
        return score;
    }

    /**
     * Set score
     **/
    public void setScore(Double score) {
        this.score = score;
    }

    public Pattern score(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pattern {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        
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
    public static class PatternQueryParam  {

        @QueryParam("name")
        private String name;
        @QueryParam("regex")
        private String regex;
        @QueryParam("score")
        private Double score;

        /**
        * Name of regular expression pattern
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public PatternQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Regex pattern string
        * @return regex
        **/
        @JsonProperty("regex")
        public String getRegex() {
            return regex;
        }

        /**
         * Set regex
         **/
        public void setRegex(String regex) {
            this.regex = regex;
        }

        public PatternQueryParam regex(String regex) {
            this.regex = regex;
            return this;
        }

        /**
        * Detection confidence of this pattern (0.01 if very noisy, 0.6-1.0 if very specific)
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

        public PatternQueryParam score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PatternQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
            sb.append("    score: ").append(toIndentedString(score)).append("\n");
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