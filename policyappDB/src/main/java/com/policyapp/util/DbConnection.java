package com.policyapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	 static Connection connection;
	 public static Connection openConnection() {
		 String url="jdbc:mysql://localhost:3306/trialdb";
		 String username= "root";
		 String password ="root";
		 Statement statement=null;
		 
		 try {
			connection=DriverManager.getConnection(url,username,password);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return connection;
	 }
	 
	public static void closeConnection() {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
