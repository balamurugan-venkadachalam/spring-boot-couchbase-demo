package com.mini.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"type",
"incomeName",
"incomeAmount",
"incomeDate",
"incomeCode",
"lastUpdatedUser",
"lastUpdatedTime"
})
public class IncomeRequest {

@JsonProperty("type")
private String type;
@JsonProperty("incomeName")
private String incomeName;
@JsonProperty("incomeAmount")
private String incomeAmount;
@JsonProperty("incomeDate")
private String incomeDate;
@JsonProperty("incomeCode")
private String incomeCode;
@JsonProperty("lastUpdatedUser")
private String lastUpdatedUser;
@JsonProperty("lastUpdatedTime")
private String lastUpdatedTime;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("incomeName")
public String getIncomeName() {
return incomeName;
}

@JsonProperty("incomeName")
public void setIncomeName(String incomeName) {
this.incomeName = incomeName;
}

@JsonProperty("incomeAmount")
public String getIncomeAmount() {
return incomeAmount;
}

@JsonProperty("incomeAmount")
public void setIncomeAmount(String incomeAmount) {
this.incomeAmount = incomeAmount;
}


@JsonProperty("incomeDate")
public String getIncomeDate() {
return incomeDate;
}

@JsonProperty("incomeDate")
public void setIncomeDate(String incomeDate) {
this.incomeDate = incomeDate;
}

@JsonProperty("incomeCode")
public String getIncomeCode() {
return incomeCode;
}

@JsonProperty("incomeCode")
public void setIncomeCode(String incomeCode) {
this.incomeCode = incomeCode;
}

@JsonProperty("lastUpdatedUser")
public String getLastUpdatedUser() {
return lastUpdatedUser;
}

@JsonProperty("lastUpdatedUser")
public void setLastUpdatedUser(String lastUpdatedUser) {
this.lastUpdatedUser = lastUpdatedUser;
}

@JsonProperty("lastUpdatedTime")
public String getLastUpdatedTime() {
return lastUpdatedTime;
}

@JsonProperty("lastUpdatedTime")
public void setLastUpdatedTime(String lastUpdatedTime) {
this.lastUpdatedTime = lastUpdatedTime;
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
 

