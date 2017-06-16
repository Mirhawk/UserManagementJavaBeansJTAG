<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<jsp:useBean id="custBean" class="javabean.CustomerBean" scope="session"/>

<body>

<div align="right">
	${sessionScope.custBean.last_action}
</div>

<form class="form-horizontal" action='reg_cust.jsp' method="POST">
  <fieldset>
    <div id="legend">
      <legend class="">Register</legend>
    </div>
    <div class="control-group">
      <!-- Username -->
      <label class="control-label"  for="Customer_
      Name">Customer Name</label>
      <div class="controls">
        <input type="text" id="custName" name="custName" placeholder="" class="input-xlarge">
        <p class="help-block">Username can contain any letters or numbers, without spaces</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="email">E-mail</label>
      <div class="controls">
        <input type="text" id="custEmail" name="custEmail" placeholder="" class="input-xlarge">
        <p class="help-block">Please provide your E-mail</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password-->
      <label class="control-label" for="password">Password</label>
      <div class="controls">
        <input type="password" id="custPass" name="custPass" placeholder="" class="input-xlarge">
        <p class="help-block">Password should be at least 4 characters</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Role -->
      <label class="control-label"  for="role">Role</label>
      <div class="controls">
        <input type="text" id="custRole" name="custRole" placeholder="" class="input-xlarge">
        <p class="help-block">Please enter Role</p>
      </div>
    </div>
    
    
    <div class="control-group">
      <!-- Registration Date -->
      <label class="control-label"  for="Registration_Date">Registration Date</label>
      <div class="controls">
        <input type="date" id="custRegDate" name="custRegDate" placeholder="" class="input-xlarge">
      </div>
    </div>
    
    
    <div class="control-group">
      <!-- Registration Date -->
      <label class="control-label"  for="Registration_Amount">Registration Amount</label>
      <div class="controls">
        <input type="cal" id="custRegAmt" name="custRegAmt" placeholder="" class="input-xlarge">
      </div>
    </div>
 
 	
 
 <br><br>
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
        <button class="btn btn-success">Register</button>
      </div>
    </div>
  </fieldset>
</form>

</body>
</html>