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
	public void setCustRegDate(Date custRegDate) {
		this.custRegDate = custRegDate;
	}
	public double getCustRegAmt() {
		return custRegAmt;
	}
	public void setCustRegAmt(double custRegAmt) {
		this.custRegAmt = custRegAmt;
	}
	
	public CustomerBean()
	{}
	public void addUser() throws ClassNotFoundException, SQLException 
	{
		customerDAO = new CustomerDAO();
		CustomerPOJO customer = customerDAO.addUser(new CustomerPOJO(custName,custEmail,custPass,custRole,custRegDate,custRegAmt));
		
	}
	
	public CustomerBean(String custName, String custEmail, String custPass, String custRole,
			Date custRegDate, double custRegAmt) {
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPass = custPass;
		this.custRole = custRole;
		this.custRegDate = custRegDate;
		this.custRegAmt = custRegAmt;
	}
	
}