package com.betacom.car.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class SQLConfiguration {
	private static SQLConfiguration instance;
	private static Properties prop = new Properties();

	private SQLConfiguration() {

	}

	public static SQLConfiguration getInstance() {
		if (instance == null) {
			instance = new SQLConfiguration();
			loadSQLConfiguration();
		}

		return instance;
	}

	private static void loadSQLConfiguration() {

		try {
			InputStream stream = new FileInputStream("./sql.properties");
			prop.load(stream);
			System.out.println("url: " + prop.getProperty("url"));

		} catch (Exception e) {
			System.out.println("Error loading properties file: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public String getProperty(String p) {
			return prop.getProperty(p);
		}
}