package com.veeru.doa;

import java.sql.*;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CBasicDao implements IBasicDao {

	private Connection dbConnection = null;
	@Override
	public void setupDB() {
	      
	}

	@Override
	public String insertPlan(String planName) throws SQLException {
		
		try {
	        Class.forName("org.h2.Driver");
	        Connection conn = DriverManager.
	            getConnection("jdbc:h2:~/test", "sa", "");
	        // add application code here
	        
	        
	        ResultSet rs=conn.createStatement().executeQuery("SELECT * FROM TEST");
	        
	        while (rs.next()) {
				System.out.println("Id- "+rs.getInt("Id")+" Name- "+rs.getString("NAME"));
			}
	        System.out.println("test successfull");
	        conn.close();
	    }
	   catch (Exception e) {
	System.out.println(e.getMessage());
	}
		
		
		  return null;
	}

	@Override
	public List<String> fetchAllPlans() throws SQLException {
		System.out.println("Dao Called2");
		this.setupDB();
		Connection con = this.dbConnection;
		Statement stmt = null;
		 ResultSet rs = stmt.executeQuery("select * from PERSON");
         System.out.println("H2 Database inserted through Statement");
         while (rs.next()) {
             System.out.println("Id "+rs.getInt("id")+" Name "+rs.getString("name"));
         }
         stmt.close();
         con.commit();

         this.dbConnection=null;
		return null;
	}

}
