package jdbc;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 
 * @version 1.0
 * @author Shubham Singhal
 *
 */
public class DBInfo
{
	public static void main(String[] args) throws SQLException, DataAccessException 
	{
		/*
		String url="jdbc:oracle:thin:@vhkdld387:1551:staffd";
		String user="hr";
		String pass="Tiger123";
		
		Connection conn=DriverManager.getConnection(url, user, pass);
		DatabaseMetaData dbms=conn.getMetaData();
		System.out.println("DB Name: "+dbms.getDatabaseProductName());
		System.out.println("DB Version "+ dbms.getDatabaseProductVersion());
		 String[] types = {"TABLE"};
		ResultSet rs = dbms.getTables(null, null, "B%", types);
		while (rs.next()) {
			String tableName = rs.getString("TABLE_NAME");
            System.out.println("table = " + tableName);
		}
		conn.close();*/
		//Dept d=new Dept(60,"IT","PUNE");
		//new DepartmentDao().add(d);
		List <Dept> d=new DepartmentDao().fetchDepartmentsByLocation("Pune");
		//System.out.println(d);
		new Dept().display(d);
		//for(Dept l:d)
			//System.out.println(l);
	}
}
