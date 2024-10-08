
package com.betacom.car.oggetti.singleton;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.betacom.car.oggetti.Bici;
import com.betacom.car.oggetti.Macchina;
import com.betacom.car.oggetti.Moto;
import com.betacom.car.oggetti.Veicolo;



public class Mysingleton {
// AVERE UNA SOLA ISTANZA DI UNA CLASSE	 
// Questa classe contienne la base di dati della applicazione , e tutti i metodi che possono interagire direttamente sulle liste e arry di dati.
	private List<Veicolo> listV = new ArrayList<Veicolo>();
	private int id = 0;
	private static String  filePath = "C:\\Users\\Betacom\\Desktop\\fileJava.txt";
	private static boolean isFree = true;
	private static Map<String,List<String>> mapControl = new HashMap<String, List<String>>();
	
	private Mysingleton() {

	}
	
	private  static void initSystem() {
		
		ReadFile rf= new ReadFile();
		mapControl = rf.readLine(filePath);
		Set <Entry<String,List<String>>> entry = mapControl.entrySet();
		for(Entry<String,List<String>> e : entry) {//entry a questo punto è un entità di map, permette di avere sia la chiave che il valore
			System.out.println( e.getKey() + ": " + e.getValue());
		}
	
	}
	
	public List<Veicolo> getListV(){
		return this.listV;
	}
	
	
	
	public boolean controlSystem(String tipoVeicolo, String tipoSpecifico){
			
			 boolean rc = false;

		        for (String t : mapControl.get(tipoVeicolo)) {
		            if (t.equalsIgnoreCase(tipoSpecifico)) {
		                rc = true;
		            }
		        }

		        return rc;
	}
	

	private static Mysingleton instance = null;

	public static Mysingleton getInstance() {
		if (instance == null) {
			instance = new Mysingleton();
			initSystem();
		}
	
		return instance;
	}

	

	public  void updateList(Veicolo obj) {
		if(canIWork()) {
			isFree = false;
			listV.add(obj);
			System.out.println("object has been added");
			isFree = true;
		}
	}


	public int getId() {
		id++;
		return id;
	}

	
	public  Boolean removeItem(Integer id) {
		boolean rc = false;
		if(canIWork()) {
			isFree = false;
			rc = listV.removeIf(it -> it.getId()== id);
			isFree =true;
		}
	return rc;
	}

	private boolean canIWork() {
		while(!isFree) {
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		};
	}
		return isFree;
	}		
	
	public Veicolo getItem(Integer id) {
		return listV.stream().filter(it -> it.getId() == id).findFirst().orElse(null);
				
		
	}

}
