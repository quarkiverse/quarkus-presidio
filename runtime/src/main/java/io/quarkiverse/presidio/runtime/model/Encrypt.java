package io.quarkiverse.presidio.runtime.model;

import java.security.PrivateKey;
import java.util.Base64;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Replace with an encrypted value
 **/
public class Encrypt extends Operator {

    /**
     * Replace with an encrypted value
     **/
    private String key;

    public Encrypt() {
        super("encrypt");
    }

    public Encrypt(String key) {
        this();
        this.setType(key);
    }

    public Encrypt(PrivateKey key) {
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

    public Encrypt key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Encrypt {\n");

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
     * Replace with an encrypted value
     **/
    public static class EncryptQueryParam extends OperatorQueryParam {

        /**
         * Replace with an encrypted value
         **/
        @QueryParam("key")
        private String key;

        public EncryptQueryParam() {
            super("encrypt");
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

        public EncryptQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EncryptQueryParam {\n");

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
