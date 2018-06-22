package com.mini.service;

import java.util.List;

import com.mini.domain.ExpenseDetail;

public interface ExpenseService {
	
	public void saveExpense(ExpenseDetail expenseDetail) ;
	
	public ExpenseDetail findExpense(String expenseCode) ;
	
}
