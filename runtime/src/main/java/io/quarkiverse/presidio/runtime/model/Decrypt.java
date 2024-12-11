package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.ws.rs.QueryParam;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Replace encrypted PII decrypted text
 **/
public class Decrypt  {

    /**
      * Replace encrypted PII decrypted text
     **/
    private String type;
    /**
      * Replace encrypted PII decrypted text
     **/
    private String key;

    /**
    * decrypt
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

    public Decrypt type(String type) {
        this.type = type;
        return this;
    }

    /**
    * Cryptographic key of length 128, 192 or 256 bits, in a string format
    * @return key
    **/
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Set key
     **/
    public void setKey(String key) {
        this.key = key;
    }

    public Decrypt key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Decrypt {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        
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
      * Replace encrypted PII decrypted text
     **/
    public static class DecryptQueryParam  {

        /**
          * Replace encrypted PII decrypted text
         **/
        @QueryParam("type")
        private String type;
        /**
          * Replace encrypted PII decrypted text
         **/
        @QueryParam("key")
        private String key;

        /**
        * decrypt
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

        public DecryptQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * Cryptographic key of length 128, 192 or 256 bits, in a string format
        * @return key
        **/
        @JsonProperty("key")
        public String getKey() {
            return key;
        }

        /**
         * Set key
         **/
        public void setKey(String key) {
            this.key = key;
        }

        public DecryptQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DecryptQueryParam {\n");

            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
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