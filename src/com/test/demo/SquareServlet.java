package com.test.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// int k = Integer.parseInt(req.getParameter("k"));
		int k = (int) req.getAttribute("k");
		
		PrintWriter out = resp.getWriter();
		// out.println("Hello To Square!");
		out.println("result is " + k);
	}
}
