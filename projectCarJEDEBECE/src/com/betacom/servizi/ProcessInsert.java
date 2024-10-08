package com.betacom.servizi;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.betacom.car.dao.Veicolo;

import sql.SQLManager;

import com.betacom.car.dao.Macchina;

public class ProcessInsert {
	private static SQLManager db = new SQLManager();
	private CreateObject co = new CreateObject();

	Connection con = db.initSQL();
	//System.out.println("after connection to db");

	public void insert(String richiesta, Properties prop) {
//controllo che tipo di insert fare e chiamo il metodo
		if (richiesta.equals("insertMacchina") ) {
			insertMacchina(richiesta,prop);
		} else if (richiesta.equals( "insertMoto")) {
			insertMoto();
		} else if (richiesta.equals( "insertBici") ){
			insertBici();
		}

	}

	private void insertMacchina(String richiesta, Properties prop) {
		
		Macchina mac = new Macchina();
		mac = co.createMacchina(prop);
		String idMacchina = prop.getProperty("idMacchina");
		Map<Integer, Object> params = co
				.buildParameters(new Object[] {idMacchina , mac.getNumeroPorte(), mac.getTarga(), mac.getCilindrata() });
		String query = prop.getProperty(richiesta);
		db.noReturnValue(con, query, params);
		
		//Aggiornamneti su veicolo
		Veicolo v = co.createVeicolo(prop);
		Map<Integer, Object> paramV = co
				.buildParameters(new Object[] {v.getColore(),v.getTipoAlimentazione(),v.getMarca(),v.getNumeroRuote(),v.getNumeroPosti()
						, v.getTipoVeicolo(),idMacchina,null,null});
		insertVeicolo(v,paramV,prop);
		
		co.incrementContatore(prop, con, db, "Auto");
		
	}

	private void insertMoto() {

	}

	private void insertBici() {

	}
	
	private void insertVeicolo(Veicolo v,Map<Integer, Object>params,Properties prop) {
		
		String query = prop.getProperty("veicoloInsert");
		db.noReturnValue(con, query, params);
	}

}
