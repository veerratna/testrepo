package com.veeru.doa;

import java.sql.SQLException;
import java.util.List;

public interface IBasicDao {

	public void setupDB();
	public String insertPlan(String planName) throws SQLException;
	public List<String> fetchAllPlans() throws SQLException;
	
}
