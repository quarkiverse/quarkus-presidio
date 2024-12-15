package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Replace with hashed value
 **/
public class Hash extends Operator {

    public enum HashTypeEnum {
        MD5(String.valueOf("md5")),
        SHA256(String.valueOf("sha256")),
        SHA512(String.valueOf("sha512"));

        // caching enum access
        private static final java.util.EnumSet<HashTypeEnum> values = java.util.EnumSet.allOf(HashTypeEnum.class);

        String value;

        HashTypeEnum(String v) {
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

    public Hash() {
        super("hash");
    }

    public Hash(HashTypeEnum hash) {
        this();
        this.setHashType(hash);
    }

    /**
     * The hashing algorithm
     *
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
    public static class HashQueryParam extends OperatorQueryParam {

        protected HashQueryParam() {
            super("hash");
        }

        public enum HashTypeEnum {
            MD5(String.valueOf("md5")),
            SHA256(String.valueOf("sha256")),
            SHA512(String.valueOf("sha512"));

            // caching enum access
            private static final java.util.EnumSet<HashTypeEnum> values = java.util.EnumSet.allOf(HashTypeEnum.class);

            String value;

            HashTypeEnum(String v) {
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
         * The hashing algorithm
         *
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
