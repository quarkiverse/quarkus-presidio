package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.ws.rs.QueryParam;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Replace with a given character
 **/
public class Mask  {

    /**
      * Replace with a given character
     **/
    private String type;
    /**
      * Replace with a given character
     **/
    private String maskingChar;
    /**
      * Replace with a given character
     **/
    private Integer charsToMask;
    /**
      * Replace with a given character
     **/
    private Boolean fromEnd = false;

    /**
    * mask
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

    public Mask type(String type) {
        this.type = type;
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

    public Mask maskingChar(String maskingChar) {
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

    public Mask charsToMask(Integer charsToMask) {
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

    public Mask fromEnd(Boolean fromEnd) {
        this.fromEnd = fromEnd;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Mask {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    maskingChar: ").append(toIndentedString(maskingChar)).append("\n");
        sb.append("    charsToMask: ").append(toIndentedString(charsToMask)).append("\n");
        sb.append("    fromEnd: ").append(toIndentedString(fromEnd)).append("\n");
        
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
      * Replace with a given character
     **/
    public static class MaskQueryParam  {

        /**
          * Replace with a given character
         **/
        @QueryParam("type")
        private String type;
        /**
          * Replace with a given character
         **/
        @QueryParam("maskingChar")
        private String maskingChar;
        /**
          * Replace with a given character
         **/
        @QueryParam("charsToMask")
        private Integer charsToMask;
        /**
          * Replace with a given character
         **/
        @QueryParam("fromEnd")
        private Boolean fromEnd = false;

        /**
        * mask
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

        public MaskQueryParam type(String type) {
            this.type = type;
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

        public MaskQueryParam maskingChar(String maskingChar) {
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

        public MaskQueryParam charsToMask(Integer charsToMask) {
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

        public MaskQueryParam fromEnd(Boolean fromEnd) {
            this.fromEnd = fromEnd;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MaskQueryParam {\n");

            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    maskingChar: ").append(toIndentedString(maskingChar)).append("\n");
            sb.append("    charsToMask: ").append(toIndentedString(charsToMask)).append("\n");
            sb.append("    fromEnd: ").append(toIndentedString(fromEnd)).append("\n");
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