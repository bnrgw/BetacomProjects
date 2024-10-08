package com.betacom.car.servizi.implementazione;
import java.util.Date;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Bici;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.oggetti.singleton.Mysingleton;
import com.betacom.car.serviziinterface.IGestioneVeicolo;

public class GestioneBici implements IGestioneVeicolo{
	
@Override
	
	public Veicolo createVeicolo(Veicolo param)throws  AcademyException {
		Bici bici = (Bici)param;
		
		//verifico se mac appena creato da param é una veicolo,controllando gli attributi obbligatori
				if( bici.getVelocità() == null || bici.getTipoAlimentazione()== null) {
					throw new AcademyException("velocità e tipo alimentazione obbligatorio per veicolo bici");	
				}
				
				bici.setDataCreazione(new Date());
				
			
			return bici;
				
		

}

@Override
public Boolean removeVeicolo(Integer id) throws AcademyException {
	return !gs.removeItem(id);
}


@Override
public Veicolo getVeicolo(Integer id) {
	Veicolo v =gs.getItem(id);
	return v;
}

/*
 * public boolean controlTipoBici(String Bici,String tipo) {
		boolean rc = false;
		for(String tm: tipoBici) {
			if(tm.equals(tipo)) {
			rc = true;}
			 
		}
		return rc;
	}
 */

}
