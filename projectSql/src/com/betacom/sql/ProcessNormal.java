package com.betacom.sql;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.betacom.sql.dao.Dipendenti;
import com.betacom.sql.utilities.DBUtilities;

public class ProcessNormal extends DBUtilities {

	private static SQLManager db = new SQLManager();
	public void execute() {
		
		String dbURL = "jdbc:mysql://localhost:3306/dbprova";
		Connection con = db.initSQL();
		System.out.println("After connection to db");
		
		db.listOfTable(con,"dbprova");
		
		String query = "select * from dbprova.dipendenti where mansione = ? ";
		// creo il parametro
		Map<Integer,Object> params = buildParameters(new Object[]{
			"Amministratore"
		});
		List<Map<String, Object>> result = db.list(con, query,params);
		//preparo la stampa
		List<Dipendenti> lD = transformResultInDTO(result);
		lD.forEach(di -> System.out.println(di));
		
		
		System.out.println("*******************************");
		String qry = "select * from dbprova.dipendenti where mansione = ? and stipendio >?";
		params = buildParameters(new Object[]{
				"Sviluppatore",2500
			});
		lD = transformResultInDTO(db.list(con, qry, params));
		lD.forEach(di-> System.out.println(di));
		
		System.out.println("*************************************");
		qry="select* from dbprova.dipendenti";
		lD = transformResultInDTO(db.list(con, qry, new HashMap<Integer, Object>()));
		
		lD.forEach(di->System.out.println(di));
	}
	
	
}
