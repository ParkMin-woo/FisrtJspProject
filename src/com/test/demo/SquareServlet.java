package com.test.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// RequestDispatcher�� �ٸ� servlet���� ���� servlet�� �Ķ���� ȣ�� �� getAttribute ���
		// int k = (int) req.getAttribute("k");
		
		// response.sendRedirect�� �ٸ� servlet���� ���� servlet�� �Ķ���� ȣ�� �� getParameter ���
		int k = Integer.parseInt(req.getParameter("k"));
		k = k*k;
		
		PrintWriter out = resp.getWriter();
		// out.println("Hello To Square!");
		out.println("result is " + k);
		// System.out.println("square called");
	}
}
