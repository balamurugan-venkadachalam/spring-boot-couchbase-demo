/*package com.mini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.document.RawJsonDocument;
import com.couchbase.client.java.error.DocumentDoesNotExistException;
import com.couchbase.client.java.query.N1qlQuery;
import com.couchbase.client.java.query.N1qlQueryResult;
import com.couchbase.client.java.query.N1qlQueryRow;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mini.couchbase.ODSCouchbaseClient;
import com.mini.domain.ExpenseDetail;
import com.mini.domain.ExpenseRequest;
import com.mini.domain.ExpenseResponse;
import com.mini.domain.IncomeDetail;
import com.mini.domain.IncomeRequest;
import com.mini.domain.IncomeResponse;
import com.mini.domain.MiniResponse;
import com.mini.domain.UserRequest;
import com.mini.util.MiniUtil;

@RestController
public class MiniController {

 
	private final MiniResponse miniResponse = new MiniResponse();
 

	@RequestMapping(value = "/saveIncome", method = RequestMethod.POST)
	public MiniResponse persistIncome(@RequestBody IncomeRequest incomeRequest) {
		List<String> hostList = new ArrayList<>();
		hostList.add("localhost");

		ObjectMapper writeMapper = new ObjectMapper();
		String docString = null;
		incomeRequest.setLastUpdatedTime(MiniUtil.getZulutime());
		try {
			docString = writeMapper.writeValueAsString(incomeRequest);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Bucket bucket = ODSCouchbaseClient.getInstance().getCouchbaseBucketInstanceFromPool(hostList, "mini",
				"123456");
		bucket.upsert(RawJsonDocument.create(generateKey(bucket,"INCOME"), docString.trim()));

		miniResponse.setMessage(incomeRequest.getIncomeCode());
		return miniResponse;
	}

	@RequestMapping(value = "/saveExpense", method = RequestMethod.POST)
	public MiniResponse persistExpense(@RequestBody ExpenseRequest expenseRequest) {
		List<String> hostList = new ArrayList<>();
		hostList.add("localhost");

		ObjectMapper writeMapper = new ObjectMapper();
		String docString = null;
		expenseRequest.setLastUpdatedTime(MiniUtil.getZulutime());

		try {
			docString = writeMapper.writeValueAsString(expenseRequest);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Bucket bucket = ODSCouchbaseClient.getInstance().getCouchbaseBucketInstanceFromPool(hostList, "mini",
				"123456");
		bucket.upsert(RawJsonDocument.create(generateKey(bucket,"EXPENSE"), docString.trim()));

		miniResponse.setMessage(expenseRequest.getExpenseCode());
		return miniResponse;
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public MiniResponse persistUser(@RequestBody UserRequest userRequest) {
		List<String> hostList = new ArrayList<>();
		hostList.add("localhost");

		ObjectMapper writeMapper = new ObjectMapper();
		String docString = null;
		try {
			docString = writeMapper.writeValueAsString(userRequest);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Bucket bucket = ODSCouchbaseClient.getInstance().getCouchbaseBucketInstanceFromPool(hostList, "mini",
				"123456");
		bucket.upsert(RawJsonDocument.create(userRequest.getUserName(), docString.trim()));

		miniResponse.setMessage(userRequest.getUserName());
		return miniResponse;
	}

	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public boolean login(@RequestBody UserRequest userRequest) {
		List<String> hostList = new ArrayList<>();
		hostList.add("localhost");

		boolean validLogin = false;

		ObjectMapper writeMapper = new ObjectMapper();
		String docString = null;
		try {
			docString = writeMapper.writeValueAsString(userRequest);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Bucket bucket = ODSCouchbaseClient.getInstance().getCouchbaseBucketInstanceFromPool(hostList, "mini",
				"123456");

		N1qlQuery query = getQuery(bucket.name(), userRequest.getUserName(), userRequest.getLoginPassword());
		N1qlQueryResult result = bucket.query(query);

		if (result.allRows().size() > 0) {
			validLogin = true;
		}
		return validLogin;
	}

	@RequestMapping(value = "/getIncomes", method = RequestMethod.GET)
	public IncomeResponse getIncomes(@RequestParam(value = "incomeCode") String incomeCode,
			@RequestParam(value = "incomeDate") String incomeDate) {

		IncomeResponse incomeResponse = new IncomeResponse();
		incomeResponse.setType("income");
		incomeResponse.setIncomeDetail(new ArrayList<IncomeDetail>());
		List<String> hostList = new ArrayList<>();
		hostList.add("localhost");
		Bucket bucket = ODSCouchbaseClient.getInstance().getCouchbaseBucketInstanceFromPool(hostList, "mini",
				"123456");

		N1qlQuery query = null;

		if (incomeCode != null) {

			String statement = "SELECT `mini`.* FROM `mini` where type=\"income\" AND incomeCode='" + incomeCode
					+ "'AND incomeDate='" + incomeDate + "'";
			System.out.println(" statement " + statement);
			query = N1qlQuery.simple(statement);
		}

		N1qlQueryResult result = bucket.query(query);

		if (result.finalSuccess()) {

			for (N1qlQueryRow row : result) {

				buildIncomeResponse(incomeResponse, row.value().toString());

			}

		}
		return incomeResponse;
	}

	@RequestMapping(value = "/getExpenses", method = RequestMethod.GET)
	public ExpenseResponse getExpenses(@RequestParam(value = "expenseCode") String expenseCode,
			@RequestParam(value = "expenseDate") String expenseDate) {

		ExpenseResponse expenseResponse = new ExpenseResponse();
		expenseResponse.setType("expense");
		expenseResponse.setExpenseDetail(new ArrayList<ExpenseDetail>());
		List<String> hostList = new ArrayList<>();
		hostList.add("localhost");
		Bucket bucket = ODSCouchbaseClient.getInstance().getCouchbaseBucketInstanceFromPool(hostList, "mini",
				"123456");

		N1qlQuery query = null;

		if (expenseCode != null) {

			String statement = "SELECT `mini`.* FROM `mini` where type=\"expense\" AND expenseCode='" + expenseCode
					+ "'AND expenseDate='" + expenseDate + "'";
			System.out.println(" statement " + statement);
			query = N1qlQuery.simple(statement);
		}

		N1qlQueryResult result = bucket.query(query);

		if (result.finalSuccess()) {

			for (N1qlQueryRow row : result) {

				buildExpenseResponse(expenseResponse, row.value().toString());

			}

		}
		return expenseResponse;
	}

	*//**
	 * @param bucketName
	 * @param userName
	 * @return
	 *//*

	private N1qlQuery getQuery(String bucketName, String userName, String password) {

		N1qlQuery query = null;
		if (userName != null) {

			String statement = "SELECT `" + bucketName + "`.* FROM `" + bucketName
					+ "` where type=\"user\" AND userName='" + userName + "'AND loginPassword='" + password + "'";
			System.out.println(" statement " + statement);
			query = N1qlQuery.simple(statement);
		}

		return query;
	}

	*//**
	 * Process the results.
	 *
	 * @param incomeResponse
	 * @param value
	 *//*

	private void buildIncomeResponse(IncomeResponse incomeResponse, String value) {

		try {

			ObjectMapper mapper = new ObjectMapper();
			IncomeDetail incomeDetail = mapper.readValue(value, IncomeDetail.class);

			incomeResponse.getIncomeDetail().add(incomeDetail);

		} catch (Exception e) {

			
			 * logger.error(e.getMessage()); logger.debug("" +
			 * HRTConstants.INVALID_DOCUMENT_CODE +
			 * " Error in Retrieving HRT Document");
			 * setErrorObect(hrtGetResponse, HRTConstants.INVALID_DOCUMENT_CODE,
			 * "Error in Retrieving HRT Document (Invalid Document) -  ");//
			 * "+ indx + " of "+queryResult.allRows().size());
			 
		}
	}

	*//**
	 * Process the results.
	 *
	 * @param incomeResponse
	 * @param value
	 *//*

	private void buildExpenseResponse(ExpenseResponse expenseResponse, String value) {

		try {

			ObjectMapper mapper = new ObjectMapper();
			ExpenseDetail expenseDetail = mapper.readValue(value, ExpenseDetail.class);

			expenseResponse.getExpenseDetail().add(expenseDetail);

		} catch (Exception e) {

			
			 * logger.error(e.getMessage()); logger.debug("" +
			 * HRTConstants.INVALID_DOCUMENT_CODE +
			 * " Error in Retrieving HRT Document");
			 * setErrorObect(hrtGetResponse, HRTConstants.INVALID_DOCUMENT_CODE,
			 * "Error in Retrieving HRT Document (Invalid Document) -  ");//
			 * "+ indx + " of "+queryResult.allRows().size());
			 
		}
	}
	
private String	generateKey(Bucket bucket,String prefixString){
		String key = "idGenerator";
		try {
		    bucket.remove(key);
		} catch (DocumentDoesNotExistException e) {
		    
		}
		try {
		    bucket.counter(key, 0, 20);
		} catch (DocumentDoesNotExistException e) {
		   // log.info("counter doesn't exist yet and no initial value was provided");
		}
		
		long nextIdNumber = bucket.counter(key, 1).content();
	//	log.info("nextIdNumber = "+ nextIdNumber);
		String id = prefixString+"::" + nextIdNumber;
		 
		  System.out.println("nextIdNumber : "+nextIdNumber);      

return  id;
	}

}*/