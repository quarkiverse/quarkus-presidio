package io.quarkiverse.presidio.runtime.model;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Replace with a given value
 **/
public class Replace extends Operator {

    /**
     * Replace with a given value
     **/
    private String newValue;

    public Replace() {
        super("replace");
    }

    public Replace(String newValue) {
        this();
        this.setNewValue(newValue);
    }

    /**
     * The string to replace with
     *
     * @return newValue
     **/
    @JsonProperty("new_value")
    public String getNewValue() {
        return newValue;
    }

    /**
     * Set newValue
     **/
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public Replace newValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Replace {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");

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
     * Replace with a given value
     **/
    public static class ReplaceQueryParam extends OperatorQueryParam {

        public ReplaceQueryParam() {
            super("replace");
        }

        /**
         * Replace with a given value
         **/
        @QueryParam("newValue")
        private String newValue;

        /**
         * The string to replace with
         *
         * @return newValue
         **/
        @JsonProperty("new_value")
        public String getNewValue() {
            return newValue;
        }

        /**
         * Set newValue
         **/
        public void setNewValue(String newValue) {
            this.newValue = newValue;
        }

        public ReplaceQueryParam newValue(String newValue) {
            this.newValue = newValue;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ReplaceQueryParam {\n");

            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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
