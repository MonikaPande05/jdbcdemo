package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchDataDynamically {

	public static void main(String[] args) throws SQLException {
		/*
         * step1:first create a connection between database and java application
         *
         */
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","Hope");

//      step2:take a input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to fetch the data");
		int id=sc.nextInt();
		
//		step3: To perform the operation dynamically in the database use preparedStatement interface.
		PreparedStatement ps=con.prepareStatement("select * from user where id=?");
	
//		step4:Now to send the details to the database about the id  to be fetched put the index of 
//		placeholder and variable name
		ps.setInt(1, id);
		
//		step5:As we know for fetching the data we use executeQuery() method and it returns the output
//		"Resultset" to fetch the details from Resultset use the following procedure--->
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getLong(5));	
		}
		else
		{
			System.out.println("no user found -invalid id");
		}
	}

}
