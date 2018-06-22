package com.mini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.domain.ExpenseDetail;
import com.mini.repo.ExpenseRepository;
import com.mini.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	protected ExpenseRepository expenseRepository;
	
	public void saveExpense(ExpenseDetail expenseDetail) {
		expenseRepository.save(expenseDetail);
	}	
	
	public ExpenseDetail findExpense(String expenseCode) {
		return expenseRepository.findOne(expenseCode);
	}
	
}
