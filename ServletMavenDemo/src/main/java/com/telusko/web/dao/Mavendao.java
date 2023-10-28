package com.telusko.web.dao;
import java.sql.*;
import com.telusko.web.model.Maven;

public class Mavendao 
{
  public Maven gettelusko_maven(int aid)
  {
	  Maven m=new Maven();
	  m.setAid(1);
	  m.setAname("NISANTH");
	  m.setTech("JAVA"); 

	  try
	  {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Sujith@1234");
		  Statement st=con.createStatement();
		  ResultSet rs=st.executeQuery("select * from telusko_maven where aid=" +aid);
		  
		  if(rs.next())
		  {
			  m.setAid(rs.getInt("aid"));
			  m.setAname(rs.getString("aname"));
			  m.setTech(rs.getString("tech"));
			  
		  }
		  
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	return m;
  }


}
