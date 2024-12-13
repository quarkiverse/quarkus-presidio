package io.quarkiverse.presidio.runtime.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * A regular expressions or deny-list based recognizer
 **/
public class PatternRecognizer {

    /**
     * A regular expressions or deny-list based recognizer
     **/
    private String name;
    /**
     * A regular expressions or deny-list based recognizer
     **/
    private String supportedLanguage;
    /**
     * A regular expressions or deny-list based recognizer
     **/
    private List<Pattern> patterns;
    /**
     * A regular expressions or deny-list based recognizer
     **/
    private List<String> denyList;
    /**
     * A regular expressions or deny-list based recognizer
     **/
    private List<String> context;
    /**
     * A regular expressions or deny-list based recognizer
     **/
    private String supportedEntity;

    /**
     * Name of recognizer
     *
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

    public PatternRecognizer name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Language code supported by this recognizer
     *
     * @return supportedLanguage
     **/
    @JsonProperty("supported_language")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSupportedLanguage() {
        return supportedLanguage;
    }

    /**
     * Set supportedLanguage
     **/
    public void setSupportedLanguage(String supportedLanguage) {
        this.supportedLanguage = supportedLanguage;
    }

    public PatternRecognizer supportedLanguage(String supportedLanguage) {
        this.supportedLanguage = supportedLanguage;
        return this;
    }

    /**
     * List of type Pattern containing regex expressions with additional metadata.
     *
     * @return patterns
     **/
    @JsonProperty("patterns")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Pattern> getPatterns() {
        return patterns;
    }

    /**
     * Set patterns
     **/
    public void setPatterns(List<Pattern> patterns) {
        this.patterns = patterns;
    }

    public PatternRecognizer patterns(List<Pattern> patterns) {
        this.patterns = patterns;
        return this;
    }

    public PatternRecognizer addPatternsItem(Pattern patternsItem) {
        if (this.patterns == null) {
            patterns = new ArrayList<>();
        }
        this.patterns.add(patternsItem);
        return this;
    }

    /**
     * List of words to be returned as PII if found.
     *
     * @return denyList
     **/
    @JsonProperty("deny_list")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getDenyList() {
        return denyList;
    }

    /**
     * Set denyList
     **/
    public void setDenyList(List<String> denyList) {
        this.denyList = denyList;
    }

    public PatternRecognizer denyList(List<String> denyList) {
        this.denyList = denyList;
        return this;
    }

    public PatternRecognizer addDenyListItem(String denyListItem) {
        if (this.denyList == null) {
            denyList = new ArrayList<>();
        }
        this.denyList.add(denyListItem);
        return this;
    }

    /**
     * List of words to be used to increase confidence if found in the vicinity of detected entities.
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

    public PatternRecognizer context(List<String> context) {
        this.context = context;
        return this;
    }

    public PatternRecognizer addContextItem(String contextItem) {
        if (this.context == null) {
            context = new ArrayList<>();
        }
        this.context.add(contextItem);
        return this;
    }

    /**
     * The name of entity this ad hoc recognizer detects
     *
     * @return supportedEntity
     **/
    @JsonProperty("supported_entity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSupportedEntity() {
        return supportedEntity;
    }

    /**
     * Set supportedEntity
     **/
    public void setSupportedEntity(String supportedEntity) {
        this.supportedEntity = supportedEntity;
    }

    public PatternRecognizer supportedEntity(String supportedEntity) {
        this.supportedEntity = supportedEntity;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatternRecognizer {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    supportedLanguage: ").append(toIndentedString(supportedLanguage)).append("\n");
        sb.append("    patterns: ").append(toIndentedString(patterns)).append("\n");
        sb.append("    denyList: ").append(toIndentedString(denyList)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    supportedEntity: ").append(toIndentedString(supportedEntity)).append("\n");

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
    /**
     * A regular expressions or deny-list based recognizer
     **/
    public static class PatternRecognizerQueryParam {

        /**
         * A regular expressions or deny-list based recognizer
         **/
        @QueryParam("name")
        private String name;
        /**
         * A regular expressions or deny-list based recognizer
         **/
        @QueryParam("supportedLanguage")
        private String supportedLanguage;
        /**
         * A regular expressions or deny-list based recognizer
         **/
        @QueryParam("patterns")
        private List<Pattern> patterns = null;
        /**
         * A regular expressions or deny-list based recognizer
         **/
        @QueryParam("denyList")
        private List<String> denyList = null;
        /**
         * A regular expressions or deny-list based recognizer
         **/
        @QueryParam("context")
        private List<String> context = null;
        /**
         * A regular expressions or deny-list based recognizer
         **/
        @QueryParam("supportedEntity")
        private String supportedEntity;

        /**
         * Name of recognizer
         *
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

        public PatternRecognizerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Language code supported by this recognizer
         *
         * @return supportedLanguage
         **/
        @JsonProperty("supported_language")
        public String getSupportedLanguage() {
            return supportedLanguage;
        }

        /**
         * Set supportedLanguage
         **/
        public void setSupportedLanguage(String supportedLanguage) {
            this.supportedLanguage = supportedLanguage;
        }

        public PatternRecognizerQueryParam supportedLanguage(String supportedLanguage) {
            this.supportedLanguage = supportedLanguage;
            return this;
        }

        /**
         * List of type Pattern containing regex expressions with additional metadata.
         *
         * @return patterns
         **/
        @JsonProperty("patterns")
        public List<Pattern> getPatterns() {
            return patterns;
        }

        /**
         * Set patterns
         **/
        public void setPatterns(List<Pattern> patterns) {
            this.patterns = patterns;
        }

        public PatternRecognizerQueryParam patterns(List<Pattern> patterns) {
            this.patterns = patterns;
            return this;
        }

        public PatternRecognizerQueryParam addPatternsItem(Pattern patternsItem) {
            this.patterns.add(patternsItem);
            return this;
        }

        /**
         * List of words to be returned as PII if found.
         *
         * @return denyList
         **/
        @JsonProperty("deny_list")
        public List<String> getDenyList() {
            return denyList;
        }

        /**
         * Set denyList
         **/
        public void setDenyList(List<String> denyList) {
            this.denyList = denyList;
        }

        public PatternRecognizerQueryParam denyList(List<String> denyList) {
            this.denyList = denyList;
            return this;
        }

        public PatternRecognizerQueryParam addDenyListItem(String denyListItem) {
            this.denyList.add(denyListItem);
            return this;
        }

        /**
         * List of words to be used to increase confidence if found in the vicinity of detected entities.
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

        public PatternRecognizerQueryParam context(List<String> context) {
            this.context = context;
            return this;
        }

        public PatternRecognizerQueryParam addContextItem(String contextItem) {
            this.context.add(contextItem);
            return this;
        }

        /**
         * The name of entity this ad hoc recognizer detects
         *
         * @return supportedEntity
         **/
        @JsonProperty("supported_entity")
        public String getSupportedEntity() {
            return supportedEntity;
        }

        /**
         * Set supportedEntity
         **/
        public void setSupportedEntity(String supportedEntity) {
            this.supportedEntity = supportedEntity;
        }

        public PatternRecognizerQueryParam supportedEntity(String supportedEntity) {
            this.supportedEntity = supportedEntity;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PatternRecognizerQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    supportedLanguage: ").append(toIndentedString(supportedLanguage)).append("\n");
            sb.append("    patterns: ").append(toIndentedString(patterns)).append("\n");
            sb.append("    denyList: ").append(toIndentedString(denyList)).append("\n");
            sb.append("    context: ").append(toIndentedString(context)).append("\n");
            sb.append("    supportedEntity: ").append(toIndentedString(supportedEntity)).append("\n");
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
