package com.betacom.azienda.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.betacom.aziennda.model.Attività;

public class Utility {
	

	 public Utility() {
		super();
	}

	public static  List<String> readLine(String filePath){
		 List<String> res = new  ArrayList<String>();
		 try 
			 (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
				 String line = reader.readLine();
				 while(line!= null) {
					 res.add(line);
					 line = reader.readLine();
				 }
			 }catch (FileNotFoundException e ) {
				 e.printStackTrace();
			 }catch (IOException e) {
				 e.printStackTrace();
			 }
		return res;
	}
	
	 }
	 
	 
	 
	 
	 
	 
	 
	 

