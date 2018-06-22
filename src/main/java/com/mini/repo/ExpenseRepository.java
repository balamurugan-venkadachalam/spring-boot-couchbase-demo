package com.mini.repo;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

import com.mini.domain.ExpenseDetail;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "expense")
public interface ExpenseRepository extends CouchbasePagingAndSortingRepository<ExpenseDetail, String> {

	List<ExpenseDetail> findByExpenseCode(String expenseCode);
	
	

}
