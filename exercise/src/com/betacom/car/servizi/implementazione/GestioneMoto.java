package com.betacom.car.servizi.implementazione;
import java.util.Date;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Moto;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.oggetti.singleton.Mysingleton;
import com.betacom.car.serviziinterface.IGestioneVeicolo;

public class GestioneMoto implements IGestioneVeicolo {

	@Override
	
	public Veicolo createVeicolo(Veicolo param) throws  AcademyException{
		Moto moto = (Moto)param;
		
		//verifico se mac appena creato da param é una veicolo,controllando gli attributi obbligatori
		if( moto.getVelocità() == null || moto.getTipoAlimentazione()== null) {
			throw new AcademyException(" velocità e tipo alimentazione obbligatorio per veicolo moto");	
		}
		
		moto.setDataCreazione(new Date());
		
	
	return moto;
		
		
	}
	
	@Override
	public Boolean removeVeicolo(Integer id) throws AcademyException {
		return !gs.removeItem(id);
			
		
	}
	
	@Override
	public Veicolo getVeicolo(Integer id){
		Veicolo v = gs.getItem(id);
		return v;
	}
	
	/*public boolean controlTipoMoto(String Moto,String tipo) {
		boolean rc = false;
		for(String tm: tipoMoto) {
			if(tm.equals(tipo)) {
			rc = true;}
			 
		}
		return rc;
	}*/ // chiama il singleton
	
	
}
