package com.mini.service;

import java.util.List;

import com.mini.domain.ExpenseDetail;
import com.mini.domain.IncomeDetail;

public interface IncomeService {
	
	public void saveIncome(IncomeDetail incomeDetail) ;
	
	public IncomeDetail findIncomeDetail(String incomeCode) ;
	
}
