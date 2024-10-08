package com.betacom.car.servizi.implementazione;

import java.util.List;

import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.oggetti.singleton.Mysingleton;
import com.betacom.car.serviziinterface.IGestionSingleton;

public class GestionSingleton implements IGestionSingleton {

	public void displayList() {
		System.out.println( Mysingleton.getInstance().getListV());
	}

	public Boolean removeItem(Integer id) {
	return Mysingleton.getInstance().removeItem(id);
	}

	
	public void updateList(Veicolo obj) {
		Mysingleton.getInstance().updateList(obj);
	}
	
	public Veicolo getItem(Integer id) {
		
		Veicolo v =Mysingleton.getInstance().getItem(id);
		return v;
		
	}
	
	public int getId() {
		int i =  Mysingleton.getInstance().getId();
		return i;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
