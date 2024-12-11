package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.ws.rs.QueryParam;


@JsonIgnoreProperties(ignoreUnknown = true)
public class RecognizedMetadata  {

    private String recognizerName;

    /**
    * Name of recognizer that made the decision
    * @return recognizerName
    **/
    @JsonProperty("recognizer_name")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecognizerName() {
        return recognizerName;
    }

    /**
     * Set recognizerName
     **/
    public void setRecognizerName(String recognizerName) {
        this.recognizerName = recognizerName;
    }

    public RecognizedMetadata recognizerName(String recognizerName) {
        this.recognizerName = recognizerName;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizedMetadata {\n");

        sb.append("    recognizerName: ").append(toIndentedString(recognizerName)).append("\n");
        
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
    public static class RecognizedMetadataQueryParam  {

        @QueryParam("recognizerName")
        private String recognizerName;

        /**
        * Name of recognizer that made the decision
        * @return recognizerName
        **/
        @JsonProperty("recognizer_name")
        public String getRecognizerName() {
            return recognizerName;
        }

        /**
         * Set recognizerName
         **/
        public void setRecognizerName(String recognizerName) {
            this.recognizerName = recognizerName;
        }

        public RecognizedMetadataQueryParam recognizerName(String recognizerName) {
            this.recognizerName = recognizerName;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RecognizedMetadataQueryParam {\n");

            sb.append("    recognizerName: ").append(toIndentedString(recognizerName)).append("\n");
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