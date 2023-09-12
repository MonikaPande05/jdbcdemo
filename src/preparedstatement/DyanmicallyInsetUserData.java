package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DyanmicallyInsetUserData {

	public static void main(String[] args) throws SQLException 
	{
		Connection con=Helper.getC();
		for(int i=0 ; i<3 ; i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		System.out.println("enter mobile");
		long mb=sc.nextLong();
		
		PreparedStatement ps=con.prepareStatement("insert into user(id ,name ,email ,password ,mobile )values(?,?,?,?,?)");
		
        ps.setInt(1, id);
        ps.setString(2,name);
        ps.setString(3, email);
        ps.setString(4, pass);
        ps.setLong(5, mb);
        
        ps.executeUpdate();
		}
        System.out.println("successfully updated ");

	}

}
