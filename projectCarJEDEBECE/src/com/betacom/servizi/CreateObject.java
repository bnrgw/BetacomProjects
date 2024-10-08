package com.betacom.servizi;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.betacom.car.dao.Macchina;
import com.betacom.car.dao.Veicolo;

import sql.SQLManager;


public class CreateObject {

	public Veicolo createVeicolo(Properties prop) {
		Veicolo v = new Veicolo();
		try {
			v.setColore(prop.getProperty("coloreVeicolo"));
			v.setMarca(prop.getProperty("marcaVeicolo"));
			v.setNumeroPosti(Integer.valueOf(prop.getProperty("numeroPostiVeicolo")));
			v.setNumeroRuote(Integer.valueOf(prop.getProperty("numeroRuoteVeicolo")));
			v.setTipoAlimentazione(prop.getProperty("TipoAlimentazioneVeicolo"));
			v.setTipoVeicolo(prop.getProperty("tipoVeicolo"));
			
		}catch (Exception e) {
			System.out.println("Error loading preperties file...");
			e.printStackTrace();
		}
		return v;

	}
	
	public Macchina createMacchina(Properties prop) {
		Macchina c = new Macchina();
		try {
			
			c.setNumeroPorte(Integer.valueOf(prop.getProperty("numeroPorteMacchina")));
			c.setCilindrata(Integer.valueOf(prop.getProperty("cilindrataMacchina")));
			c.setTarga(prop.getProperty("targaMacchina"));

		} catch (Exception e) {
			System.out.println("Error loading preperties file...");
			e.printStackTrace();
		}
		return c;
	}
	
	public void incrementContatore(Properties prop, Connection con,SQLManager db,String table) {
		String query = prop.getProperty("incrementContatore");
		Map<Integer, Object> params = buildParameters( new Object[] {table,table});
		db.noReturnValue(con, query,params);
		
		String query1= prop.getProperty("getContatore");
		//deve ritornare l'id del'auto.
	}

	public void decrementContatore(Properties prop, Connection con,SQLManager db,String table) {
		String query = prop.getProperty("decrementContatore");
		Map<Integer, Object> params = buildParameters( new Object[] {table,table});
		 db.noReturnValue(con, query,params);
		 
	}
	

	public Map<Integer, Object> buildParameters(Object[] p) {
		Map<Integer, Object> params = new HashMap<Integer, Object>();
		int pIdx = 1;
		for (Object o : p) {
			params.put(pIdx++, o);
		}

		return params;

	}

}
