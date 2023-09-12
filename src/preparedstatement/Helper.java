package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {

	public static Connection getC() throws SQLException {
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/J2EE","root","Hope");
		return con;

	}

}
