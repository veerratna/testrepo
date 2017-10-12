package com.service;

import java.sql.*;

public class DbCon {

	/*
	Class.forName("org.hsqldb.jdbcDriver").newInstance();
	Connection connexion = DriverManager.getConnection("jdbc:h2:test", "sa",  "");*/
	
	public void testingDbCon()
	{
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
	}
	
}
