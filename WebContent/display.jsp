<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
		사원 나이 : <c:out value="${employeeEle.empAge}" />
	</c:forEach> --%>
	<!-- java.lang.classnotfoundexception: javax.servlet.jsp.jstl.core.looptag -->
	${employeeList}
</body>
</html>