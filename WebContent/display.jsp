<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
<body>
	<!-- Hello World. -->
	
	<%-- ${label}<br> --%>
	<%-- <c:import url="https://www.naver.com/" />
	<c:out value="${label}" /> --%>
	
	<%-- 사번 : <c:out value="${employee.empNo}" /><br>
	사원명 : <c:out value="${employee.empName}" /><br>
	사원 주소 : <c:out value="${employee.empAddr}" /><br>
	사원 나이 : <c:out value="${employee.empAge}" /> --%>
	
	<%-- <c:forEach var="employeeEle" items="${employeeList}">
		사번 : <c:out value="${employeeEle.empNo}" /><br>
		사원명 : <c:out value="${employeeEle.empName}" /><br>
		사원 주소 : <c:out value="${employeeEle.empAddr}" /><br>
		사원 나이 : <c:out value="${employeeEle.empAge}" /><br>
		<h6>--------------------------------------------</h6>
	</c:forEach> --%>
	<!-- java.lang.classnotfoundexception: javax.servlet.jsp.jstl.core.looptag -->
	<%-- ${employeeList} --%>
	
	<sql:setDataSource var="db" driver="org.mariadb.jdbc.Driver" url="jdbc:mariadb://localhost:3306/test" user="temp1" password="1234" />
	<sql:query var="rs" dataSource="${db}">
		select * from emp_test_table
	</sql:query>
	<c:forEach var="emp" items="${rs.rows}">
		empNo : <c:out value="${emp.emp_no}" /><br>
		empName : <c:out value="${emp.emp_name}" /><br>
		empAddr : <c:out value="${emp.emp_addr}" /><br>
		empAge : <c:out value="${emp.emp_age}" /><br>
		<h6>--------------------------------------------</h6>
	</c:forEach>
	
</body>
</html>