<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core " %>
   <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="ab" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/student" user="root" password="Sujith@1234"/> 

<sql:query var="rs" dataSource="${db}">select * from users</sql:query>
<c:forEach items="${rs.rows}" var="user">


</c:forEach>
 
</body>
</html> 