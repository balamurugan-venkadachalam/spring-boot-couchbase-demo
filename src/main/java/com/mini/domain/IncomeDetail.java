package com.mini.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;


import com.couchbase.client.java.repository.annotation.Field;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"incomeName",
"incomeAmount",
"incomeDate",
"incomeCode"
})
public class IncomeDetail {

@JsonProperty("incomeName")
@NotNull
@Field
private String incomeName;

@JsonProperty("incomeAmount")
@NotNull
@Field
private String incomeAmount;

@JsonProperty("incomeDate")
@NotNull
@Field
private String incomeDate;

@JsonProperty("incomeCode")
@NotNull
@Field
@Id
private String incomeCode;


@Field
private List<IncomeType> incomeTypes = new ArrayList<>();


@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

public List<IncomeType> getIncomeTypes() {
	return incomeTypes;
}

public void setIncomeTypes(List<IncomeType> incomeTypes) {
	this.incomeTypes = incomeTypes;
}



}
 

