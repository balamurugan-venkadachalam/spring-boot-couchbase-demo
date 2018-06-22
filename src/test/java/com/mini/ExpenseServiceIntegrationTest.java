package com.mini;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mini.domain.ExpenseDetail;
import com.mini.service.ExpenseService;

public class ExpenseServiceIntegrationTest extends SampleApplicationTests {
	
	@Autowired
	protected ExpenseService expenseService;
	
	@Test 
	public void saveExpenseDetail() {
		ExpenseDetail expenseDetail = new ExpenseDetail();
		expenseDetail.setExpenseCode("E1002");
		expenseDetail.setExpenseAmount("100");
		expenseDetail.setExpenseName("Something for bus maintance");
		expenseDetail.setExpenseDate(new Date().toString());
		expenseService.saveExpense(expenseDetail);
	}

}
