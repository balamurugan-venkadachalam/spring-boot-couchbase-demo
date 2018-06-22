package com.mini.service;

import java.util.List;

import com.mini.domain.BusDetail;

public interface BusService {
	
	public void saveBus(BusDetail busDetail) ;
	
	public BusDetail findBusDetail(String busNo) ;
	
}
