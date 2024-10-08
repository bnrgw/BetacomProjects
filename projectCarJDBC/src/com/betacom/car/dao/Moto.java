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
	public Moto(Integer id, String tipoVeicolo, String tipoAlimentazione, String colore, String marca,
			Integer numeroRoute, Integer numeroPosti, String targa, Integer cilindrata) {
		super(id, tipoVeicolo, tipoAlimentazione, colore, marca, numeroRoute, numeroPosti);
		this.targa = targa;
		this.cilindrata = cilindrata;
	}
	@Override
	public String toString() {
		return "Moto [targa=" + targa + ", cilindrata=" + cilindrata + "]";
	} 
	


	
}
