package com.betacom.CSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import com.betacom.CSV.object.User;

import com.betacom.CSV.object.User;

public class MainCSV {

	public static void main(String[] args) {
		
	
	
	/*
	 * creare una lista di ogetti tipo user(true femina, false maschio)
	 * sort per cognome
	 * creare un file .csv (format valore1 ; valore2 etc....
	 * 
	 * il sessso deve avere come valore Maschio/femina
	 * 
	 * 
	 * String pattern = "EEEE dd MMMM yyyy";
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	this.dataNascita = sdf.format(dataNascita);
	 */
		

		String pattern = "EEEE dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		Date date1 = new Date();
		Date date2 = new Date();
		Date date3 = new Date();
		
		String dataString1 ="10/06/2009";
		String dataString2 ="13/12/2019";
		String dataString3 ="22/03/2022";
		 
		 sdf = new SimpleDateFormat("dd/MM/yyyy");
		 
		 try {
			 date1 = sdf.parse(dataString1);
			 date2 = sdf.parse(dataString2);
			 date3 = sdf.parse(dataString3);
		 }catch (ParseException e) {
			 e.printStackTrace();
		 }
		 SimpleDateFormat sdfOutput = new SimpleDateFormat(pattern);
		 System.out.println("Risultato:" +sdfOutput.format(date1));
		 
/////uso classe User///////////////////////////////////////
		List<User> users = new ArrayList<User>();
		
		
		users.add(new User("paolo", "Franco",false,date1));
		users.add(new User("paola", "Bianca",true,date2));
		users.add(new User("Julio", "Nonno",false,date3));
		
		
		//Collections.sort(users, new UserComparator());
		
		String filePath = "/C:\\Users\\Betacom\\Desktop\\excel.csv";
		 File f = new File(filePath);
		 
		 try {
			if(f.createNewFile()) { System.out.println("File created");
			 
			 }else System.out.println("File Not created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 WriteFile(users,f);
			
		 
		for(User u:users) {
			System.out.println((int) u.getDataNascita().getTime());
		}
		 
		 
		 ////////////////Scrittura nel file csv////////////////////////////////
		
      }	
		
	
	
	 public static void WriteFile(List<User> list , File f) {
		  
			 FileWriter o = null;
				int num = 0;
				try {
					o = new FileWriter(f);
					for (User u : list) {
						o.write(u.getNome() + ";");
						o.write(u.getCognome() + ";");
						o.write((u.getSesso()) + ";");
						o.write(u.getDataNascita() + ";" +"\n");
						num++;

					}
				}catch (IOException e) {
					System.out.println("Error scrittura file" + e.getMessage());
		}finally {
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
	
	










class UserComparator implements java.util.Comparator<User> {
   @Override
   public int compare(User a, User b) {
       return (int) (a.getDataNascita().getTime() - b.getDataNascita().getTime());
   }
}
}
		
	
