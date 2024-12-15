package io.quarkiverse.presidio.runtime.model;

import java.security.PublicKey;
import java.util.Base64;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Replace encrypted PII decrypted text
 **/
public class Decrypt extends Operator {

    /**
     * Replace encrypted PII decrypted text
     **/
    private String key;

    public Decrypt() {
        super("decrypt");
    }

    public Decrypt(String key) {
        this();
        this.setKey(key);
    }

    public Decrypt(PublicKey key) {
        this();
        this.setKey(Base64.getEncoder().encodeToString(key.getEncoded()));
    }

    /**
     * Cryptographic key of length 128, 192 or 256 bits, in a string format
     *
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
    public static class DecryptQueryParam extends OperatorQueryParam {

        /**
         * Replace encrypted PII decrypted text
         **/
        @QueryParam("key")
        private String key;

        public DecryptQueryParam() {
            super("decrypt");
        }

        /**
         * Cryptographic key of length 128, 192 or 256 bits, in a string format
         *
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
