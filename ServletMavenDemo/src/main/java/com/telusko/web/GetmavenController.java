package com.telusko.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telusko.web.dao.Mavendao;
import com.telusko.web.model.Maven;

/**
 * Servlet implementation class GetmavenController
 */
public class GetmavenController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int aid=Integer.parseInt(request.getParameter("aid"));
		Mavendao dao=new Mavendao();
		Maven m1=dao.gettelusko_maven(aid);
		request.setAttribute("maven",m1 );
		
		RequestDispatcher rd=request.getRequestDispatcher("showmaven.jsp");
		rd.forward(request, response);
		
	}

	

}
