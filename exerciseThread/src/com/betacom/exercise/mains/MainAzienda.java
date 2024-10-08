package com.betacom.exercise.mains;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.betacom.azienda.dto.Istruttore;
import com.betacom.azienda.dto.Pianificazione;
import com.betacom.azienda.dto.Richiesta;
import com.betacom.azienda.service.PianificazioneService;
import com.betacom.azienda.utilities.Utility;
import com.betacom.aziennda.model.Attività;



public class MainAzienda extends Thread{

	
	@Override
	public void run() {
		System.out.println("Il thread " + this + "ha iniziato l'esecuzione");
		
		System.out.println("MainAzienda before sleep");
		try {
			Thread.sleep(3000,1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		execute();
		System.out.println("Il thread " + this + " sta per terminare......");
	}
	
	
public void execute() {
    final String attivitaPath = "C:\\Users\\Betacom\\Desktop\\attivita.txt";
    final String istruttorePath = "C:\\Users\\Betacom\\Desktop\\istruttore.txt";
    
    
    Utility u= new Utility();
   List<String> input =u. readLine(attivitaPath);
   
   List<Attività> att = loadAttività(input);
    
    input = u.readLine(istruttorePath);
    List<Istruttore> istr = loadIstruttore(input);
    
    System.out.println("number attività:" + att.size());
    System.out.println("number istruttore:" + istr.size());
    
    Pianificazione pianificazione = new Pianificazione();
    // build richiesta
    Richiesta ri = new Richiesta("Create", "LUN",3,2,2);
    Richiesta ric = new Richiesta("Create", "MAR",3,6,6);
   
		
    //pianificazione pianf = new painificazione()
    //pianf = new PianificazioneService().pianificazioneManager(ri,istr,att);
    
    new PianificazioneService().pianificazioneManager(ri,istr,att,pianificazione);
    new PianificazioneService().pianificazioneManager(ric,istr,att,pianificazione);
    
   // new PianificazioneServiceRemove().pianificazioneManager(ri,istr,att,pianificazione);
    
}
	 private static List<Attività> loadAttività(List<String> input)
	 {
		 return input.stream().map(it -> {//map ti permette di definire come vuoi trasformare un'elemento
			 Attività att = new Attività();
			 String[] token = it.split("\\.");
			 att.setId(Integer.parseInt(token[0]));
			 att.setAttività(token[1]);
			 return att;
			 
		 }).collect(Collectors.toList());
		 
		 
		/* List<Attività> resp = new ArrayList<Attività>();
		 
		 String[] token = null;
		 Attività att = null;
		 
		 for(String it:input) {
			 att = new Attività();
			 token = it.split("\\.");
			 att.setId(Integer.parseInt(token[0]));
			 att.setAttività(token[1]);
			 resp.add(att);
		 }
		 return resp;*/
	 }
	 
	private static List<Istruttore> loadIstruttore(List<String> input){
		return input.stream().map(it ->{
			Istruttore istr = new Istruttore();
			String[] token = it.split(",");
			istr.setIdentificatore(Integer.parseInt(token[0]));
			istr.setCognome(token[1]);
			istr.setNome(token[2]);
			istr.setIdAttività(Integer.parseInt(token[3]));
			 
			return istr;
		}).collect(Collectors.toList());
		
		
		
		
		/* List<Istruttore> resp = new ArrayList<Istruttore>();
		 
		 String[] token = null;
		 Istruttore att = null;
		 
		 for(String it:input) {
			 att = new Istruttore();
			 token = it.split(",");
			 att.setIdentificatore(Integer.parseInt(token[0]));
			 att.setCognome(token[1]);
			 att.setNome(token[2]);
			 att.setIdAttività(Integer.parseInt(token[3]));
			 
			 resp.add(att);
		 }
		 return resp;*/
	
}
	}
