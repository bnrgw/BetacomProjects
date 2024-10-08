package com.betacom.sql.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.betacom.sql.exception.SQLAcademyException;

public class SQLConfiguration {
	private static String url;
	private static String driver;
	private static String user;
	private static String pwd;

	private static SQLConfiguration instance = null;

	private SQLConfiguration() {

	}

	public static SQLConfiguration getInstance() throws SQLAcademyException {
		if (instance == null) {
			instance = new SQLConfiguration();
			loadConfiguration();
		}
		return instance;
	}

	private static void loadConfiguration() throws SQLAcademyException {
		try {
			Properties prop = new Properties();
			InputStream stream = new FileInputStream("C:\\Users\\Betacom\\eclipse-workspace\\projectSql\\sql.properties");
			prop.load(stream);

			url = prop.getProperty("url");
			driver = prop.getProperty("driver");
			user = prop.getProperty("user");
			pwd = prop.getProperty("pwd");

		} catch (Exception e) {
			System.out.println("Error loading preperties file...");
			e.printStackTrace();
			throw new SQLAcademyException();
		}

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
