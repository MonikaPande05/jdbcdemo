package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con=Helper.getC();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user id to update");
		int id=sc.nextInt();

		PreparedStatement ps1 =con.prepareStatement("select * from student  where id=?" );
		ps1.setInt(1, id);
		ResultSet rs=ps1.executeQuery();
		if(rs.next())
		{
			System.out.println("data is present");
			System.out.println("enter new name");
			String name=sc.next();
			
			PreparedStatement ps =con.prepareStatement("update student set name=? where id=?" );
			
			ps.setString(1, name);
			ps.setInt(2, id);
			
			ps.execute();
			System.out.println("data updated sucessfully");
		}
		else
		{
			System.out.println("data invalid");
		}
			
	}

}
