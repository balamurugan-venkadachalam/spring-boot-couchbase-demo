package com.mini.domain;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import com.couchbase.client.java.repository.annotation.Field;

public class ExpenseType {

	public ExpenseType() {

	}
	
	public ExpenseType(String expenseTypeCode, String expenseTypeDescription) {
		this.expenseTypeCode = expenseTypeCode;
		this.expenseTypeDescription = expenseTypeDescription;
	}
	
    @NotNull
    @Field
    @Id
	private String expenseTypeCode;

	
    @NotNull
    @Field
	private String expenseTypeDescription;


	public String getExpenseTypeCode() {
		return expenseTypeCode;
	}


	public void setExpenseTypeCode(String expenseTypeCode) {
		this.expenseTypeCode = expenseTypeCode;
	}


	public String getExpenseTypeDescription() {
		return expenseTypeDescription;
	}


	public void setExpenseTypeDescription(String expenseTypeDescription) {
		this.expenseTypeDescription = expenseTypeDescription;
	}


}
