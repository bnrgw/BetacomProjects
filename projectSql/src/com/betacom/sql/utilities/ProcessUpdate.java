package com.betacom.sql.utilities;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.betacom.sql.SQLManager;
import com.betacom.sql.SQLProcess;
import com.betacom.sql.dao.Dipendenti;

public class ProcessUpdate extends DBUtilities implements SQLProcess {

	private static SQLManager db = new SQLManager();
	public void execute() {
		
		
		String dbURL = "jdbc:mysql://localhost:3306/dbprova";
		Connection con = db.initSQL();
		System.out.println("After connection to db");
		
		//INSERT
		
		/*String sql = "insert into dbprova.dipendenti(nome,cognome,data_assunzione,telefono,mansione,stipendio) values"
				   + "(?,?,?,?,?,?)";
		Map<Integer, Object> params = buildParameters(new Object[] {
				"Nadia",
				"Nera",
				"2024-07-20",
				"235678790",
				"Sviluppatore",
				2450
		});
		
		int rc = db.insert(con,sql,params);
		showResults(rc);
		
		//UPDATE
		
		sql = "update dbprova.dipendenti set id_ufficio =? where id_user = ? ";
		
		params = buildParameters(new Object[] {
				2,33
		});
		rc = db.update(con,sql,params);
		
		showResults(rc);
		*/
	
	
	//DELETE
	
		String q = "select * from dbprova.dipendenti  where id_user = ?";
		// creo il parametr
		Map<Integer, Object> params1 = buildParameters(new Object[]{
				18 //
			});
		Dipendenti d = transformResultInDTO(db.get(con, q,params1));
		
		Map<Integer, Object>param =buildParameters(new Object[] {
				d.getIdUser()
		});
		
		String sqli = "delete from dipendenti where id_user = ?";
		int r = db.delete(con, sqli, param);
	    showResults(r);
		
	}
	
	
	
	public List<Dipendenti>showResults(int rc){
		String dbURL = "jdbc:mysql://localhost:3306/dbprova";
		Connection con = db.initSQL();
		
		System.out.println("************** dopo update:" + rc);
		String sql="select* from dipendenti";
		List<Dipendenti> lD = transformResultInDTO(db.list(con, sql, new HashMap<Integer, Object>()));
		lD.forEach(di-> System.out.println(di));
		return lD;
	}
}
