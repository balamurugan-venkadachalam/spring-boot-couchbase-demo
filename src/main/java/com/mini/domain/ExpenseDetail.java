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
@JsonPropertyOrder({ "expenseName", "expenseAmount", "expenseCode", "expenseDate" })
public class ExpenseDetail {
	
	public ExpenseDetail() {
	
	}

	@JsonProperty("expenseName")
    @NotNull
    @Field
	private String expenseName;
	
	@JsonProperty("expenseAmount")
    @NotNull
    @Field
	private String expenseAmount;
	
	@JsonProperty("expenseCode")
    @NotNull
    @Field
    @Id
	private String expenseCode;
	
	@JsonProperty("expenseDate")
    @NotNull
    @Field
	private String expenseDate;

	
	@Field
	private List<ExpenseType> expenseTypeS = new ArrayList<>();
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public List<ExpenseType> getExpenseTypeS() {
		return expenseTypeS;
	}

	public void setExpenseTypeS(List<ExpenseType> expenseTypeS) {
		this.expenseTypeS = expenseTypeS;
	}

}
