package com.nisanth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
	//	int k=Integer.parseInt(req.getParameter("k"));
		
		HttpSession session=req.getSession();
		int k=(int) session.getAttribute("k");
		PrintWriter out=res.getWriter();
		
		
		  out.println("hello to Sq servlet");
		  out.println(k);
	} 

}
