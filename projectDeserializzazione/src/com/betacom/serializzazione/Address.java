package com.betacom.serializzazione;

import java.io.Serializable;

public class Address implements Serializable {// dichiaro che il mio oggetto puo essere serializzato
	
	private static final long serialVersionUID = 2L;//identificazione della versione di serializzazione
// serve a controllare se siamo alineati con la versione del server che deserializzerà questo oggetto

	private String street;
	private String city;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
	
}
