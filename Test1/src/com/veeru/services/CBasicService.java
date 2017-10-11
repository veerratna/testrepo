package com.veeru.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veeru.doa.IBasicDao;

@Service
public class CBasicService implements IBasicServices {

	@Autowired
	
	IBasicDao basicDao;
	
	@Override
	public String newPlanInsert(String planName) throws SQLException {
		return basicDao.insertPlan(planName);
	}

	@Override
	public List<String> getAllPlans() throws SQLException {
		return basicDao.fetchAllPlans();
	}

	
	
}
