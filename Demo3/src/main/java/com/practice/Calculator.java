package com.practice;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Calculator extends HttpServlet{
    public void service(ServletRequest req,ServletResponse res) throws IOException
    {
   	 res.setContentType("text/html");
   	 int x=Integer.parseInt(req.getParameter("num1"));
   int y=	Integer.parseInt( req.getParameter("num2"));
   res.getWriter().print("The Addition is "+(x+y));
   		 
   		 
   	 }
   	 
   	 

}
