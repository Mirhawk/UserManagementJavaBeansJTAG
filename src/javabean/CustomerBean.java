package javabean;

import java.sql.Date;
import java.sql.SQLException;

import com.sun.xml.internal.bind.v2.runtime.Name;

import dao.CustomerDAO;
import pojo.CustomerPOJO;

public class CustomerBean {
	String custName , custEmail , custPass, custRole ;
	String custRegDate;
	double custRegAmt;
	CustomerPOJO customer;
	CustomerDAO customerDAO;
	String last_action;
	
	
	public CustomerPOJO getCustomer() {
		return customer;
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public String getLast_action() {
		return last_action;
	}
	public void setLast_action(String last_action) {
		this.last_action = last_action;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustEmail() {
		return custEmail;
	}
	
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	public String getCustPass() {
		return custPass;
	}
	
	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
	
	public String getCustRole() {
		return custRole;
	}
	
	public void setCustRole(String custRole) {
		this.custRole = custRole;
	}
	
	public String getCustRegDate() {
		return custRegDate;
	}
	
	public void setCustRegDate(String custRegDate) {
		System.out.println(" from bean custRegDate"+custRegDate);
		this.custRegDate = custRegDate;
	}
	
	public double getCustRegAmt() {
		return custRegAmt;
	}
	public void setCustRegAmt(double custRegAmt) {
		this.custRegAmt = custRegAmt;
	}
	
	public CustomerBean() throws ClassNotFoundException, SQLException
	{
		customerDAO = new CustomerDAO();
		System.out.println("in bean constructor");
	}
	
	public String addUser() throws ClassNotFoundException, SQLException 
	{
		System.out.println();
		customer = customerDAO.addUser(new CustomerPOJO(custName,custEmail,custPass,custRole,Date.valueOf(custRegDate),custRegAmt));
		if(customer == null)
		{
			last_action = "Problem while logging in!";
			return "Register";
		}
		last_action = "Logged in successfully!";
		return "Success";
		
	}
}