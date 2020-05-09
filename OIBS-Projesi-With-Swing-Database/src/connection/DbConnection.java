package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	Connection myConn;

	public Connection getMyConn() throws SQLException {
		
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oidb", "oidb");
	}

}
