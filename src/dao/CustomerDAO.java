package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pojo.CustomerPOJO;

import static db.DBConnection.*;

public class CustomerDAO {
	Connection connection;
	PreparedStatement preparedStatement;
	
	public CustomerDAO() throws ClassNotFoundException, SQLException {
		connection = getDBConnection();
	}
	
	public void cleanUp() throws SQLException {
		if(preparedStatement != null)
			preparedStatement.close();
		
		if(connection != null)
			connection.close();
	}
	
	public CustomerPOJO addUser(CustomerPOJO customer) throws SQLException {
		String addUserSQLQuery = "INSERT INTO customers (name, email, password, role, regdate, regAmt) VALUES (?,?,?,?,?,?)";
		preparedStatement = connection.prepareStatement(addUserSQLQuery);
		preparedStatement.setString(1, customer.getCustName());
		preparedStatement.setString(2, customer.getCustEmail());
		preparedStatement.setString(3, customer.getCustPass());
		preparedStatement.setString(4, customer.getCustRole());
		preparedStatement.setDate(5,customer.getCustRegDate());
		preparedStatement.setDouble(6, customer.getCustRegAmt());
		
		int rowsAffectedCount = preparedStatement.executeUpdate();
		
		if(rowsAffectedCount == 1)
			
		
		
		return null;
	}
}
