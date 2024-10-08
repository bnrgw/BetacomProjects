package com.betacom.car.serviziinterface;

import java.util.List;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.servizi.implementazione.GestionSingleton;

public interface IGestioneVeicolo   {
	
	static GestionSingleton gs = new GestionSingleton();
	
  Veicolo  createVeicolo(Veicolo param ) throws AcademyException;
  
  Boolean removeVeicolo(Integer id)  throws AcademyException;
  
  Veicolo getVeicolo(Integer id) ;
  

}
