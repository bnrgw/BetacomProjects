package com.betacom.car.serviziinterface;


import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Macchina;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.servizi.implementazione.GestionSingleton;
import com.betacom.car.servizi.implementazione.GestioneBici;
import com.betacom.car.servizi.implementazione.GestioneMacchina;
import com.betacom.car.servizi.implementazione.GestioneMoto;

public interface IGestionSystem {
 // definire un prototipo di metodo, poi si fa l'mplementazione che ci permette di non più chaimare il singleton
	
	
	static IGestioneVeicolo gm = new GestioneMacchina();
	 static IGestioneVeicolo gmo = new GestioneMoto();
	 static IGestioneVeicolo gmb = new GestioneBici();
	 static GestionSingleton gs= new GestionSingleton();
	 
	public    Veicolo createVeicolo(Veicolo v);
	public String controlTipoVeicolo(Veicolo v);
	public Void controlVeicolo(Veicolo v) throws AcademyException ;
	public Boolean removeVeicolo(Veicolo v ) throws AcademyException ;
}
