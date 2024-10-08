package com.betacom.car.dao;

public class Macchina extends Veicolo{

	private Integer numeroPorte;
	
	public Macchina(Integer numeroPorte, String targa, Integer cilindrata) {
		super();
		this.numeroPorte = numeroPorte;
		this.targa = targa;
		this.cilindrata = cilindrata;
	}

	public Macchina() {
		
	}

	private String targa;
	private Integer cilindrata;
	
	public Integer getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(Integer numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
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
		return "Macchina [numeroPorte=" + numeroPorte + ", targa=" + targa + ", cilindrata=" + cilindrata + "]";
	}
	
	

}
