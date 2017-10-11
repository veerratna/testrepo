package com.veeru.services;

import java.sql.SQLException;
import java.util.List;

public interface IBasicServices {

	public String newPlanInsert(String planName) throws SQLException;
	public List<String> getAllPlans() throws SQLException;
	
}
