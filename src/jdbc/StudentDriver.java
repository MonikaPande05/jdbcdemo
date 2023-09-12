package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) throws SQLException 
	{
		Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/J2EE","root","Hope");
		Statement st=con.createStatement();
		System.out.println("a.save student b.view student c.update student d.delete student");
		int ans=sc.nextInt();
		switch(ans) 
		{
		case 1: 
		{
			st.execute("insert into student values(1,'riya',10)");
			System.out.println("student added");
			break;
		}
		case 2:
		{
			
			ResultSet rs=st.executeQuery("select * from student where id=1");
	    	rs.next();
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
            break;
		}
		case 3:
		{
			st.execute("update student set name='madhu' where id=1"); 
	        System.out.println("update");
	        break;
			
		}
		case 4:
		{
		    
		    st.execute("delete from student where id=1");
			System.out.println("delete student");
			break;
		}
	}
}
}
