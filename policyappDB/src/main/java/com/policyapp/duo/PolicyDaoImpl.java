package com.policyapp.duo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.model.Policy;
import com.policyapp.util.DbConnection;

public class PolicyDaoImpl implements IpolicyDao {
	List<Policy> policies;
	Connection connection;
	PreparedStatement preparedStatement;
	
	
	@Override
	public void addPolicy(Policy policy) {
		
		String sql="insert into policy (policy_name varchar(20),premium float,type varchar(20),duration int,coverage varchar(20),brand varchar(20),category varchar(20), sum_assured float)values(?,?,?,?,?,?,?,?)";
		Connection connection=DbConnection.openConnection();

		try {
			preparedStatement= connection.prepareStatement(sql);
			 
			preparedStatement.setString(1,policy.getPolicyName());
			preparedStatement.setInt(2,policy.getPolicyNumber());
			preparedStatement.setDouble(3,policy.getPremium());
			preparedStatement.setString(4,policy.getType());
			preparedStatement.setInt(5,policy.getDuration());
			preparedStatement.setString(6,policy.getCoverage());
			preparedStatement.setString(7,policy.getBrand());
			preparedStatement.setString(8,policy.getCategory());
			preparedStatement.setDouble(9,policy.getSumAssured());
			
			preparedStatement.execute();
			
		}
		 catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				 DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}	
		}
		}

	@Override
	public void deletePolicy(int policyId) {
		String sql="delete from policy where policyId="+policyId;
		Connection connection=DbConnection.openConnection();
		preparedStatement=null;
		
		try {
		 preparedStatement= connection.prepareStatement(sql);
		 preparedStatement.execute(); 
		}
        
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				 DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}	
		}
		}

	@Override
	public void updatePolicy(int policyId, String coverage) {
		String sql="update policy set coverage="+coverage+" where policyId="+policyId;
		Connection connection=DbConnection.openConnection();
		
		try {
			 preparedStatement= connection.prepareStatement(sql);
			 preparedStatement.setString(1,coverage);
			 preparedStatement.setInt(2,policyId);
			 preparedStatement.executeUpdate(); 
			}
	        
			catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally {
				try {
					 DbConnection.closeConnection();
					if(preparedStatement!=null)
						preparedStatement.close();
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}	
			}
			}
@Override
public List<Policy> findAll() {
	//get the connections
	Connection connection=DbConnection.openConnection();
	//create the sql query
	String sql="select * from policy";
	PreparedStatement statement= null;
	ResultSet rs=null;
	List<Policy> policies= new ArrayList<>();
	
	
	try {
		statement=connection.prepareStatement(sql);
		rs= statement.executeQuery();
	while (rs.next());
	//get the value from the column label
		String name =rs.getString("policy_name");
		String type =rs.getString("type");
		int policyNumber =rs.getInt("policy_id");
		double premium =rs.getDouble("premium");
		int duration=rs.getInt("duration");
		String coverage =rs.getString("coverage");
		String category =rs.getString("category");
		String brand =rs.getString("brand");
		double sumAssured =rs.getDouble("sumAssured");
		
	Policy policy=new Policy(name, policyNumber, premium, type, duration, coverage, brand, brand, sumAssured);
	policies.add(policy);
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return policies;
	
	
	
}

@Override
public List<Policy> findByType(String type1) throws PolicyNotFoundException {
	//get the connections
		Connection connection=DbConnection.openConnection();
		//create the sql query
		String sql="select * from policy where type=?";
		PreparedStatement statement= null;
		ResultSet rs=null;
		//create arraylist to add the policy
		List<Policy> policies= new ArrayList<>();
		
		
		try {
			statement=connection.prepareStatement(sql);
			// set the value for the  placeholder
			statement.setString(1, type1);
			rs= statement.executeQuery();
		while (rs.next());
		//get the value from the column label
			String name =rs.getString("policy_name");
			String type =rs.getString("type");
			int policyNumber =rs.getInt("policy_id");
			double premium =rs.getDouble("premium");
			int duration=rs.getInt("duration");
			String coverage =rs.getString("coverage");
			String category =rs.getString("category");
			String brand =rs.getString("brand");
			double sumAssured =rs.getDouble("sumAssured");
			
		Policy policy=new Policy(name, policyNumber, premium, type, duration, coverage, brand, brand, sumAssured);
		policies.add(policy);
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return policies;
	
	
}

@Override
public List<Policy> findByCategory(String category1) throws PolicyNotFoundException {
	//get the connections
			Connection connection=DbConnection.openConnection();
			//create the sql query
			String sql="select * from policy where category=?";
			PreparedStatement statement= null;
			ResultSet rs=null;
			//create arraylist to add the policy
			List<Policy> policies= new ArrayList<>();
			
			
			try {
				statement=connection.prepareStatement(sql);
				// set the value for the  placeholder
				statement.setString(1, category1);
				rs= statement.executeQuery();
			while (rs.next());
			//get the value from the column label
				String name =rs.getString("policy_name");
				String type =rs.getString("type");
				int policyNumber =rs.getInt("policy_id");
				double premium =rs.getDouble("premium");
				int duration=rs.getInt("duration");
				String coverage =rs.getString("coverage");
				String category =rs.getString("category");
				String brand =rs.getString("brand");
				double sumAssured =rs.getDouble("sumAssured");
				
			Policy policy=new Policy(name, policyNumber, premium, type, duration, coverage, brand, brand, sumAssured);
			policies.add(policy);
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return policies;
		
	
	
}

@Override
public List<Policy> findByHighSunAssured(double sumAssured1) throws PolicyNotFoundException {
	//get the connections
	Connection connection=DbConnection.openConnection();
	//create the sql query
	String sql="select * from policy where category=?";
	PreparedStatement statement= null;
	ResultSet rs=null;
	//create arraylist to add the policy
	List<Policy> policies= new ArrayList<>();
	
	
	try {
		statement=connection.prepareStatement(sql);
		// set the value for the  placeholder
		statement.setDouble(1, sumAssured1);
		rs= statement.executeQuery();
	while (rs.next());
	//get the value from the column label
		String name =rs.getString("policy_name");
		String type =rs.getString("type");
		int policyNumber =rs.getInt("policy_id");
		double premium =rs.getDouble("premium");
		int duration=rs.getInt("duration");
		String coverage =rs.getString("coverage");
		String category =rs.getString("category");
		String brand =rs.getString("brand");
		double sumAssured =rs.getDouble("sumAssured");
		
	Policy policy=new Policy(name, policyNumber, premium, type, duration, coverage, brand, brand, sumAssured);
	policies.add(policy);
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return policies;
}

@Override
public List<Policy> findByCoverage(String coverage1) throws PolicyNotFoundException {
	//get the connections
	Connection connection=DbConnection.openConnection();
	//create the sql query
	String sql="select * from policy where category=?";
	PreparedStatement statement= null;
	ResultSet rs=null;
	//create arraylist to add the policy
	List<Policy> policies= new ArrayList<>();
	
	
	try {
		statement=connection.prepareStatement(sql);
		// set the value for the  placeholder
		statement.setString(1, coverage1);
		rs= statement.executeQuery();
	while (rs.next());
	//get the value from the column label
		String name =rs.getString("policy_name");
		String type =rs.getString("type");
		int policyNumber =rs.getInt("policy_id");
		double premium =rs.getDouble("premium");
		int duration=rs.getInt("duration");
		String coverage =rs.getString("coverage");
		String category =rs.getString("category");
		String brand =rs.getString("brand");
		double sumAssured =rs.getDouble("sumAssured");
		
	Policy policy=new Policy(name, policyNumber, premium, type, duration, coverage, brand, brand, sumAssured);
	policies.add(policy);
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return policies;
}

@Override
public List<Policy> findByLessPremium(double premium1) throws PolicyNotFoundException {
	//get the connections
	Connection connection=DbConnection.openConnection();
	//create the sql query
	String sql="select * from policy where category=?";
	PreparedStatement statement= null;
	ResultSet rs=null;
	//create arraylist to add the policy
	List<Policy> policies= new ArrayList<>();
	
	
	try {
		statement=connection.prepareStatement(sql);
		// set the value for the  placeholder
		statement.setDouble(1, premium1);
		rs= statement.executeQuery();
	while (rs.next());
	//get the value from the column label
		String name =rs.getString("policy_name");
		String type =rs.getString("type");
		int policyNumber =rs.getInt("policy_id");
		double premium =rs.getDouble("premium");
		int duration=rs.getInt("duration");
		String coverage =rs.getString("coverage");
		String category =rs.getString("category");
		String brand =rs.getString("brand");
		double sumAssured =rs.getDouble("sumAssured");
		
	Policy policy=new Policy(name, policyNumber, premium, type, duration, coverage, brand, brand, sumAssured);
	policies.add(policy);
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return policies;
}

@Override
public List<Policy> findByLessBrand(String brand1) throws PolicyNotFoundException {
	//get the connections
	Connection connection=DbConnection.openConnection();
	//create the sql query
	String sql="select * from policy where category=?";
	PreparedStatement statement= null;
	ResultSet rs=null;
	//create arraylist to add the policy
	List<Policy> policies= new ArrayList<>();
	
	
	try {
		statement=connection.prepareStatement(sql);
		// set the value for the  placeholder
		statement.setString(1, brand1);
		rs= statement.executeQuery();
	while (rs.next());
	//get the value from the column label
		String name =rs.getString("policy_name");
		String type =rs.getString("type");
		int policyNumber =rs.getInt("policy_id");
		double premium =rs.getDouble("premium");
		int duration=rs.getInt("duration");
		String coverage =rs.getString("coverage");
		String category =rs.getString("category");
		String brand =rs.getString("brand");
		double sumAssured =rs.getDouble("sumAssured");
		
	Policy policy=new Policy(name, policyNumber, premium, type, duration, coverage, brand, brand, sumAssured);
	policies.add(policy);
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return policies;
}

@Override
public Policy findById(int policyId) throws IdNotFoundException {
	//get the connections
	Connection connection=DbConnection.openConnection();
	//create the sql query
	String sql="select * from policy where category=?";
	PreparedStatement statement= null;
	ResultSet rs=null;
	//create arraylist to add the policy
	List<Policy> policies= new ArrayList<>();
	
	
	try {
		statement=connection.prepareStatement(sql);
		// set the value for the  placeholder
		statement.setInt(1, policyId);
		rs= statement.executeQuery();
	while (rs.next());
	//get the value from the column label
		String name =rs.getString("policy_name");
		String type =rs.getString("type");
		int policyNumber =rs.getInt("policy_id");
		double premium =rs.getDouble("premium");
		int duration=rs.getInt("duration");
		String coverage =rs.getString("coverage");
		String category =rs.getString("category");
		String brand =rs.getString("brand");
		double sumAssured =rs.getDouble("sumAssured");
		
	Policy policy=new Policy(name, policyNumber, premium, type, duration, coverage, brand, brand, sumAssured);
	policies.add(policy);
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return policies.stream().findFirst().get();
}
private List<Policy> showAllPolicies(){
	return Arrays.asList(
			new Policy("jeevan sathi",2000,0, "term",10,"marrige","tata","general",2000000),
			new Policy("jeevan raksha",1001,2000,"term",10,"marrige","infosys","general",2000000),
			new Policy("jeevan sathi",1001,2000,"long",10,"marriage","general","general", 2000000),
			new Policy("jeevan sathi",1001,2000,"term",10,"marrige","retire",null, 2000000),
			new Policy("jeevan sathi",1001,2000,"term",10,"marrige","general",null, 2000000)
			);

}}
