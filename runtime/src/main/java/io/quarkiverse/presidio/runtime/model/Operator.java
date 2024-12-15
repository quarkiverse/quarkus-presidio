package io.quarkiverse.presidio.runtime.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Operator {

    protected String type;

    protected Operator(String type) {
        this.type = type;
    }

    /**
     * mask
     *
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

}
