package com.betacom.car.dao;

public class Moto extends Veicolo{

	private String targa;
	private Integer cilindrata;
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Integer getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	@Override
	public String toString() {
		return "Moto [targa=" + targa + ", cilindrata=" + cilindrata + "]";
	} 
	


	
}
