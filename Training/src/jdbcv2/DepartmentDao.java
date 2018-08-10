package jdbcv2;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.PersistenceManager;

/**
 * 
 * DATA ACCESS OBJECTS (DAO) :- to access database ,all select and insert query
 * is done here
 * 
 * @version 1.0
 * @author singhals
 *
 */
public class DepartmentDao {
	public void add(Dept dept) throws DataAccessException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {

			conn = DatabaseConnectivity.connect();
			String sql = "insert into dept values(?,?,?)"; // precompile queries
			
			List<String> args=new ArrayList<>();
			
			args.add(String.valueOf(dept.getDeptno()));
			args.add(dept.getDname());
			args.add(dept.getLoc());
			
			stmt = PersistenceManager.prepareStatement(sql,args);
			stmt.executeUpdate();// DML
		} catch (SQLException e) {
			// TODO: handle exception
			throw new DataAccessException("Error while adding a Department", e);
		} finally {

			try {
				stmt.close();
			} catch (Exception e) {
			}
		}

	}

	public List<Dept> fetchDepartmentsByLocation(String location) throws DataAccessException {
		Connection conn = null;
		PreparedStatement stmt = null;
		List<Dept> deptcollection = new ArrayList<Dept>();
		try {
			conn = DatabaseConnectivity.connect();
			String sql = "select * from dept where loc = ?"; // precompile queries
                List<String> args=new ArrayList<>();
			
               args.add(location);
			
			stmt = PersistenceManager.prepareStatement(sql,args);
			// stmt.setString(3, dept.getLoc());

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Dept d = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptcollection.add(d);
			}

		} catch (SQLException e) {
			// TODO: handle exception
			throw new DataAccessException("Error while adding a Department", e);
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				stmt.close();
			} catch (Exception e) {
			}
		}
		return deptcollection;
	}
}
