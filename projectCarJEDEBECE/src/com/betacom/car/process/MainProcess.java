package com.betacom.car.process;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


import com.betacom.servizi.ProcessDelete;
//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;
import com.betacom.servizi.ProcessInsert;
import com.betacom.servizi.ProcessSelect;
import com.betacom.servizi.ProcessUpdate;

import sql.SQLManager;

public class MainProcess {

	

	public void execute() {

		

		Properties prop;

		try {
			prop = createProperties();
			Set<Object> set = prop.keySet();

			for (Object o : set) {
				String key = (String) o;
				
				
				if(key.contains("insert")) {
					ProcessInsert pi = new ProcessInsert();
					pi.insert(key,prop);
				}
				else if(key.contains("select")) {
					ProcessSelect ps = new ProcessSelect();
					ps.select();
				}
				else if(key.contains("delete")) {
					ProcessDelete pd = new ProcessDelete();
					pd.delete(key,prop);
				}
				else if(key.contains("update")) {
					ProcessUpdate pu = new ProcessUpdate();
					pu.update();
				}
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	private Properties createProperties() throws IOException {
		Properties prop = new Properties();
		InputStream stream = new FileInputStream(
				"C:\\Users\\Betacom\\eclipse-workspace\\projectCarJEDEBECE\\car.properties");
		prop.load(stream);
		return prop;
	}

	

}
