package com.user;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FirstServletFilter
 */
@WebFilter("/Servlet")
public class FirstServletFilter implements Filter {

    /**
     * Default constructor. 
     */
    public FirstServletFilter() {
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
		String FN=request.getParameter("first_name");
		if(FN==null || FN=="")
		{ System.out.println("Pre-processing filter");
			response.getWriter().println("Please enter the valid name");
		}
		else{
			System.out.println("post processing filter");
			response.getWriter().println("<center>");
			chain.doFilter(request, response);
			response.getWriter().println("</center>");
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("fdsfdf");
	}

}
