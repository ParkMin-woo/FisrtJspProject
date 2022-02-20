package com.test.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		try {
			/*
			PrintWriter out = response.getWriter();
			out.println("result is " + k);
			*/
			// Request Dispatcher and Redirect
			// RequestDispatcher rd = request.getRequestDispatcher("square");
			
			// Session Management
			// request.setAttribute("k", k);
			// rd.forward(request, response);
			// 커밋 테스트
			
			response.sendRedirect("square?k="+k);		// URL Rewriting
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
