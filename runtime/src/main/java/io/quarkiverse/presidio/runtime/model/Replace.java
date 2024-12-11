package io.quarkiverse.presidio.runtime.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.ws.rs.QueryParam;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Replace with a given value
 **/
public class Replace  {

    /**
      * Replace with a given value
     **/
    private String type;
    /**
      * Replace with a given value
     **/
    private String newValue;

    /**
    * replace
    * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public Replace type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The string to replace with
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
    public static class ReplaceQueryParam  {

        /**
          * Replace with a given value
         **/
        @QueryParam("type")
        private String type;
        /**
          * Replace with a given value
         **/
        @QueryParam("newValue")
        private String newValue;

        /**
        * replace
        * @return type
        **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public ReplaceQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The string to replace with
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