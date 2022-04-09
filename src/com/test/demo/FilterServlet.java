package com.test.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ParseConversionEvent;

/**
 * Servlet implementation class FilterServlet
 */
@WebServlet(description = "Servlet Filter Practical", urlPatterns = { "/addEmployee" })
public class FilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// doGet(request, response);
		/*
		// 사용자에게 보내는 방식을 결정
		response.setCharacterEncoding("UTF-8");
		// Content 해석 방식을 알려줌
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		*/
		
		System.out.println("In FilterServlet");
		
		int empNo = Integer.parseInt(request.getParameter("empNo"));
		String empName = request.getParameter("empName");
		
		PrintWriter out = response.getWriter();
		out.println("Welcome " + empName);
	}

}
