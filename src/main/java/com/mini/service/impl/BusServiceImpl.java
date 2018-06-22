package com.mini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.domain.BusDetail;
import com.mini.domain.ExpenseDetail;
import com.mini.repo.BusRepository;
import com.mini.repo.ExpenseRepository;
import com.mini.service.BusService;
import com.mini.service.ExpenseService;

@Service
public class BusServiceImpl implements BusService {

	@Autowired
	protected BusRepository busRepository;

	@Override
	public void saveBus(BusDetail busDetail) {
		busRepository.save(busDetail);
		
	}

	@Override
	public BusDetail findBusDetail(String busNo) {
		
		return busRepository.findOne(busNo);
	}
	
	
	
}
