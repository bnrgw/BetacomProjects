package com.betacom.car.servizi.implementazione;

import java.util.Date;
import java.util.List;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Macchina;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.oggetti.singleton.Mysingleton;
import com.betacom.car.serviziinterface.IGestioneVeicolo;

public class GestioneMacchina implements IGestioneVeicolo{

	@Override
	public Veicolo createVeicolo(Veicolo param) throws  AcademyException {
			
		    Macchina mac = (Macchina) param;
		    
		    if(mac.getNumeroPorte() < 3 || mac.getNumeroPorte() > 5 || mac.getNumeroPorte() == null  ) {
		    	throw new AcademyException("La macchina deve avere minimo 3 porte, un massino 5 e non puo essere null");
		    }
		    
			/*if(!controlTipoMacchina(param.getTipoVeicolo())) {
				throw new AcademyException("Tipo macchina non valido");
			}*/
			
			if(mac.getTarga() == null) {
				throw new AcademyException("Numero targa della macchina  non puo essere null");
			}
			
			if(mac.getCc() == null) {
				throw new AcademyException("La cilindrata della macchina  non può essere null");
			}
			
		
			param.setDataCreazione(new Date());
			param.setDataDopoUnMese(new Date());
			
			 param.setId(gs.getId());
			 
			gs.updateList(param);
		
		return param;
		
		}
	
	@Override
	public Boolean removeVeicolo(Integer id) throws AcademyException {
			return gs.removeItem(id);
		
	}
	
	@Override
	public Veicolo getVeicolo(Integer id) {
		
		 Veicolo v =gs.getItem(id);
		 return v;
	}
}
	
	/*public boolean controlTipoMacchina(String tipoVeicolo) {
		boolean rc = false;
		for(String tm:gs.getTipoMacchina()) {
			if(tm.equals(tipoVeicolo)) {
			rc = true;}
			 
		}
		return rc;
	}
	
		
	}
	
//	if(!Mysingleton.getinstance(.controlTipoMachina(param).getTipoVehivolo()))
	//	throw new Academyexception("Tipo macchina invalida")
 /*public Macchina createMacchina(Macchina param) {
	 Veicolo veicolo = createVeicolo(param);
 }*/
	
	



