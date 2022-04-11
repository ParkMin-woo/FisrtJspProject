package com.test.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "login view servlet logic", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		LoginDAO loginDAO = new LoginDAO();
		
		if(userName != null && userPassword != null) {
			/*
			if(userName.equals("mwpark0930") && userPassword.equals("learning")) {
				HttpSession session = request.getSession();
				session.setAttribute("userName", userName);
				session.setAttribute("userPassword", userPassword);
				response.sendRedirect("welcome.jsp");
			}
			else {
				response.sendRedirect("login.jsp");
			}
			*/
			if(loginDAO.check(userName, userPassword)) {
				HttpSession session = request.getSession();
				session.setAttribute("userName", userName);
				session.setAttribute("userPassword", userPassword);
				response.sendRedirect("welcome.jsp");
			}
			else {
				response.sendRedirect("login.jsp");
			}
		}
		else {
			response.sendRedirect("login.jsp");
		}
		
		// doGet(request, response);
	}

}
