package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteValues {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/J2EE","root","Hope");
        Statement st=con.createStatement();
        st.execute("delete from student where id=1");
        System.out.println("deleted");
	}

	
}
