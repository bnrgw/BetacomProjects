package com.betacom.azienda.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.betacom.azienda.dto.Istruttore;
import com.betacom.azienda.dto.Pianificazione;
import com.betacom.azienda.dto.Richiesta;
import com.betacom.aziennda.model.Attività;

public class PianificazioneService {
      
	public Pianificazione pianificazioneManager(Richiesta richiesta,List<Istruttore> listIstr,List<Attività> listatt,Pianificazione pian) {
		
		String pakageName = "com.betacom.azienda.service";
		String className = "PianificazioneCreate";
		
		System.out.println("Class to execute:" + "pakageName" + className);
		
		
		try {
			Class cl = Class.forName(pakageName + "." + className);
			Constructor[] ctors = cl.getConstructors();// lista di tutti i costruttori della classe className
			Constructor ctorSelected = null;
			
			for (Constructor ctor : ctors) {
				
				if(ctor.getGenericParameterTypes().length == 0) {
					System.out.println("found constructor");
					ctorSelected = ctor;
					break;
				}
			}
			
			
				Object myClass = ctorSelected.newInstance();// creare una nuova isyanza del oggeto con il  construttore
				System.out.println("After new Instance");
				
				String methodName = "pianificazioneExecute";
				Method executeMethod = myClass.getClass().getMethod(methodName, Richiesta.class, List.class,List.class,Pianificazione.class);
				executeMethod.invoke(myClass,richiesta,listIstr,listatt,pian);
				
				
			
			
				
				
		} catch (ClassNotFoundException e) {
			System.out.println("tipo" + richiesta + "invalido");	
				
		}catch (NoSuchMethodException| SecurityException e) {
					e.printStackTrace();		
		}catch( InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				System.out.println("Error in new Instance" + e.getMessage());
			
			
			
		  
			
		}
		return pian;
	}
}
	
	
