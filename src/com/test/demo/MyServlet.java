package com.test.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hi!");
		
		/*ServletContext context = getServletContext();
		String name = context.getInitParameter("name");
		out.println("My name is " + name);
		String phone = context.getInitParameter("phone");
		out.println("My phone is " + phone);*/
		
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("name");
		out.println("My name is " + name);
	}

}
