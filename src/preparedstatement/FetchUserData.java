package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchUserData {

	public static void main(String[] args) throws SQLException {
		Connection con=Helper.getC();

		PreparedStatement ps=con.prepareStatement("select * from student where name=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next(); 
		
		ps.setString(1,name);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		}
		else
		{
		System.out.println("no ustudent found invalid name");	
		}
	}

}
