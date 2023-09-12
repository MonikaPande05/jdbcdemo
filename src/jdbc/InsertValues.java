package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/J2EE","root","Hope") ;
		Statement st=con.createStatement();
		st.execute("insert into student values(2, 'Elvis',25 )");
		st.execute("insert into student values(3, 'Jaid',40 )");
		st.execute("insert into student values(4, 'Aliza',35 )");
		st.execute("insert into student values(5, 'Bela',22 )");
		st.execute("insert into student values(6, 'Nick',35 )");
		 System.out.println("INSERTED ");
	}

}
