package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/J2EE","root","Hope") ;
		 Statement st=con.createStatement();
		 System.out.println("table create successfully");
		 st.execute("create table student(id int, name varchar(20),age int )");
		 System.out.println("create table ");
		 
		 

	}

}
