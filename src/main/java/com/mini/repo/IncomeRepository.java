package com.mini.repo;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

import com.mini.domain.ExpenseDetail;
import com.mini.domain.IncomeDetail;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "income")
public interface IncomeRepository extends CouchbasePagingAndSortingRepository<IncomeDetail, String> {

	List<IncomeDetail> findByIncomeCode(String incomeCode);
	
	

}
