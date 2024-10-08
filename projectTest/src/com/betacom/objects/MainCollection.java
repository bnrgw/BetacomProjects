package com.betacom.objects;

import java.util.List;
import java.util.ArrayList;

public class MainCollection {

	public static void main(String[] args) {
		
		List<Client> Clist = new ArrayList<Client>();
		 Client cli = new Client("nome1" , "cognome1", 80);
		 
		 Clist.add(new Client("nome1" , "cognome1", 80) );
		 Clist.add(new Client("nome2" , "cognome2", 20) );
		 Clist.add(new Client("nome3" , "cognome3", 40) );
		 Clist.add(new Client("nome4" , "cognome4", 10) );
		 Clist.add(new Client("nome5" , "cognome5", 30) );
		 Clist.add(new Client("nome6" , "cognome6", 70) );
		 Clist.add(new Client("nome7" , "cognome7", 80) );
		 Clist.add(new Client("nome8" , "cognome8", 18) );
		 
		 
		 for(Client it :Clist) {
			 System.out.println(it.toString());
		 }
		 
		 cli.sort(new CompareByAge());
		 System.out.println("*******sort*******");
		 System.out.println(cli);
		 
		 
	}

}
