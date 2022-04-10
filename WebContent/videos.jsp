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
		String userName = (String) session.getAttribute("userName");
		String userPassword = (String) session.getAttribute("userPassword");
		
		if(userName == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<!-- This is video.jsp view! -->
	https://www.youtube.com/watch?v=2utiA5v5rA4
</body>
</html>