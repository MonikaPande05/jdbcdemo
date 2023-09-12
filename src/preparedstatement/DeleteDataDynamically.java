package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","Hope");
		
		PreparedStatement ps=con.prepareStatement("delete from user where id=?");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
		System.out.println("deleted successfully");
		
		

	}

}

