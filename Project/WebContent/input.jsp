<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LightSlateGray ">
<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 1:

%>
<p></p>
<p></p>
<center>
<form action="LoginServlet" method="post">
<fieldset><legend>Login</legend>
<p></p><table>
<tr><td><label>Username</label></td><td><input type="text" name="uname" placeholder="enter username" required></td></tr>
<tr><td align="right"><label>Password</label></td><td><input type="password" name="pword" placeholder="enter password" required></td></tr>
<tr><td colspan="3" align="center"><input type="submit" value="login"></td></tr>
</table>
</fieldset>
</form>
</center>
<%
break;
case 2:
valid = false;
	%>
	<p></p>
	<p></p>
	<center>
	<form action="SignupServlet" method="post">
	<fieldset>
	<legend>Sign-up form</legend>
	<table>
	<tr><td><label>Firstname</label></td><td><input type="text" name="fname" placeholder="firstname" required><br></td></tr>
	<tr><td><label>Lastname</label></td><td><input type="text" name="lname" placeholder="lastname" required><br></td></tr>
	<tr><td><label>Username</label></td><td><input type="text" name="uname" placeholder="username" required><br></td></tr>
	<tr><td><label>Password</label></td><td><input type="password" name="pword" placeholder="password" required><br></td></tr>
	<tr><td><label>Department</label></td><td><label for="cse">CSE</label> <input type="radio" name="department" id="cse" value="CSE" checked="checked">
	<label for="ece">ECE</label> <input type="radio" name="department" id="ece" value="ECE">
	<label for="ise">ISE</label> <input type="radio" name="department" id="ise" value="ISE" >
	</td></tr>
	<tr><td><label>Current Year</label></td><td><label for="1">1st year</label> <input type="radio" name="year" id="1" value="first" checked="checked">
	<label for="2">2nd year</label> <input type="radio" name="year" id="2" value="second" >
	<label for="3">3rd year</label> <input type="radio" name="year" id="3" value="third" >
	<label for="3">4th year</label> <input type="radio" name="year" id="4" value="fourth" >
	</td></tr>
	<tr><td><label>DOB</label></td><td><input type="text" name="dob" placeholder="DD/MM/YYYY" required><br></td></tr>
	<tr><td><label>Gender</label></td><td><label for="m">Male</label> <input type="radio" name="gender" id="m" value="M" checked="checked"> <label for="f">Female</label><input type="radio" name="gender" id="f" value="F"><br></td></tr>
		<tr><td colspan="2" align="center"><input type="submit" value="signup"></td></tr>
		</table>
	</fieldset>
	</form>
	</center>
<%break;
}
if (valid) {
%>

<%
}
%>
</body>
</html>