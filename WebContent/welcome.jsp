<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");	// HTTP 1.1
		response.setHeader("Pragma" , "no-cache");	// HTTP 1.0
		response.setHeader("Expires" , "0");	// Proxies
	
		String userName = (String) session.getAttribute("userName");
		String userPassword = (String) session.getAttribute("userPassword");
		
		if(userName == null) {
			response.sendRedirect("login.jsp");
		}
	%>

	welcome <c:out value="${userName}" />!<br>
	<a href="videos.jsp">videos here</a>
	
	<form action="logout" method="post">
		<input type="submit" value="logout" />
	</form>
	
</body>
</html>