package jdbctutorial;
import java.sql.*;
import java.lang.*;
public class jdconnect {

	
	public static void main(String[] args) {
		try
		{
		  //Class.forName("com.mysql.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Sujith@1234");
		  Statement stmt=con.createStatement();
		  ResultSet rs=stmt.executeQuery("select * from users");
		  while(rs.next())
		  {
			  System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getByte(3));
		  }
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
