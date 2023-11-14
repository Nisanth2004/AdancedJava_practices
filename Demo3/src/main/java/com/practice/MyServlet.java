package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 
 * 
 * Servlet Filters Demo
 */
@WebServlet("/addAlien")
public class MyServlet extends HttpServlet {

	
	   protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	   {
		   PrintWriter out=response.getWriter();
		   String aname=request.getParameter("aname");
		   int aid=Integer.parseInt(request.getParameter("aid"));
		   out.println("Welcome "+aname);
	   }
}
