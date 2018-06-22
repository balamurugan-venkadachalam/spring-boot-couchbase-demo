package com.mini;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mini.domain.IncomeDetail;
import com.mini.domain.IncomeType;
import com.mini.service.IncomeService;

public class IncomeServiceIntegrationTest extends SampleApplicationTests {
	
	@Autowired
	protected IncomeService incomeService;
	
	@Test 
	public void saveIncomeDetail() {
		IncomeDetail incomeDetail = new IncomeDetail();
		incomeDetail.setIncomeCode("E1001");
		incomeDetail.setIncomeAmount("100");
		incomeDetail.setIncomeName("Something for bus maintance");
		incomeDetail.setIncomeDate(new Date().toString());
		
		incomeDetail.setIncomeTypes(Arrays.asList(new IncomeType("101", "bus ticket")));
		incomeService.saveIncome(incomeDetail);
	}
	
	
	@Test
	public void fetchIncode_should_return_success() {
		IncomeDetail incomeDetails = incomeService.findIncomeDetail("E1002");
		assertNotNull(incomeDetails);
		System.out.println(incomeDetails);
		
	}

}
