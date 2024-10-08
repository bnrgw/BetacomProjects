package com.betacom.projectFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class mainFile {

	public static void main(String[] args) {

		/*
		 * File f = new File(filePath);
		 * 
		 * if(f.exists()) { System.out.println("File exist");
		 * 
		 * }else System.out.println("File Not exist");
		 * 
		 * FileWriter o = null;
		 */

		String filePath = "/C:\\Users\\Betacom\\Desktop\\myfileJava.txt";

		List<String> records = new ArrayList<String>();
		
	/*	 records.add("record 1 \n");
	        records.add("record 2 \n");
	        records.add("record 3 \n");
	        records.add("record 4 \n");
	        records.add("record 5 \n");
	        records.add("record 6 \n");
	        records.add("record 7 \n");
	        records.add("record 8 \n");
	        records.add("record 9 \n");


	     /*   System.out.println("Records write: " + writeFile(filePath, records));
		String record = "Record added ....\n";
		appendUsingFileWriter(filePath, records);*/

		System.out.println("\n Begin read");
		List<String> rr = readFile(filePath);
		for (String r : rr) {
			System.out.println(r);
		}

		
		
		/*System.out.println("Records write: " + writeFile(filePath, records));
        String record = "Record added ....\n";
        appendUsingFileWriter(filePath, record);

        List<String> rr = readFile(filePath);

        for(String r:rr) {
        System.out.println(r);
		/*
		 * try {
		 * 
		 * o = new Filewriter(f); dor(string record:records) o= new FileWriter(f);
		 * 
		 * 
		 * 
		 * } catch (IOException e) { System.out.println("Error creazione file:" +
		 * e.getMessage()); e.printStackTrace(); }finally{ if(o != null) { try {
		 * o.flush();// per cnacellare tutta la memoria o.close();
		 * System.out.println("Filewriter is closed"); } catch (IOException e) {
		 * System.out.println("Errore chiusura file:" + e.getMessage());
		 * e.printStackTrace(); } } }
		 */

		System.out.println("\n Begin read");
	}

	private static void writeFile(String filePath, List<String> records) {
		File f = new File(filePath);
		if (f.exists()) {
			System.out.println("File exist");
			f.delete();
		} else {
			System.out.println("File NOT exist");
		}

		FileWriter o = null;
		int num = 0;
		try {
			o = new FileWriter(f);
			for (String record : records) {
				o.write(record + "\n");
				num++;

			}
		} catch (IOException e) {
			System.out.println("Error creazione file" + e.getMessage());
		} finally {
			if (o != null) {
				try {
					o.flush();// per cnacellare tutta la memoria
					o.close();
					System.out.println("Filewriter is closed");
				} catch (IOException e) {
					System.out.println("Errore chiusura file:" + e.getMessage());
					e.printStackTrace();
				}
			}

		}
	}

	/*-public static void appendUsingFileWriter(String filePath, List<String> record) {// estende un file usando il suo
																					// path e la stringa da inserire
		File file = new File(filePath);
		FileWriter fr = null;

		try {
			fr = new FileWriter(file, true);
			fr.write(record);

		} catch (IOException e) {
			System.out.println("Errore in append:" + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println("Errore in append:" + e.getMessage());
				e.printStackTrace();
			}
		}

	}*/
//legge ogni carattere di una stringa
	private static List<String> readFile(String path){
		List<String> res = new ArrayList<String>();
			FileReader fileIn;
			int next;
		
		StringBuilder sb = new StringBuilder();
		try {
			fileIn = new FileReader(path);
			do {
				next = fileIn.read();
				if(next != -1) {
					char nextc = (char) next;
					if(nextc =='\n') {
					res.add(sb.toString());
					sb= new StringBuilder();
					}else {
						sb.append(nextc);
					}
				
			}
			
			}while (next !=-1);
		}catch(IOException e) {
			 System.out.println("Errore in append:" + e.getMessage());
				e.printStackTrace();
		}
		return res;
	}

  
//legge ogni linea di un file
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


