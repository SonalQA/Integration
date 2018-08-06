package com.example.grid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import  java.sql.SQLException;


import org.testng.annotations.Test;

public class DBCon {
    String dbUrl = "jdbc:mysql://staging-w.chxa3rfcsvdc.us-west-2.rds.amazonaws.com:3306/platinum";					
    //Database Username		
	String username = "entytle";	
    //Database Password		
	String password = "EntytleStage##9632";
	//Query to Execute		
	String query = "select *  from MasterUser;";
  @Test
  public void f() throws ClassNotFoundException,SQLException  {
	//Load mysql jdbc driver		
 	    Class.forName("com.mysql.jdbc.Driver");
 	 //Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	   Statement stmt = con.createStatement();					
	// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);							

		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String myName = rs.getString(1);								        
                   String myAge = rs.getString(2);					                               
                   System. out.println(myName+"  "+myAge);		
           }		
			 // closing DB Connection		
			con.close();			
}

  }
