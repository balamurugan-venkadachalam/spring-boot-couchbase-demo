package com.mini;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mini.domain.BusDetail;
import com.mini.domain.ExpenseDetail;
import com.mini.domain.IncomeDetail;
import com.mini.service.BusService;
import com.mini.service.ExpenseService;
import com.mini.service.IncomeService;

public class BusServiceIntegrationTest extends SampleApplicationTests {
	
	@Autowired
	protected BusService busService;
	
	@Test 
	public void saveBusService() {
		BusDetail busDetail = new BusDetail();
		busDetail.setBusNo("101");
		busDetail.setRoute("KMU");
		busDetail.setBusDescription("Going well");
		busService.saveBus(busDetail);
	}

}
