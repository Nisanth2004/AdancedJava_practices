<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <c:set var="str" value="Nisanth Frontend developer" />
  Length:${fn:length(str)}
  <c:forEach items="${fn:split(str,' ') }" var="s">
 <br>
 ${s}
  </c:forEach>
  
  <br>
  <br>
  index:${fn:indexOf(str,"d")}
  <br>
  <br>
  is there:${fn:contains(str,"Frontend")  }
  
  <br>
  <br>
  
  <c:if test="${fn:endsWith(str,'developer') }">
    You are right man
  </c:if>
  <br>
  ${fn:toUpperCase(str) }
  <br>
  ${fn:toLowerCase(str) }
  </body>
</html>