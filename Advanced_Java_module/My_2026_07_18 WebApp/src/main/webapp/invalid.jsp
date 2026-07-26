<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!String data; %><!-- Declaration -->
     <%data=(String)session.getAttribute("Key"); %>
     <% System.out.println("JSP");%> <!-- scriptlet -->
     <%= new Date() %> <!-- Expression tag, in java code converted to out.println(4+4) -->
</body>
</html>