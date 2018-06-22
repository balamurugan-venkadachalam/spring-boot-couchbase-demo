package com.mini.domain;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"type",
"expenseName",
"expenseAmount",
"expenseCode",
"expenseDate",
"lastUpdatedUser",
"lastUpdatedTime"
})
@Document
public class ExpenseRequest {

@JsonProperty("type")
private String type;

@JsonProperty("expenseName")
private String expenseName;

@JsonProperty("expenseAmount")
private String expenseAmount;

@NotNull
@Id
@JsonProperty("expenseCode")
private String expenseCode;

@JsonProperty("expenseDate")
private String expenseDate;

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

@JsonProperty("expenseName")
public String getExpenseName() {
return expenseName;
}

@JsonProperty("expenseName")
public void setExpenseName(String expenseName) {
this.expenseName = expenseName;
}

@JsonProperty("expenseAmount")
public String getExpenseAmount() {
return expenseAmount;
}

@JsonProperty("expenseAmount")
public void setExpenseAmount(String expenseAmount) {
this.expenseAmount = expenseAmount;
}

@JsonProperty("expenseCode")
public String getExpenseCode() {
return expenseCode;
}

@JsonProperty("expenseCode")
public void setExpenseCode(String expenseCode) {
this.expenseCode = expenseCode;
}

@JsonProperty("expenseDate")
public String getExpenseDate() {
return expenseDate;
}

@JsonProperty("expenseDate")
public void setExpenseDate(String expenseDate) {
this.expenseDate = expenseDate;
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
 