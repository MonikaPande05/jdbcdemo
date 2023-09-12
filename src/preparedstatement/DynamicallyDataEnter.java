package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class DynamicallyDataEnter {

	public static void main(String[] args) throws SQLException{
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/J2EE","root","Hope");
		//PreparedStatement ps=con.prepareStatement("create table user(id int,name varchar(20),email varchar(15),password Varchar(10),mobile long)");
		//ps.execute() ;
	//	System.out.println("table created "); 
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter  email");
		String email=sc.next();
		System.out.println("enter pass");
		String password=sc.next();
		System.out.println("enetr mb");
		Long mobile=sc.nextLong();
		
		PreparedStatement ps1=con.prepareStatement("insert into user(id,name,email,password,mobile)values(?,?,?,?,?)");
		
		ps1.setInt(1, id);
		ps1.setString(2, name);
		ps1.setString(3, email);
		ps1.setString(4, password);
		ps1.setLong(5, mobile);
		
		ps1.execute();
		
		
		
	}		
	
	}
		
		
		