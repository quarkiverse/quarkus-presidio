package io.quarkiverse.presidio.runtime.model;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OperatorResult {

    private String operator;
    private String entityType;
    private Integer start;
    private Integer end;
    private String text;

    /**
     * Name of the used operator
     *
     * @return operator
     **/
    @JsonProperty("operator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOperator() {
        return operator;
    }

    /**
     * Set operator
     **/
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public OperatorResult operator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Type of the PII entity
     *
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

    public OperatorResult entityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Start index of the changed text
     *
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

    public OperatorResult start(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * End index in the changed text
     *
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

    public OperatorResult end(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * The new text returned
     *
     * @return text
     **/
    @JsonProperty("text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getText() {
        return text;
    }

    /**
     * Set text
     **/
    public void setText(String text) {
        this.text = text;
    }

    public OperatorResult text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperatorResult {\n");

        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");

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
    public static class OperatorResultQueryParam {

        @QueryParam("operator")
        private String operator;
        @QueryParam("entityType")
        private String entityType;
        @QueryParam("start")
        private Integer start;
        @QueryParam("end")
        private Integer end;
        @QueryParam("text")
        private String text;

        /**
         * Name of the used operator
         *
         * @return operator
         **/
        @JsonProperty("operator")
        public String getOperator() {
            return operator;
        }

        /**
         * Set operator
         **/
        public void setOperator(String operator) {
            this.operator = operator;
        }

        public OperatorResultQueryParam operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Type of the PII entity
         *
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

        public OperatorResultQueryParam entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * Start index of the changed text
         *
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

        public OperatorResultQueryParam start(Integer start) {
            this.start = start;
            return this;
        }

        /**
         * End index in the changed text
         *
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

        public OperatorResultQueryParam end(Integer end) {
            this.end = end;
            return this;
        }

        /**
         * The new text returned
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

        public OperatorResultQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OperatorResultQueryParam {\n");

            sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
            sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
            sb.append("    start: ").append(toIndentedString(start)).append("\n");
            sb.append("    end: ").append(toIndentedString(end)).append("\n");
            sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
