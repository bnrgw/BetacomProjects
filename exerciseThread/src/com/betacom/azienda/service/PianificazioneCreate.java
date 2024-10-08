package com.betacom.azienda.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.betacom.azienda.dto.Pianificazione;
import com.betacom.azienda.dto.Richiesta;
import com.betacom.azienda.dto.Istruttore;
import com.betacom.aziennda.model.Attività;

public class PianificazioneCreate {
	
	public PianificazioneCreate() {
		System.out.println("New instance PianificazioneCreate");
	}
	
	
	public Pianificazione pianificazioneExecute(Richiesta richiesta,List<Istruttore> listIstr,List<Attività> listatt,Pianificazione pianificazione) {
		
		
		//aggiungere una nuova riga alle liste
		
		System.out.println("Siamo dentro la creazione pianificazione :" + richiesta);
		
		//togliere questa riga per il nuovo esercizio
	   
		
		
		try {

			String methodName = "setOra" + richiesta.getGiorno();
			Method executeMethod = pianificazione.getClass().getMethod(methodName, Integer.class);
			executeMethod.invoke(pianificazione,richiesta.getOra());
			//
			
			String nomeIstru = null;
			String nomeAtt= null;
			
			for(Istruttore i: listIstr) {
				if(i.getIdentificatore() == richiesta.getidIstruttore()) {
					nomeIstru = i.getNome();
					break;
				}
			}
			

			for(Attività a: listatt) {
				if(a.getId() == richiesta.getidAttività()) {
					nomeAtt = a.getAttività();
					break;
				}
			}
			
			
			String method ="setNomeIstruttore" + richiesta.getGiorno();//costruzione del nome del metodo
			Method execute = pianificazione.getClass().getMethod(method, String.class);
			execute.invoke(pianificazione,nomeIstru);
			

			String methodA ="setNomeAttività" + richiesta.getGiorno();//costruzione del nome del metodo
			Method executeA = pianificazione.getClass().getMethod(methodA, String.class);
			executeA.invoke(pianificazione,nomeAtt);
			System.out.println("pianificazione fatta con successo");
			
		} catch (NoSuchMethodException e) {
		    System.out.println("Error in acces:" + e.getMessage());
			e.printStackTrace();
		} catch (SecurityException e) {
			System.out.println("Error in method:" + e.getMessage());
			e.printStackTrace();
		}
		
			 catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e ) {
				 System.out.println("Error in security:" + e.getMessage());
			e.printStackTrace();
			 
	}
      return pianificazione;
   }

	/*private String saerchAttivita(int id, List<Istruttore> istr){
		return istr.stream().filter(i-> i.getId() == id)
				.findFirst()
				   .map(i -> getAtivita())
				   .orElse(null);
	}
	/*
	 * private String saerchAttivita(int id, List<Stttivita> att){
	 * return att.stream().filter(-> i.getId() == id)
	 *  .findFirst()
	 *  .map(i -> getAtivita())
	 *  .orElse(nul);
	 * 
	 */
	
	
}	
