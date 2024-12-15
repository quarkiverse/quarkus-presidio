package io.quarkiverse.presidio.runtime.model;

import jakarta.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OperatorQueryParam {

    protected OperatorQueryParam(String type) {
        this.type = type;
    }

    /**
     * Replace with a given value
     **/
    @QueryParam("type")
    protected String type;

    /**
     * replace
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
