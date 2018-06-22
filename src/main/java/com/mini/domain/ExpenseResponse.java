package com.mini.domain;

import java.util.HashMap;
import java.util.List;
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
"lastUpdatedUser",
"lastUpdatedTime",
"expenseDetail"
})
public class ExpenseResponse {

@JsonProperty("type")
private String type;
@JsonProperty("lastUpdatedUser")
private String lastUpdatedUser;
@JsonProperty("lastUpdatedTime")
private String lastUpdatedTime;
@JsonProperty("expenseDetail")
private List<ExpenseDetail> expenseDetail = null;
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

@JsonProperty("expenseDetail")
public List<ExpenseDetail> getExpenseDetail() {
return expenseDetail;
}

@JsonProperty("expenseDetail")
public void setExpenseDetail(List<ExpenseDetail> expenseDetail) {
this.expenseDetail = expenseDetail;
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