package com.betacom.sql;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.betacom.sql.dao.Dipendenti;
import com.betacom.sql.utilities.DBUtilities;

public class ProcessTransaction extends DBUtilities implements SQLProcess {

	private static SQLManager db = new SQLManager();
	
	@Override
	public void execute() {
		
		Connection con = db.initSQL();
		System.out.println("After connection to db");
		
		String sql = "insert into dbprova.dipendenti(nome,cognome,data_assunzione,telefono,mansione,stipendio) values"
				   + "(?,?,?,?,?,?)";
		Map<Integer, Object> params = buildParameters(new Object[] {
				"Nadia",
				"Transaction",
				"2024-07-24",
				"455566778",
				"Sviluppatore",
				3000
		});
		
		int rc = db.insert(con,sql,params);
		
		
		 params = buildParameters(new Object[] {
				"Giovanni",
				"Bello",
				"2024-07-24",
				"88888898",
				"Sviluppatore",
				3100
		});
			 rc = db.insert(con,sql,params);
		
			
				/*Map<Integer, Object> params1 = buildParameters(new Object[]{
						18 
					});
				Dipendenti d = transformResultInDTO(db.get(con, "select * from dbprova.dipendenti  where id_user = ?",params1));
				System.out.println(">>>>>>" + d);
			 
				String sqli = "delete from dipendenti where id_user = ?";
				rc = db.delete(con, sqli, params1);
				System.out.println(rc);
				
				*/
				
			 params = buildParameters(new Object[] {
						"Gianni",
						"Bello",
						"2023-05-24",
						"445566778",
						"Amministratore",
						2100
				});
					 rc = db.insert(con,sql,params);
				
		boolean ok = false;
		if(ok) {
			db.commit(con);
			System.out.println("Transaction is commited");
		}else {
			db.rollBack(con);
			System.out.println("Transaction is rolled back");
		}
		
	}
	
	public List<Dipendenti>showResults(int i){
		List<Dipendenti> D = new ArrayList<Dipendenti>();
		return D;
	}
}
