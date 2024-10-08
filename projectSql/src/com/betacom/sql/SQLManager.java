package com.betacom.sql;
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

import com.betacom.sql.config.SQLConfiguration;
import com.betacom.sql.exception.SQLAcademyException;
import com.mysql.cj.jdbc.result.ResultSetMetaData;


public class SQLManager {

	public Connection initSQL() {
        Connection con = null;

        try {
            Class.forName(SQLConfiguration.getInstance().getDriver());

           
            con = DriverManager.getConnection(SQLConfiguration.getInstance().getUrl(), SQLConfiguration.getInstance().getUser(),
					SQLConfiguration.getInstance().getPwd());
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

            con = DriverManager.getConnection(SQLConfiguration.getInstance().getUrl(), SQLConfiguration.getInstance().getUser(),
					SQLConfiguration.getInstance().getPwd());
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
	
	
	
	

	public void listOfTable(Connection con,String dbName) {
		try {
		DatabaseMetaData dbMD = con.getMetaData();
		ResultSet res = dbMD.getTables(dbName, null, null, null);
		
		while(res.next()) {
			System.out.println("Table name:" + res.getString("Table_NAME"));
		}
		
		}catch(SQLException e) {
			System.out.println("SQL error:" + e.getMessage());
			e.printStackTrace();
		}
	}
	


public  List<Map<String, Object>> list(Connection con, String query, Map<Integer,Object> params) {
	try {
		
	PreparedStatement cmd = con.prepareStatement(query);
	
	cmd = createSet(cmd,params);
	
	ResultSet res = cmd.executeQuery();
	
	 return resultSetToList(res);
	 
	}catch(Exception e) {
		System.out.println("error foundd in list:" + e.getMessage());
		e.printStackTrace();
	}
	return null;
 }

public  List<Map<String, Object>> list(Connection con, String query) {
	try {
		
	PreparedStatement cmd = con.prepareStatement(query);
	
//	cmd = createSet(cmd);
	
	ResultSet res = cmd.executeQuery();
	
	 return resultSetToList(res);
	 
	}catch(Exception e) {
		System.out.println("error foundd in list:" + e.getMessage());
		e.printStackTrace();
	}
	return null;
 }

public Map<String, Object> get(Connection con, String qry, Map<Integer,Object> params) {

    try {

        PreparedStatement cmd= con.prepareStatement(qry); 
        cmd = createSet(cmd,params);
        ResultSet res = cmd.executeQuery() ; 
        return resultSetToMap (res);
    } catch (Exception e) {
        System.out.println("error found: "+ e.getMessage());
    }

    return null;
}

public long count (Connection con,String qry) {
	try {
	String qryCount ="select count(*) as numero from ("+qry+") as numero";
	System.out.println("query count" + qryCount);
	
	PreparedStatement cmd = con.prepareStatement(qryCount);
	ResultSet res = cmd.executeQuery();
	
	res.next();
	return(Long)res.getObject("numero");
	}catch(Exception e ) {
		System.out.println("error found in list " + e.getMessage());
		e.printStackTrace();
	}
	return 0;
}



public long count (Connection con, String qry, Map<Integer, Object> params) {
	try {
		String qryCount="SELECT  count(*) as numero FROM ("+ qry +") as xnumero";
		
		PreparedStatement cmd = con.prepareStatement(qryCount); 
		
		cmd = createSet(cmd, params);
		ResultSet res= cmd.executeQuery();
		
		res.next();
		return (Long)res.getObject("numero");

	}catch(Exception e) {
		System.out.println("error: "+e.getMessage());
		e.printStackTrace();
	}
	return 0; 
}

private PreparedStatement createSet(PreparedStatement cmd, Map<Integer,Object> params) {
	params.entrySet().forEach(s ->{
		try {
			cmd.setObject(s.getKey(), s.getValue());
		}catch (SQLException e) {
			e.printStackTrace();
		}
	});
	return cmd;
}

private List<Map<String, Object>> resultSetToList(ResultSet set) throws SQLException {
	java.sql.ResultSetMetaData md = set.getMetaData();
	int columns = md.getColumnCount();
	List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
	
	while(set.next()) {
		Map<String, Object> row = new HashMap<String,Object>();
		for(int i =1; i<= columns; ++i) {
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
        }
	return row;
}

public int insert (Connection con, String query,Map<Integer,Object> params) {
   int rc =0;
   try {
	   PreparedStatement cmd = con.prepareStatement(query);
	   
	   cmd = createSet(cmd,params);
	   rc = cmd.executeUpdate();
	   
   }catch(Exception e) {
	   System.out.println("Insert error :" + e.getMessage());
	   e.printStackTrace();
	   rc=0;
   }
   return rc;
}

public int update (Connection con, String query,Map<Integer,Object> params) {
	   int rc =0;
	   try {
		   PreparedStatement cmd = con.prepareStatement(query);
		   
		   cmd = createSet(cmd,params);
		   rc = cmd.executeUpdate();
		   
	   }catch(Exception e) {
		   System.out.println("Insert error :" + e.getMessage());
		   e.printStackTrace();
		   rc=0;
	   }
	   return rc;
	}

public int delete (Connection con, String query,Map<Integer,Object> params) {
	   int rc =0;
	   try {
		   PreparedStatement cmd = con.prepareStatement(query);
		   
		   cmd = createSet(cmd,params);
		   rc = cmd.executeUpdate();
		   
	   }catch(Exception e) {
		   System.out.println("Insert error :" + e.getMessage());
		   e.printStackTrace();
		   rc=0;
	   }
	   return rc;
	}

//per salvare le modifiche
public void commit(Connection con) {
	try {
	con.commit();
	}catch(Exception e ) {
		System.out.println("Error on commit :" + e.getMessage());
		e.printStackTrace();
	}
}

//per annulllare una transazione
public void rollBack(Connection con) {
	try {
	con.rollback();
	}catch(Exception e ) {
		System.out.println("Error on rollback :" + e.getMessage());
		e.printStackTrace();
	}
}


}
