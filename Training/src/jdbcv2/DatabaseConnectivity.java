package jdbcv2;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {

	private DatabaseConnectivity databaseConnectivity;
	private static String url="jdbc:oracle:thin:@vhkdld387:1551:staffd";
	private static String user="hr";
	private static String pass="Tiger123";
	
	public static Connection connect() throws SQLException 
	{
		return DriverManager.getConnection(url, user, pass);
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		DatabaseConnectivity.url = url;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		DatabaseConnectivity.user = user;
	}

	public static String getPass() {
		return pass;
	}

	public static void setPass(String pass) {
		DatabaseConnectivity.pass = pass;
	}
	

}
