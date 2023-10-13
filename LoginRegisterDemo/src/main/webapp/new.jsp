
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1">
<title>RegisterForm</title>

</head>
<body>
	<!-- Directive-tag -->
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>

	<!-- ScripletTag -->
	<%
	try 
	{

		String usr = request.getParameter("usr");
		session.putValue("user_id", usr);
		String pwd = request.getParameter("pwd");

		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "Sujith@1234");
		Statement st = con.createStatement();
		ResultSet rs;
		
		int i = st.executeUpdate("insert into login values('" + usr + "','" + pwd + "')");
		out.println("Registered");
	} 
	catch (Exception e) 
	{
		System.out.println(e.toString());
	}
	%>



</body>
</html>