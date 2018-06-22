
package com.mini.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "type",
        "message",
        "lastUpdatedUser",
        "lastUpdatedTime",
        "errors"
})
public class MiniResponse {

    @JsonProperty("type")
    private String type;
   

    @JsonProperty("message")
    private String message;

    @JsonProperty("lastUpdatedTime")
    private String lastUpdatedTime;

    @JsonProperty("lastUpdatedUser")
    private String lastUpdatedUser;


    @JsonProperty("errors")
    private List<Error> errors = new ArrayList<Error>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    /**
     *
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @return
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

 


    /**
     *
     * @return
     * The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     *     The lastUpdatedUser
     */
    @JsonProperty("lastUpdatedUser")
    public String getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    /**
     *
     * @param lastUpdatedUser
     *     The lastUpdatedUser
     */
    @JsonProperty("lastUpdatedUser")
    public void setLastUpdatedUser(String lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }


    /**
     *
     * @return
     *     The lastUpdatedTime
     */
    @JsonProperty("lastUpdatedTime")
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     *
     * @param lastUpdatedTime
     *     The lastUpdatedTime
     */
    @JsonProperty("lastUpdatedTime")
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }



    /**
     *
     * @return
     *     The errors
     */
    @JsonProperty("errors")
    public List<Error> getErrors() {
        return errors;
    }

    /**
     *
     * @param errors
     *     The errors
     */
    @JsonProperty("errors")
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }



    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
