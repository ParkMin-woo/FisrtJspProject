<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- minu<br>
	gyeonggi<br>
	31 -->

	<%
		String className = "org.mariadb.jdbc.Driver";
		Class.forName(className);
		
		String url = "jdbc:mariadb://localhost:3306/test";
		String user = "temp1";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "SELECT * FROM emp_test_table a WHERE a.emp_no = 1002";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		rs.next();
	%>
	
	empNo : <%= rs.getString(1) %><br>
	empName : <%= rs.getString(2) %><br>
	empAddr : <%= rs.getString(3) %><br>
	empAge : <%= rs.getString(4) %>

</body>
</html>