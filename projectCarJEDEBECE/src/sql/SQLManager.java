package sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sql.SQLConfiguration;
import sql.SQLAcademyException;

public class SQLManager {

	public Connection initSQL() {
		Connection con = null;

		try {
			Class.forName(SQLConfiguration.getInstance().getDriver());
			con = DriverManager.getConnection(SQLConfiguration.getInstance().getUrl(),
					SQLConfiguration.getInstance().getUser(), SQLConfiguration.getInstance().getPwd());

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found :" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL error :" + e.getMessage());
			e.printStackTrace();
		} catch (SQLAcademyException e) {
			System.out.println("Error in configuration :" + e.getMessage());
			e.printStackTrace();
		}

		return con;
	}

	public Connection initSQLTransaction() {
		Connection con = null;

		try {
			Class.forName(SQLConfiguration.getInstance().getDriver());

			con = DriverManager.getConnection(SQLConfiguration.getInstance().getUrl(),
					SQLConfiguration.getInstance().getUser(), SQLConfiguration.getInstance().getPwd());
			con.setAutoCommit(false);

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found :" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL error :" + e.getMessage());
			e.printStackTrace();
		} catch (SQLAcademyException e) {
			System.out.println("Error in configuration :" + e.getMessage());
			e.printStackTrace();
		}

		return con;
	}
	
	

	
	public Map<String, Object> select(Connection con, String qry, Map<Integer, Object> params) {

		try {

			PreparedStatement cmd = con.prepareStatement(qry);
			cmd = createSet(cmd, params);
			ResultSet res = cmd.executeQuery();
			return resultSetToMap(res);
		} catch (Exception e) {
			System.out.println("error found: " + e.getMessage());
		}

		return null;
	}

	public long count(Connection con, String qry) {
		try {
			String qryCount = "select count(*) as numero from (" + qry + ") as numero";
			System.out.println("query count" + qryCount);

			PreparedStatement cmd = con.prepareStatement(qryCount);
			ResultSet res = cmd.executeQuery();

			res.next();
			return (Long) res.getObject("numero");
		} catch (Exception e) {
			System.out.println("error found in list " + e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}
	

	public int insert(Connection con, String query, Map<Integer, Object> params) {
		int rc = 0;
		try {
			PreparedStatement cmd = con.prepareStatement(query);

			cmd = createSet(cmd, params);
			rc = cmd.executeUpdate();

		} catch (Exception e) {
			System.out.println("Insert error :" + e.getMessage());
			e.printStackTrace();
			rc = 0;
		}
		return rc;
	}

	public int update(Connection con, String query, Map<Integer, Object> params) {
		int rc = 0;
		try {
			PreparedStatement cmd = con.prepareStatement(query);

			cmd = createSet(cmd, params);
			rc = cmd.executeUpdate();

		} catch (Exception e) {
			System.out.println("Insert error :" + e.getMessage());
			e.printStackTrace();
			rc = 0;
		}
		return rc;
	}

	public int delete(Connection con, String query, Map<Integer, Object> params) {
		int rc = 0;
		try {
			PreparedStatement cmd = con.prepareStatement(query);

			cmd = createSet(cmd, params);
			rc = cmd.executeUpdate();

		} catch (Exception e) {
			System.out.println("Insert error :" + e.getMessage());
			e.printStackTrace();
			rc = 0;
		}
		return rc;
	}

//per salvare le modifiche
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			System.out.println("Error on commit :" + e.getMessage());
			e.printStackTrace();
		}
	}

//per annulllare una transazione
	public void rollBack(Connection con) {
		try {
			con.rollback();
		} catch (Exception e) {
			System.out.println("Error on rollback :" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	//***************************METODI PRIVATI*****************************************************************

	private PreparedStatement createSet(PreparedStatement cmd, Map<Integer, Object> params) {
		params.entrySet().forEach(s -> {
			try {
				cmd.setObject(s.getKey(), s.getValue());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
		return cmd;
	}

	private List<Map<String, Object>> resultSetToList(ResultSet set) throws SQLException {
		java.sql.ResultSetMetaData md = set.getMetaData();
		int columns = md.getColumnCount();
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();

		while (set.next()) {
			Map<String, Object> row = new HashMap<String, Object>();
			for (int i = 1; i <= columns; i++) {
				row.put(md.getColumnName(i), set.getObject(i));

			}
			rows.add(row);
		}
		return rows;
	}

	private Map<String, Object> resultSetToMap(ResultSet set) throws SQLException {
		java.sql.ResultSetMetaData md = set.getMetaData();
		int columns = md.getColumnCount();
		Map<String, Object> row = new HashMap<String, Object>();

		set.next();
		for (int i = 1; i <= columns; ++i) {
			row.put(md.getColumnName(i), set.getObject(i));
			//getColumnLabel
		}
		return row;
	}

	/*
	public void noReturnValue(Connection con, String query, Map<Integer, Object> params) {
		try {

			PreparedStatement cmd = con.prepareStatement(query);
			cmd = createSet(cmd, params);
			cmd.executeUpdate();
	       System.out.println("Operazione fatta con sucesso");
		} catch (Exception e) {
			System.out.println("error found in list:" + e.getMessage());
			e.printStackTrace();
		}
		
	}

	public List<Map<String, Object>> deletUpdate(Connection con, String query) {
		try {

			PreparedStatement cmd = con.prepareStatement(query);

			// ResultSet res =
			cmd.executeUpdate();

			// return resultSetToList(res);

		} catch (Exception e) {
			System.out.println("error foundd in list:" + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public void returnValue(Connection con, String query) {
		try {

			PreparedStatement cmd = con.prepareStatement(query);
			ResultSet res = cmd.executeQuery();
			printResultSet(res);

		} catch (Exception e) {
			System.out.println("error foundd in list:" + e.getMessage());
			e.printStackTrace();
		}
	}
*/
}
