package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginUser {

	public static void main(String[] args) throws SQLException {
		Connection con=Helper.getC();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your email");
		String email=sc.next();
		
		PreparedStatement ps=con.prepareStatement("select * from user where email=?");
		ps.setString(1, email);
		
		ps.execute();
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
		   if(rs.getString(3).equals(email))	
		   {
		     	  System.out.println("enter email is correct");
		     	  System.out.println("enter your password");
		    	  String pass=sc.next();
		    	  if(rs.getString(4).equals(pass))
			      {
				    System.out.println("password is correct");
				    System.out.println("welcome");	
			      }
			      else
			      {
				   System.out.println("password is incorrect");
			      }
		    	
		   }
		   else
		   {
			    System.out.println("enter email is incorrect");
		   }

		}
		
		else
		{
			System.out.println("invalid eamil");
		}	
	}
	 
}
