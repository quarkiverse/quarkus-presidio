package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.ws.rs.QueryParam;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Replace with hashed value
 **/
public class Hash  {

    /**
      * Replace with hashed value
     **/
    private String type;

    public enum HashTypeEnum {
        MD5(String.valueOf("md5")), SHA256(String.valueOf("sha256")), SHA512(String.valueOf("sha512"));

        // caching enum access
        private static final java.util.EnumSet<HashTypeEnum> values = java.util.EnumSet.allOf(HashTypeEnum.class);

        String value;

        HashTypeEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HashTypeEnum fromString(String v) {
            for (HashTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * Replace with hashed value
     **/
    private HashTypeEnum hashType = HashTypeEnum.MD5;

    /**
    * hash
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

    public Hash type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The hashing algorithm
    * @return hashType
    **/
    @JsonProperty("hash_type")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public HashTypeEnum getHashType() {
        return hashType;
    }

    /**
     * Set hashType
     **/
    public void setHashType(HashTypeEnum hashType) {
        this.hashType = hashType;
    }

    public Hash hashType(HashTypeEnum hashType) {
        this.hashType = hashType;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Hash {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    hashType: ").append(toIndentedString(hashType)).append("\n");
        
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
      * Replace with hashed value
     **/
    public static class HashQueryParam  {

        /**
          * Replace with hashed value
         **/
        @QueryParam("type")
        private String type;

    public enum HashTypeEnum {
        MD5(String.valueOf("md5")), SHA256(String.valueOf("sha256")), SHA512(String.valueOf("sha512"));

        // caching enum access
        private static final java.util.EnumSet<HashTypeEnum> values = java.util.EnumSet.allOf(HashTypeEnum.class);

        String value;

        HashTypeEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HashTypeEnum fromString(String v) {
            for (HashTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        /**
          * Replace with hashed value
         **/
        private HashTypeEnum hashType = HashTypeEnum.MD5;

        /**
        * hash
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

        public HashQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The hashing algorithm
        * @return hashType
        **/
        @JsonProperty("hash_type")
        public HashTypeEnum getHashType() {
            return hashType;
        }

        /**
         * Set hashType
         **/
        public void setHashType(HashTypeEnum hashType) {
            this.hashType = hashType;
        }

        public HashQueryParam hashType(HashTypeEnum hashType) {
            this.hashType = hashType;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HashQueryParam {\n");

            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    hashType: ").append(toIndentedString(hashType)).append("\n");
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