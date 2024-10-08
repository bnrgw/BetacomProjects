package com.betacom.car.process;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.betacom.car.config.SQLConfiguration;
import com.betacom.car.dao.Macchina;
import com.betacom.car.sql.SQLManager;
import com.betacom.car.utilities.DBUtilities;

public class CommonProcess {

	private static SQLManager db = new SQLManager();

	public void executeSelect(Connection con, String[] pr) { // passa process + table

		List<Object> obj = new ArrayList<Object>();

		for (String s : pr[2].split(",")) {
			System.out.println(s);
			obj.add(s);
		}

		String qry = SQLConfiguration.getInstance().getProperty(pr[0].toLowerCase() + pr[1]);
		Map<Integer, Object> params = DBUtilities.buildParameters(obj.toArray());
		List<Map<String, Object>> result = db.list(con, qry, params);
		List<Macchina> lD = DBUtilities.transformResultMacchinaInDTO(result);
		lD.forEach(di -> System.out.println(di));
		System.out.println("----------------------------------------");

	}

	public void executeInsert(Connection con, String[] pr) { // passa process + table

		List<Object> obj = new ArrayList<Object>();

		for (String s : pr[2].split(",")) {
			System.out.println(s);
			obj.add(s);
		}

		String qry = SQLConfiguration.getInstance().getProperty(pr[0].toLowerCase() + pr[1]);
		Map<Integer, Object> params = DBUtilities.buildParameters(obj.toArray());
		int result = db.insert(con, qry, params);

		updateContatore(con);
		executeInsertVeicolo(con, pr[3]);

		System.out.println("----------------------------------------");

	}

	public void executeInsertVeicolo(Connection con, String p) { // passa process + table

		List<Object> obj = new ArrayList<Object>();

		for (String s : p.split(",")) {
			System.out.println(s);
			obj.add(s);
		}

		String qry = SQLConfiguration.getInstance().getProperty("insertVeicolo");
		Map<Integer, Object> params = DBUtilities.buildParameters(obj.toArray());
		int result = db.insert(con, qry, params);
		System.out.println(result);

		System.out.println("----------------------------------------");

	}

	public void updateContatore(Connection con) { // passa process + table

		String qry = SQLConfiguration.getInstance().getProperty("updateContatore");
		int result = db.update(con, qry, null);
		System.out.println(result);

		System.out.println("----------------------------------------");

	}

}
