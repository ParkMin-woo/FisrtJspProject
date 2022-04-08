package com.test.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		
		// String name = "Minu";
		
		List<EmployeeVO> empList = new ArrayList<>();
		EmployeeVO emp = new EmployeeVO();
		// 1001 , 박민우, 경기도 안산시, 31
		emp.setEmpNo(1001);
		emp.setEmpName("박민우");
		emp.setEmpAddr("경기도 안산시");;
		emp.setEmpAge(31);
		empList.add(emp);
		emp = new EmployeeVO();
		emp.setEmpNo(1002);
		emp.setEmpName("한채희");
		emp.setEmpAddr("서울시 송파구");;
		emp.setEmpAge(31);
		empList.add(emp);
		// req.setAttribute("employee", emp);
		req.setAttribute("employeeList", empList);
		
		// req.setAttribute("label", name);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}
	
}
