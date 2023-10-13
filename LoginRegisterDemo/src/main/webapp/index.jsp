<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	<%
	try 
	{
		String user_id = request.getParameter("usr");
		session.putValue("user_id", user_id);
		String pwd = request.getParameter("pwd");
		
		
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sujith@1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from login where user_id='" + user_id + "'");

		if (rs.next()) 
		{
			if (rs.getString(2).equals(pwd)) 
			{
		        out.println("welcome-----" + user_id);
			} 
			else 
			{
		        out.println("Invalid Password Try Again......!");
			}
		} 
		    else
		   {

		   }
	  } 
	       catch (Exception e) 
	       {
		       System.out.println(e.toString());
	       }
	%>
</body>
</html>