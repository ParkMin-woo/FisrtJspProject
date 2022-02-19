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
		// RequestDispatcher로 다른 servlet에서 이전 servlet의 파라미터 호출 시 getAttribute 사용
		// int k = (int) req.getAttribute("k");
		
		// response.sendRedirect로 다른 servlet에서 이전 servlet의 파라미터 호출 시 getParameter 사용
		int k = Integer.parseInt(req.getParameter("k"));
		k = k*k;
		
		PrintWriter out = resp.getWriter();
		// out.println("Hello To Square!");
		out.println("result is " + k);
		// System.out.println("square called");
	}
}
