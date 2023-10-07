<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PROFILE</title>
</head>
<body>
	     
	<br>
	<br>

	<%
	Class.forName("com.mysql.jdbc.Driver");
	java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "Sujith@1234");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from login");

	rs.next();
	%>
	
	UserName:<%=rs.getString(1)%><br> Password:<%=rs.getString(2)%><br>
	

</body>
</html>