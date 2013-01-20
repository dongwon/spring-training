package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
	
	public Connection makeNewConnection(){
		
		Connection c = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost/won", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

}
