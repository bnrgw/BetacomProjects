package com.betacom.car.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.betacom.car.config.SQLConfiguration;
import com.betacom.car.sql.SQLManager;
import com.betacom.car.utilities.DBUtilities;

public class MainProcess {

	private static SQLManager db = new SQLManager();


	public void execute() {
		/*
		 * legge le richieste 
		 * trasforma le richieste in oggetti 
		 * chiamata delle funzioni
		 * 
		 */

		String filePath = "./commands.txt";
		Connection con = db.initSQL();
		
		String[] currentProcess = new String[4]; // list?

		String line;

//        System.out.println("after connection to db");
//        //lista di tutte le tabelle
//        db.listOfTable(con, "dbcar");
//		
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			while ( (line = reader.readLine()) != null) {
				currentProcess = line.split(" "); // da cambiare se passiamo da chiavi a descrizioni per params ("A-1"->"Cross Over"))
		
				switch (currentProcess[0].toLowerCase()) {
				case "insert":
					new CommonProcess().executeInsert(con, currentProcess);
					break;
				case "select":
					new CommonProcess().executeSelect(con, currentProcess);
					break;
				case "delete":
					
					break;
				case "update":
					
					break;

				default:
					break;
				}
				
			}
		} catch (IOException e) {
			System.out.println("Reading file error: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(currentProcess[1] + " process failed: " + e.getMessage());
			e.printStackTrace();
		}

	}	

}
