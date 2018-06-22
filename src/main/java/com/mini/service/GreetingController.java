package com.mini.service;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mini.domain.ExpenseDetail;

@RestController
public class GreetingController {
	
	@Autowired
	protected ExpenseService expenseService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/sample")
    public Greeting sample() {
    	
		ExpenseDetail expenseDetail = new ExpenseDetail();
		expenseDetail.setExpenseCode("1001");
		expenseDetail.setExpenseAmount("100");
		expenseDetail.setExpenseName("Something for bus maintance");
		expenseDetail.setExpenseDate(new Date().toString());
		expenseService.saveExpense(expenseDetail);
		
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, "Loded"));
    }
    
    
}