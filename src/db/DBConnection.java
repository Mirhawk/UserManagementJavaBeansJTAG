package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	static final String DB_NAME = "javadb";
	static final String DB_URL = "jdbc:mysql://localhost:3306/"+DB_NAME;
	static final String DB_USERNAME="root";
	static final String DB_PASSWORD="apache";
	
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER_NAME);
		return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	}
}
