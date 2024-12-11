package io.quarkiverse.presidio.runtime.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AnonymizeResponse {

    private String text;
    private List<OperatorResult> items;

    /**
     * Get text
     *
     * @return text
     **/
    @JsonProperty("text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getText() {
        return text;
    }

    /**
     * Set text
     **/
    public void setText(String text) {
        this.text = text;
    }

    public AnonymizeResponse text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Array of anonymized entities
     *
     * @return items
     **/
    @JsonProperty("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OperatorResult> getItems() {
        return items;
    }

    /**
     * Set items
     **/
    public void setItems(List<OperatorResult> items) {
        this.items = items;
    }

    public AnonymizeResponse items(List<OperatorResult> items) {
        this.items = items;
        return this;
    }

    public AnonymizeResponse addItemsItem(OperatorResult itemsItem) {
        if (this.items == null) {
            items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnonymizeResponse {\n");

        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");

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
    public static class AnonymizeResponseQueryParam {

        @QueryParam("text")
        private String text;
        @QueryParam("items")
        private List<OperatorResult> items = null;

        /**
         * Get text
         *
         * @return text
         **/
        @JsonProperty("text")
        public String getText() {
            return text;
        }

        /**
         * Set text
         **/
        public void setText(String text) {
            this.text = text;
        }

        public AnonymizeResponseQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Array of anonymized entities
         *
         * @return items
         **/
        @JsonProperty("items")
        public List<OperatorResult> getItems() {
            return items;
        }

        /**
         * Set items
         **/
        public void setItems(List<OperatorResult> items) {
            this.items = items;
        }

        public AnonymizeResponseQueryParam items(List<OperatorResult> items) {
            this.items = items;
            return this;
        }

        public AnonymizeResponseQueryParam addItemsItem(OperatorResult itemsItem) {
            this.items.add(itemsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnonymizeResponseQueryParam {\n");

            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
