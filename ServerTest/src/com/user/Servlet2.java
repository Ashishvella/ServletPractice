package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet(name = "WebInitParamExample2",urlPatterns={"/Servlet2"},initParams=@WebInitParam(name="Country",value="INDIA"))
//@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title="Servlet2";
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html> ");
		out.println("<head><title>"+title+""+"</title></html>");
		
		out.println(request.getParameter("first_name")+"<br>");
		out.println("You Are accessing this Servlet from:");
		out.println(getServletConfig().getInitParameter("Country"));
		//out.println(getServletContext().setInitParameter("Country", "Pakistan"));
		out.println(getServletContext().getInitParameter("country"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
