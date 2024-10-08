package com.betacom.car.oggetti;

public class Macchina extends Veicolo {

	private int numeroPorte;
	private String targa;
	private Integer cc;//cilindrata
	
	
	
	public Macchina() {}

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

	public Integer getCc() {
		return cc;
	}

	public void setCc(Integer cc) {
		this.cc = cc;
	}
	
	
}
