package jdbcv2;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import jdbcv2.DatabaseConnectivity;

public class PersistenceManager {

	public static PreparedStatement prepareStatement(String sql,List<String> args) throws SQLException {
		
		Connection conn=DatabaseConnectivity.connect();
		PreparedStatement stmt = conn.prepareStatement(sql);

		
		// Filling data in the particular query
		for(int i=0;i<args.size();i++)
			stmt.setString(i+1, args.get(i));
		
		return stmt;
	}
}
