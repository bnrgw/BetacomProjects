package com.betacom.car.servizi.implementazione;

import java.util.Date;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Bici;
import com.betacom.car.oggetti.Macchina;
import com.betacom.car.oggetti.Moto;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.oggetti.singleton.Mysingleton;
import com.betacom.car.serviziinterface.IGestionSystem;

public class GestionSystem implements IGestionSystem {

	public Veicolo createVeicolo(Veicolo v) {

		String tipoVeicolo = controlTipoVeicolo(v);// controllo il tipo del vceicolo(macchina ,moto o bici)
		Veicolo ve = null;

		if (v != null) {// GRANDE IF CHE CONTROLLA TUTTI I TIPI DI VEICOLI
			try {
				controlVeicolo(v);// controllo che il veicolo abbia tutti i parametri

				if (tipoVeicolo.equals("Macchina")) {
					try {
						ve = gm.createVeicolo(v);
					} catch (AcademyException ex) {
						System.out.println("Error" + " " + ex.getMessage());
					} finally {
						System.out.println("metodo create macchina eseguito");
					}
				}

				if (tipoVeicolo.equals("Moto")) {
					try {
						ve = gmo.createVeicolo(v);
						
					} catch (AcademyException ex) {
						System.out.println("Error" + " " + ex.getMessage());
					} finally {
						System.out.println("metodo create moto eseguito");
					}
				}

				if (tipoVeicolo.equals("Bici")) {
					try {
						ve = gmb.createVeicolo(v);
					} catch (AcademyException ex) {
						System.out.println("Error" + " " + ex.getMessage());
					} finally {
						System.out.println("metodo create bici eseguito");
					}
				}

			} catch (AcademyException e) {
				System.out.println("Error" + " " + e.getMessage());
			}

		} else {// USITA DELL GRANDE IF
			System.out.println("Il veicolo non può essere null");
		}
		return ve;
	}

	public void showListVeicoli() {
		gs.displayList();
	}

	public Boolean removeVeicolo(Veicolo v) {

		String tipoVeicolo = controlTipoVeicolo(v);
		Boolean rc = false;
		if (v != null) {
             
			if (tipoVeicolo.equals("Macchina")) {

				try {
					 rc = gm.removeVeicolo(v.getId());
				} catch (AcademyException e) {
					System.out.println("Error" + " " + e.getMessage());
				}
			}

			if (tipoVeicolo.equals("Moto")) {

				try {
					rc = gmo.removeVeicolo(v.getId());
				} catch (AcademyException e) {
					System.out.println("Error" + " " + e.getMessage());
				}
			}
			
			if (tipoVeicolo.equals("Bici")) {
				

				try {
					rc = gmb.removeVeicolo(v.getId());
				} catch (AcademyException e) {
					System.out.println("Error" + " " + e.getMessage());
				}
			}
		
		}
		return rc;
	}

	public Veicolo getVeicolo(Integer id) {
		
    Veicolo v =gm.getVeicolo(id);
    return v;

	}

////////////////////////////////////////////////////////////////////////////SECOND HAND METHODS///////////////////////////////////////////////////////////////////////////////////////
	public String controlTipoVeicolo(Veicolo v) {
		if (v instanceof Macchina) {
			return "Macchina";
		}
		if (v instanceof Moto) {
			return "Moto";
		}

		if (v instanceof Bici) {
			return "Bici";
		}
		return null;
	}

	public Void controlVeicolo(Veicolo v) throws AcademyException {
		// controllo tutti i campi del veicolo.
		if (v.getNumeroRuote() == null || v.getVelocità() == null || v.getTipoAlimentazione() == null
				|| v.getId() == null) {
			throw new AcademyException(
					"Numero ruote , Id, velocità e tipo alimentazione obbligatorio per creare un veicolo");
		}
		return null;
	}
}
