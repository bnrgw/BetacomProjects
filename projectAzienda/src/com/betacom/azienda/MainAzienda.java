package com.betacom.azienda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.betacom.azienda.dto.Istruttore;
import com.betacom.azienda.dto.Pianificazione;
import com.betacom.azienda.dto.Richiesta;
import com.betacom.azienda.service.PianificazioneService;
import com.betacom.azienda.utilities.Utility;
import com.betacom.aziennda.model.Attività;

public class MainAzienda extends Utility {

	public static void main(String[] args) {
		
       final String attivitaPath = "C:\\Users\\Betacom\\Desktop\\attivita.txt";
       final String istruttorePath = "C:\\Users\\Betacom\\Desktop\\istruttore.txt";
       
      List<String> input = readLine(attivitaPath);
      List<Attività> att = loadAttività(input);
       
       input = readLine(istruttorePath);
       List<Istruttore> istr = loadIstruttore(input);
       
      // System.out.println("number attività:" + att.size());
       //System.out.println("number istruttore:" + istr.size());
       
       Pianificazione pianificazione = new Pianificazione();
       // build richiesta
       Richiesta ri = new Richiesta("Create", "LUN",3,2,2);
       Richiesta ri1 = new Richiesta("Create", "MER",5,3,1);
       Richiesta ri2 = new Richiesta("RemoveAll", "VEN",3,1,4);
       //Richiesta ric = new Richiesta("Remove", "MAR",3,6,6);
      
		
       //pianificazione pianf = new painificazione()
       //pianf = new PianificazioneService().pianificazioneManager(ri,istr,att);
       
       new PianificazioneService().pianificazioneManager(ri,istr,att,pianificazione);
       //new PianificazioneService().pianificazioneManager(ric,istr,att,pianificazione);
       new PianificazioneService().pianificazioneManager(ri1,istr,att,pianificazione);
       new PianificazioneService().pianificazioneManager(ri2,istr,att,pianificazione);
       
       System.out.println(pianificazione);
       
      // new PianificazioneServiceRemove().pianificazioneManager(ri,istr,att,pianificazione);
       
	}
	

	 private static List<Attività> loadAttività(List<String> input){
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
