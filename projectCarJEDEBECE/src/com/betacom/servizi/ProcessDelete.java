package com.betacom.servizi;

import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

import com.betacom.car.dao.Veicolo;

import sql.SQLManager;

public class ProcessDelete {
	
	private static SQLManager db = new SQLManager();
	private CreateObject co = new CreateObject();
	Connection con = db.initSQL();

	public void delete(String richiesta, Properties prop) {
		if (richiesta.equals("deleteMacchina") ) {
			deleteMacchina(richiesta,prop);
		} else if (richiesta.equals( "deleteMoto")) {
			deleteMoto(richiesta,prop);
		} else if (richiesta.equals( "deleteBici") ){
			deleteBici(richiesta,prop);
		}

	}
	

private void deleteMacchina(String key,Properties prop) {
	String idMachinaDelete=prop.getProperty("idMcchinaDelete");
	String query = prop.getProperty("deleteMacchina");
	
	Map<Integer, Object> paramdelete = co.buildParameters(new Object[] { idMachinaDelete });
	db.noReturnValue(con, query, paramdelete);
	
	
}

private void deleteMoto(String key,Properties prop) {
	
}

private void deleteBici(String key,Properties prop) {
	
}

private void deleteVeicolo(Veicolo v,Map<Integer, Object>params,Properties prop) {
	
	
	String query = prop.getProperty("veicoloDelete");
	db.noReturnValue(con, query, params);
}

}