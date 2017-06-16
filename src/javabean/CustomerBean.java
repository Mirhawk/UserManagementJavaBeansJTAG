package javabean;

import java.sql.Date;
import java.sql.SQLException;

import com.sun.xml.internal.bind.v2.runtime.Name;

import dao.CustomerDAO;
import pojo.CustomerPOJO;

public class CustomerBean {
	String custName , custEmail , custPass, custRole ;
	Date custRegDate;
	double custRegAmt;
	CustomerPOJO customer;
	CustomerDAO customerDAO;
	String last_action;
	
	
	public CustomerPOJO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerPOJO customer) {
		this.customer = customer;
	}
	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
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
	public Date getCustRegDate() {
		return custRegDate;
	}
	public void setCustRegDate(String custRegDate) {
		this.custRegDate = Date.valueOf(custRegDate);
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
		customer = customerDAO.addUser(new CustomerPOJO(custName,custEmail,custPass,custRole,custRegDate,custRegAmt));
		if(customer == null)
		{
			last_action = "Problem while logging in!";
			return "Register";
		}
		last_action = "Logged in successfully!";
		return "Success";
		
	}
	
//	public CustomerBean(String custName, String custEmail, String custPass, String custRole,
//			Date custRegDate, double custRegAmt) {
//		this.custName = custName;
//		this.custEmail = custEmail;
//		this.custPass = custPass;
//		this.custRole = custRole;
//		this.custRegDate = custRegDate;
//		this.custRegAmt = custRegAmt;
//	}
	
}