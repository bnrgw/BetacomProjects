package com.betacom.car.serviziinterface;

import java.util.List;

import com.betacom.car.oggetti.Veicolo;

public interface IGestionSingleton {

	public void displayList() ;
	public Boolean removeItem(Integer id);
	public void updateList(Veicolo obj);
	public Veicolo getItem(Integer id);
	public int getId();
	
}
