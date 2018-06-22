package com.mini.repo;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

import com.mini.domain.BusDetail;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "bus")
public interface BusRepository extends CouchbasePagingAndSortingRepository<BusDetail, String> {

	List<BusDetail> findByBusNo(String busNo);
	
	

}
