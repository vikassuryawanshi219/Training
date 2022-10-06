package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreInsertDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/trialdb";
		String username="root";
		String password="root";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
			 connection=DriverManager.getConnection(url,username,password);
			 String sql="insert into food values(?,?,?,?)";
			preparedStatement= connection.prepareStatement(sql);
			//set value for the place holder
			preparedStatement.setString(1,"Dosa");
			preparedStatement.setInt(2, 10);
			preparedStatement.setFloat(3, 120);
			preparedStatement.setString(4, "veg");
			// execute the statement
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(connection!=null)
				connection.close();
				if (preparedStatement!=null)
					preparedStatement.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}


	}


}
