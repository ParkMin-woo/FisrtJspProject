package com.test.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	/*public void service(HttpServletRequest request , HttpServletResponse response) {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		System.out.println("result is " + k);
		
		git test
		branch test
		hh
		브랜치 커밋은 오랜만...
		
		try {
			PrintWriter out = response.getWriter();
			out.println("result is " + k);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}*/
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		System.out.println("result is " + k);
		
		try {
			PrintWriter out = response.getWriter();
			out.println("result is " + k);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
