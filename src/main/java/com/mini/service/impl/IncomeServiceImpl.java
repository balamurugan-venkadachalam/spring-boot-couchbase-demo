package com.mini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.domain.IncomeDetail;
import com.mini.repo.IncomeRepository;
import com.mini.service.IncomeService;

@Service
public class IncomeServiceImpl implements IncomeService {

	@Autowired
	protected IncomeRepository incomeRepository;

	@Override
	public void saveIncome(IncomeDetail incomeDetail) {
		incomeRepository.save(incomeDetail);
		
	}

	@Override
	public IncomeDetail findIncomeDetail(String incomeCode) {

		return incomeRepository.findOne(incomeCode);
	}
	

}
