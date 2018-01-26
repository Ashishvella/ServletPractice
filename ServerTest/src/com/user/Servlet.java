package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(name = "WebInitParamExample",urlPatterns={"/Servlet"},initParams=@WebInitParam(name="Country",value="INDIA"))
//@WebServlet("/Servlet")
public class Servlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "Using GET Method to Read Form Data";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      HttpSession session=request.getSession();
	      ServletContext context=request.getServletContext();
	      
	      String FN=request.getParameter("first_name");
	      String LN=request.getParameter("last_name");
	      if(FN!=null &&  FN!="" && LN!="" && LN!=null){
	      request.setAttribute("first_name", FN);
	      request.setAttribute("last_name",LN);
	      session.setAttribute("first_name", FN);
	      session.setAttribute("last_name",LN);
	      
	      context.setAttribute("first_name", FN);
	      context.setAttribute("last_name", LN);
	      }
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	              "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +
	                  "  <li><b>First Name</b>: "
	                  + request.getParameter("first_name") + "\n" +
	                  "  <li><b>Last Name</b>: "
	                  + request.getParameter("last_name") + "\n" +
	               "</ul>\n" +
	     "Request value is:"+          request.getAttribute("first_name")+"<br>"+
	     "Session value is:"+        session.getAttribute("first_name")+"<br>"+
	     "context value is" +         context.getAttribute("first_name")+"<br>"+
	            "</body>"+
	                "</html>"
	            
	            
	                
	      );
	      
	      if(request.getParameter("first_name").equals("Ashish"))
	      {
	      RequestDispatcher rd= request.getRequestDispatcher("Servlet2");
	      rd.forward(request, response);
	      
	      }
	      if(request.getParameter("first_name").equals("ashish"))
	    	  response.sendRedirect("http://www.amazon.com");
	      }
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
		 

	      PrintWriter out = response.getWriter();
	      String title = "Using POST Method to Read Form Data";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      HttpSession session=request.getSession();
	      ServletContext context=request.getServletContext();
	      String FN=request.getParameter("first_name");
	      String LN=request.getParameter("last_name");
	      if(FN!=null &&  FN!="" && LN!="" && LN!=null){
	      request.setAttribute("first_name", FN);
	      request.setAttribute("last_name",LN);
	      session.setAttribute("first_name", FN);
	      session.setAttribute("last_name",LN);
	      
	      context.setAttribute("first_name", FN);
	      context.setAttribute("last_name", LN);
	      }
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	              "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +
	            
	                  "  <li><b>First Name</b>: "
	                  + request.getParameter("first_name") + "\n" +
	                  "  <li><b>Last Name</b>: "
	                  + request.getParameter("last_name") + "\n" +
	               "</ul>\n" +
	     "Request value is:"+          request.getAttribute("first_name")+"<br>"+
	     "Session value is:"+        session.getAttribute("first_name")+"<br>"+
	     "context value is" +         context.getAttribute("first_name")+"<br>"+
	     "Blood Group of the person is"+ request.getParameter("bg")+
	          "</body>"+
	                "</html>"
	            
	                
	      );
	      String[] values= request.getParameterValues("qual");
	      List list=Arrays.asList("values");
	      out.println("wgsdfhwgefgw");
	      for(String e:values)
	      {
	    	  out.println(e);
	    	  
	      }
	      
	      
	}

	
}
