package com.betacom.sql.utilities;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.betacom.sql.MainSql;
import com.betacom.sql.SQLManager;
import com.betacom.sql.SQLProcess;
import com.betacom.sql.config.SQLConfiguration;
import com.betacom.sql.dao.Dipendenti;

public class ProcessQuery extends DBUtilities implements SQLProcess {

	private static SQLManager db = new SQLManager();

	public void execute() {

		Connection con = db.initSQL();
		System.out.println("after connection to db");
	

		System.out.println("After connection to db");

		db.listOfTable(con, "dbprova");

		String query = "select * from dbprova.dipendenti where mansione = ? ";
		// creo il parametro
		Map<Integer, Object> params = buildParameters(new Object[] { "Amministratore" });

		long numeroImpiegato = db.count(con, query, params);
		System.out.println("numero impiegati : " + numeroImpiegato);
		System.out.println("*******************************");

		List<Map<String, Object>> result = db.list(con, query, params);
		// preparo la stampa
		List<Dipendenti> lD = transformResultInDTO(result);
		lD.forEach(di -> System.out.println(di));

		System.out.println("*******************************");
		String qry = "select * from dbprova.dipendenti where mansione = ? and stipendio >?";
		params = buildParameters(new Object[] { "Sviluppatore", 2500 });
		lD = transformResultInDTO(db.list(con, qry, params));
		lD.forEach(di -> System.out.println(di));

		int i = 0;
		showResults(i);

		System.out.println("************************************");

		/*
		 * List<Map<String, Object>> resultCount = db.list(con, qry);
		 * System.out.println("size" + resultCount.size() + "numero"
		 * +resultCount.get(0).get(" numero"));
		 */
		// long numero = (long) resultCount.get(0).get("numero");

		/*
		 * long resultC = db.count(con, q); System.out.println("numero dipendenti : " +
		 * resultC);
		 */
	}

	public List<Dipendenti> showResults(int rc) {
		String dbURL = "jdbc:mysql://localhost:3306/dbprova";
		Connection con = db.initSQL();

		System.out.println("************** dopo update:" + rc);
		String sql = "select* from dipendenti";
		List<Dipendenti> lD = transformResultInDTO(db.list(con, sql, new HashMap<Integer, Object>()));
		lD.forEach(di -> System.out.println(di));
		return lD;
	}
}
