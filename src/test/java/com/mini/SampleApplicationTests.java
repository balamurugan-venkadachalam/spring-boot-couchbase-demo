package com.mini;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mini.repo.BusRepository;
import com.mini.repo.ExpenseRepository;
import com.mini.repo.IncomeRepository;
import com.mini.service.ExpenseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleApplicationTests {
	
	@Autowired
	protected ExpenseRepository expenseRepository;
	
	@Autowired
	protected IncomeRepository incomeRepository;
	
	@Autowired
	protected BusRepository busRepository;

	@Test
	public void contextLoads() {
	}
}
