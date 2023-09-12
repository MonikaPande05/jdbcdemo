package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
    	Class.forName("com.mysql.cj.jdbc.Driver") ;
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Hope");
		System.out.println("connection establish successfully");
		
		//to create a stmts
		Statement st=con.createStatement();
	System.out.println("Statment create successfully");
		
		//to execute stamts
		st.execute("create database J2EE");
		System.out.println("database create successfully");
		
		//To create table 
		
		
	}
}
