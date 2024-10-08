package com.betacom.json;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.betacom.json.object.Data;

import com.betacom.json.object.Persona;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class MainJson {

	public static void main(String[] args) {
		/*Persona p = new Persona("Mario", "Rossi", new Data(1, 10, 1999));

		Gson gson = new Gson();
		
		//transform object in jason
		
		String jsonString = gson.toJson(p);
		
		System.out.println("jsontoString:" + jsonString);
		
		Persona newPersona = gson.fromJson(jsonString, Persona.class);
		System.out.println("newPersona:" + newPersona);
		
		*/
		
		String filePath = "/C:\\Users\\Betacom\\Desktop\\fileJason.json";
		List<Persona> il = new ArrayList<Persona>();
		
		il.add(new Persona("Mario", "Rossi", new Data(1, 10, 1999)));
		il.add(new Persona("Dario", "Neri", new Data(1, 10, 1994)));
		il.add(new Persona("Antonio", "Maroni", new Data(1, 10, 1989)));
		il.add(new Persona("Maria", "Giali", new Data(1, 10, 2000)));
		
		//Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonlist = gson.toJson(il);
		System.out.println("jsonlist:" + jsonlist);
		
		/*List<Persona> resList = gson.fromJson(jsonlist, List.class);
		System.out.println("resList:" + resList);*/
		
		createFile(filePath);
		writeJSON(filePath, jsonlist);
	}
	
	 private static void writeJSON(String path, String jsonList) {
	        try (FileWriter writer = new FileWriter(new File(path))) {
	            writer.write(jsonList);
	            System.out.println("File JSON scritto con successo!");
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 
	 private static void createFile(String filePath) {
	 
		File f = new File(filePath);
		 
		 try {
			if(f.createNewFile()) { System.out.println("File created");
			 
			 }else System.out.println("File Not created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
