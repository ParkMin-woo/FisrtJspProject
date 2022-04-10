<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<!-- This is video.jsp view! -->
	https://www.youtube.com/watch?v=2utiA5v5rA4
	<!-- iframe 방식은 현재 권장되지 않는 방식임 -->
	<!-- <iframe width="560" height="315" src="https://youtu.be/2utiA5v5rA4" frameborder="0" allowfullscreen></iframe> -->
</body>	
</html>