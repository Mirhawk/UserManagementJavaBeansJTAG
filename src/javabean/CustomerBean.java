package javabean;

import java.util.Date;

public class CustomerBean {
	String custName , custEmail , custPass, custRole ;
	Date custRegDate;
	double custRegAmt;
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