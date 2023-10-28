<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.telusko.web.model.Maven " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
in show alien
<%
   Maven m1=(Maven)request.getAttribute("maven"); 
out.println(m1);
   %>
</body>
</html>