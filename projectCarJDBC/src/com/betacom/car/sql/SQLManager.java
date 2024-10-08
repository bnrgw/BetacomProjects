package com.betacom.car.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.betacom.car.config.SQLConfiguration;
import com.betacom.car.exception.SQLAcademyException;

public class SQLManager {
	public Connection initSQL() {
		Connection con = null;

		try {
			Class.forName(SQLConfiguration.getInstance().getProperty("driver"));

			con = DriverManager.getConnection(SQLConfiguration.getInstance().getProperty("url"),
					SQLConfiguration.getInstance().getProperty("user"),
					SQLConfiguration.getInstance().getProperty("pwd"));

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found :" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL error :" + e.getMessage());
			e.printStackTrace();
		}
//		} catch (SQLAcademyException e) {
//			System.out.println("Error in configuration :" + e.getMessage());
//			e.printStackTrace();
//		}

		return con;
	}

//	public Connection initSQLTransaction() {
//		Connection con = null;
//		
//		try {
//			Class.forName(SQLConfiguration.getInstance().getDriver());
//			
//			con = DriverManager.getConnection(SQLConfiguration.getInstance().getUrl(),SQLConfiguration.getInstance().getUser(),SQLConfiguration.getInstance().getPwd());
//			con.setAutoCommit(false);
//			
//		} catch (ClassNotFoundException e) {
//			System.out.println("Driver not found :" + e.getMessage());
//			e.printStackTrace();
//		} catch (SQLException e) {
//			System.out.println("SQL error :" + e.getMessage());
//			e.printStackTrace();
//		} catch (SQLAcademyException e) {
//			System.out.println("Error in configuration :" + e.getMessage());
//			e.printStackTrace();
//		}
//		
//		return con;
//	}

	public void listOfTable(Connection con, String dbName) {

		try {
			DatabaseMetaData dbMD = con.getMetaData();
			ResultSet res = dbMD.getTables(dbName, null, null, null);

			while (res.next()) {
				System.out.println("Table name: " + res.getString("TABLE_NAME"));
			}

		} catch (SQLException e) {
			System.out.println("SQL error :" + e.getMessage());
			e.printStackTrace();
		}
	}

	public List<Map<String, Object>> list(Connection con, String qry, Map<Integer, Object> params) {

		try {
			PreparedStatement cmd = con.prepareStatement(qry);

			cmd = createSet(cmd, params);

			ResultSet res = cmd.executeQuery(); // restituisce i risultati sotto forma di una matrice

			return resultSetToList(res);

		} catch (Exception e) {
			System.out.println("SQL error: " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public List<Map<String, Object>> list(Connection con, String qry) {
		try {
			PreparedStatement cmd = con.prepareStatement(qry);

			ResultSet res = cmd.executeQuery(); // execute query
			return resultSetToList(res);
		} catch (Exception e) {
			System.out.println("error found in list: " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public Map<String, Object> get(Connection con, String qry) {
		try {
			PreparedStatement cmd = con.prepareStatement(qry);
			ResultSet res = cmd.executeQuery();
			return resultSetToMap(res);
		} catch (Exception e) {
			System.out.println("error found in list: " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	private PreparedStatement createSet(PreparedStatement cmd, Map<Integer, Object> params) {
		params.entrySet().forEach(s -> {
			try {
				if (s.getValue().equals("null"))
					cmd.setObject(s.getKey(), java.sql.Types.NULL);
				else
					cmd.setObject(s.getKey(), s.getValue());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});

		return cmd;
	}

	private List<Map<String, Object>> resultSetToList(ResultSet rs) throws SQLException {
		ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();

		while (rs.next()) {
			Map<String, Object> row = new HashMap<String, Object>();
			for (int i = 1; i <= columns; ++i) {
				System.out.println("column name: " + md.getColumnName(i));
				row.put(md.getColumnName(i), rs.getObject(i));

				Object test = rs.getObject(i);
				System.out.println(test);
			}
			rows.add(row);
		}

		return rows;
	}

	private Map<String, Object> resultSetToMap(ResultSet rs) throws SQLException {
		ResultSetMetaData md = rs.getMetaData();
		Map<String, Object> map = new HashMap<String, Object>();

		rs.next();
		for (int i = 1; i <= md.getColumnCount(); ++i) {
			map.put(md.getColumnName(i), rs.getObject(i));
		}

		return map;
	}

	public int update(Connection con, String qry, Map<Integer, Object> params) {

		int rc = 0;
		try {
			PreparedStatement cmd = con.prepareStatement(qry);

			if (params != null) {
				cmd = createSet(cmd, params);
			}

			rc = cmd.executeUpdate();

		} catch (Exception e) {
			System.out.println("Update error :" + e.getMessage());
			e.printStackTrace();
			rc = 0;
		}

		return rc;
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

	public int delete(Connection con, String qry, Map<Integer, Object> params) {

		int rc = 0;
		try {
			PreparedStatement cmd = con.prepareStatement(qry);

			cmd = createSet(cmd, params);
			rc = cmd.executeUpdate();

		} catch (Exception e) {
			System.out.println("Delete error :" + e.getMessage());
			e.printStackTrace();
			rc = 0;
		}

		return rc;
	}

	public void commit(Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			System.out.println("");
			e.printStackTrace();
		}
	}

	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (Exception e) {
			System.out.println("");
			e.printStackTrace();
		}
	}

	public long count(Connection con, String qry) {

		try {
			String gqryCount = "SELECT count(*) as numero FROM (" + qry + ") as xnumero";
			System.out.println("qryCount: " + gqryCount);

			PreparedStatement cmd = con.prepareStatement(gqryCount);
			ResultSet res = cmd.executeQuery();

			res.next();
			return (Long) res.getObject("numero");

		} catch (Exception e) {
			System.out.println("error found in list: " + e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	public long count(Connection con, String qry, Map<Integer, Object> params) {

		try {
			String qryCount = "SELECT count(*) as numero FROM ( " + qry + " ) as xnumero"; // alias per query ani
			PreparedStatement cmd = con.prepareStatement(qryCount);

			cmd = createSet(cmd, params);
			ResultSet res = cmd.executeQuery();

			res.next();
			return (Long) res.getObject("numero");

		} catch (Exception e) {
			System.out.println("error found in list:" + e.getMessage());
			e.printStackTrace();

			return 0;
		}
	}

}
