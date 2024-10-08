package com.betacom.azienda.service;

import com.betacom.azienda.dto.Pianificazione;
import com.betacom.azienda.dto.Richiesta;

import java.util.List;

import com.betacom.azienda.dto.*;
import com.betacom.aziennda.model.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PianificazioneRemoveAll {

	public PianificazioneRemoveAll() {
		System.out.println("New Instance PianificazioneRemoveAll");
	}

	
	
public Pianificazione pianificazioneExecute(Richiesta richiesta, List<Istruttore> lIstr, List<Attività> lAtt, Pianificazione pian) {
	String[] dayStrings = {"LUN", "MAR", "MER", "GIO", "VEN", "SAB", "DOM"};
	try {	
		for (String string : dayStrings) {
			
		
		String methodName="setOra"+string; 			
	
			
		Method executeMethod= pian.getClass().getMethod(methodName, Integer.class); 
			executeMethod.invoke(pian, (Integer)null);				
			methodName="setNomeIstruttore"+string;

		executeMethod= pian.getClass().getMethod(methodName, String.class);
		executeMethod.invoke(pian, (String)null);
	
		methodName="setNomeAttivita"+string;
 		
		executeMethod= pian.getClass().getMethod(methodName, String.class);
			executeMethod.invoke(pian, (String)null);										
			
		} 
	}catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
		System.out.println("Error in access: "+e.getMessage());
		e.printStackTrace();
		}  catch (NoSuchMethodException e) {
			System.out.println("Error in method: "+e.getMessage());
	} catch (SecurityException e) {
		System.out.println("Error in security: "+e.getMessage());
	}
	
		
		return pian;
		
}
}
