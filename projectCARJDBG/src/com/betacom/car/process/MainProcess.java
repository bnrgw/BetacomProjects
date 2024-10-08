package com.betacom.car.process;

import sql.DBUtilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.betacom.objects.Car;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;

import sql.SQLManager;

public class MainProcess {

	private static SQLManager db = new SQLManager();
	
	public void execute() {

		Connection con = db.initSQL();
		System.out.println("after connection to db");
		// Legge le richieste e Transorma le richieste in oggetti
		Car c = readRequest();
		Properties prop;
		
		try {
			prop = createProperties();
			String query =prop.getProperty("insert");
			Map<Integer, Object> params = buildParameters(new Object[] { "1", c.getNumeroPorte(),c.getTarga(),c.getCc() });
			List<Map<String, Object>> result = db.list(con, query, params);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*
		 * paramcar.setNumeroRuote(4); paramcar.setVelocità(30); paramcar.setId(1);
		 * paramcar.setTipoAlimentazione("benzina");
		 * paramcar.setTipoVeicolo("Fuosistrada"); paramcar.setNumeroPorte(4);
		 * paramcar.setTarga("targa"); paramcar.setCc(70);
		 * 
		 */
	}

	public Car readRequest() {
		Car c = new Car();
		try {
			Properties prop = createProperties();
			c.setNumeroPorte(Integer.valueOf(prop.getProperty("numeroPorte")));
			c.setCc(Integer.valueOf(prop.getProperty("cilindrata")));
			c.setTarga(prop.getProperty("targa"));
			
			
		} catch (Exception e) {
			System.out.println("Error loading preperties file...");
			e.printStackTrace();
		}
	  return c;
	}
	
	private Properties createProperties() throws IOException {
		Properties prop = new Properties();
		InputStream stream = new FileInputStream(
				"C:\\Users\\Betacom\\eclipse-workspace\\projectCARJDBG\\car.properties");
		prop.load(stream);
		return prop;
	}
	
	public Map<Integer,Object> buildParameters(Object[] p){
		Map<Integer,Object> params = new HashMap<Integer,Object>();
		int pIdx =1;
		for(Object o:p) {
			params.put(pIdx++, o);
		}
		
		return params;
		
	}

}
