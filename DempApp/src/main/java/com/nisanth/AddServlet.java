package com.nisanth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import javax.servlet.annotation.WebServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;


@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		System.out.println(k);
		
		k=k*k;
		
	//	PrintWriter out=res.getWriter();
		
	//	out.println(k);
		
		
		// calling the other servlet had two methods
		
		/*
		 * Request Dispatcher
		 * Redirect
		 */
		
//		req.setAttribute("k", k);
//        RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
//		
		
		
		
	//	res.sendRedirect("sq?k="+k);
		
		
		HttpSession session=req.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("sq");
	

}
}
