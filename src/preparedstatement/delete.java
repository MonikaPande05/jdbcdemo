package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) throws SQLException {
		Connection con=Helper.getC();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		
		PreparedStatement ps=con.prepareStatement("delete from student where name=?");
		
		ps.setString(1, name);
		
		if(ps.execute())
		{
		System.out.println("deleted");
		}
		else 
		{
			System.out.println("invalid data");
		}
	}

}
