package com.test.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class NoFilter
 */
@WebFilter("/addEmployee")
public class NoFilter implements Filter {

    /**
     * Default constructor. 
     */
    public NoFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("In NoFilter");
		// 사용자에게 보내는 방식을 결정
		response.setCharacterEncoding("UTF-8");
		// Content 해석 방식을 알려줌
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		HttpServletRequest req = (HttpServletRequest) request;
		int empNo = Integer.parseInt(request.getParameter("empNo"));
		
		if(empNo>1000) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		else {
			out.println("Invalid Input");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
