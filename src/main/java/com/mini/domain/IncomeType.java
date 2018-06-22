package com.mini.domain;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import com.couchbase.client.java.repository.annotation.Field;

public class IncomeType {
	
	public IncomeType() {

	}
	
	public IncomeType(String incomeCode, String incomeDescription) {
		this.incomeCode = incomeCode;
		this.incomeDescription = incomeDescription;
	}
	
    @NotNull
    @Field
    @Id
	private String incomeCode;
	
    @NotNull
    @Field
	private String incomeDescription;

	public String getIncomeCode() {
		return incomeCode;
	}

	public void setIncomeCode(String incomeCode) {
		this.incomeCode = incomeCode;
	}

	public String getIncomeDescription() {
		return incomeDescription;
	}

	public void setIncomeDescription(String incomeDescription) {
		this.incomeDescription = incomeDescription;
	}
    

}
