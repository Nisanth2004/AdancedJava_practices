package com.practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/new")

public class HtmlServlet extends HttpServlet{
    public void service(ServletRequest req,ServletResponse res) throws IOException, ServletException
    {
    	req.getRequestDispatcher("new.html").forward(req, res);
    	
    	
    }
    

}
