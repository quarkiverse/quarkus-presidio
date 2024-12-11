package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.ws.rs.QueryParam;


@JsonIgnoreProperties(ignoreUnknown = true)
public class DeanonymizeResponse  {

    private String text;
    private List<OperatorResult> items;

    /**
    * Get text
    * @return text
    **/
    @JsonProperty("text")
          @JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getText() {
        return text;
    }

    /**
     * Set text
     **/
    public void setText(String text) {
        this.text = text;
    }

    public DeanonymizeResponse text(String text) {
        this.text = text;
        return this;
    }

    /**
    * Array of deanonymized entities
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

    public DeanonymizeResponse items(List<OperatorResult> items) {
        this.items = items;
        return this;
    }
    public DeanonymizeResponse addItemsItem(OperatorResult itemsItem) {
        if (this.items == null){
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
        sb.append("class DeanonymizeResponse {\n");

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
    public static class DeanonymizeResponseQueryParam  {

        @QueryParam("text")
        private String text;
        @QueryParam("items")
        private List<OperatorResult> items = null;

        /**
        * Get text
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

        public DeanonymizeResponseQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
        * Array of deanonymized entities
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

        public DeanonymizeResponseQueryParam items(List<OperatorResult> items) {
            this.items = items;
            return this;
        }
        public DeanonymizeResponseQueryParam addItemsItem(OperatorResult itemsItem) {
            this.items.add(itemsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DeanonymizeResponseQueryParam {\n");

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