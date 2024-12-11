package io.quarkiverse.presidio.runtime.model;
import com.fasterxml.jackson.annotation.*;
import jakarta.ws.rs.QueryParam;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AnonymizeRequestAnonymizersValue  {

    private String type;
    private String newValue;
    private String maskingChar;
    private Integer charsToMask;
    private Boolean fromEnd = false;

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

        @JsonCreator
        public static HashTypeEnum fromString(String v) {
            for (HashTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private HashTypeEnum hashType = HashTypeEnum.MD5;
    private String key;

    /**
    * encrypt
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

    public AnonymizeRequestAnonymizersValue type(String type) {
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

    public AnonymizeRequestAnonymizersValue newValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
    * The replacement character
    * @return maskingChar
    **/
    @JsonProperty("masking_char")
    public String getMaskingChar() {
        return maskingChar;
    }

    /**
     * Set maskingChar
     **/
    public void setMaskingChar(String maskingChar) {
        this.maskingChar = maskingChar;
    }

    public AnonymizeRequestAnonymizersValue maskingChar(String maskingChar) {
        this.maskingChar = maskingChar;
        return this;
    }

    /**
    * The amount of characters that should be replaced
    * @return charsToMask
    **/
    @JsonProperty("chars_to_mask")
    public Integer getCharsToMask() {
        return charsToMask;
    }

    /**
     * Set charsToMask
     **/
    public void setCharsToMask(Integer charsToMask) {
        this.charsToMask = charsToMask;
    }

    public AnonymizeRequestAnonymizersValue charsToMask(Integer charsToMask) {
        this.charsToMask = charsToMask;
        return this;
    }

    /**
    * Whether to mask the PII from it's end
    * @return fromEnd
    **/
    @JsonProperty("from_end")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFromEnd() {
        return fromEnd;
    }

    /**
     * Set fromEnd
     **/
    public void setFromEnd(Boolean fromEnd) {
        this.fromEnd = fromEnd;
    }

    public AnonymizeRequestAnonymizersValue fromEnd(Boolean fromEnd) {
        this.fromEnd = fromEnd;
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

    public AnonymizeRequestAnonymizersValue hashType(HashTypeEnum hashType) {
        this.hashType = hashType;
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

    public AnonymizeRequestAnonymizersValue key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnonymizeRequestAnonymizersValue {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    maskingChar: ").append(toIndentedString(maskingChar)).append("\n");
        sb.append("    charsToMask: ").append(toIndentedString(charsToMask)).append("\n");
        sb.append("    fromEnd: ").append(toIndentedString(fromEnd)).append("\n");
        sb.append("    hashType: ").append(toIndentedString(hashType)).append("\n");
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
    public static class AnonymizeRequestAnonymizersValueQueryParam  {

        @QueryParam("type")
        private String type;
        @QueryParam("newValue")
        private String newValue;
        @QueryParam("maskingChar")
        private String maskingChar;
        @QueryParam("charsToMask")
        private Integer charsToMask;
        @QueryParam("fromEnd")
        private Boolean fromEnd = false;

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

        @JsonCreator
        public static HashTypeEnum fromString(String v) {
            for (HashTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private HashTypeEnum hashType = HashTypeEnum.MD5;
        @QueryParam("key")
        private String key;

        /**
        * encrypt
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

        public AnonymizeRequestAnonymizersValueQueryParam type(String type) {
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

        public AnonymizeRequestAnonymizersValueQueryParam newValue(String newValue) {
            this.newValue = newValue;
            return this;
        }

        /**
        * The replacement character
        * @return maskingChar
        **/
        @JsonProperty("masking_char")
        public String getMaskingChar() {
            return maskingChar;
        }

        /**
         * Set maskingChar
         **/
        public void setMaskingChar(String maskingChar) {
            this.maskingChar = maskingChar;
        }

        public AnonymizeRequestAnonymizersValueQueryParam maskingChar(String maskingChar) {
            this.maskingChar = maskingChar;
            return this;
        }

        /**
        * The amount of characters that should be replaced
        * @return charsToMask
        **/
        @JsonProperty("chars_to_mask")
        public Integer getCharsToMask() {
            return charsToMask;
        }

        /**
         * Set charsToMask
         **/
        public void setCharsToMask(Integer charsToMask) {
            this.charsToMask = charsToMask;
        }

        public AnonymizeRequestAnonymizersValueQueryParam charsToMask(Integer charsToMask) {
            this.charsToMask = charsToMask;
            return this;
        }

        /**
        * Whether to mask the PII from it's end
        * @return fromEnd
        **/
        @JsonProperty("from_end")
        public Boolean getFromEnd() {
            return fromEnd;
        }

        /**
         * Set fromEnd
         **/
        public void setFromEnd(Boolean fromEnd) {
            this.fromEnd = fromEnd;
        }

        public AnonymizeRequestAnonymizersValueQueryParam fromEnd(Boolean fromEnd) {
            this.fromEnd = fromEnd;
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

        public AnonymizeRequestAnonymizersValueQueryParam hashType(HashTypeEnum hashType) {
            this.hashType = hashType;
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

        public AnonymizeRequestAnonymizersValueQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnonymizeRequestAnonymizersValueQueryParam {\n");

            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
            sb.append("    maskingChar: ").append(toIndentedString(maskingChar)).append("\n");
            sb.append("    charsToMask: ").append(toIndentedString(charsToMask)).append("\n");
            sb.append("    fromEnd: ").append(toIndentedString(fromEnd)).append("\n");
            sb.append("    hashType: ").append(toIndentedString(hashType)).append("\n");
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