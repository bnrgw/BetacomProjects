package com.betacom.objects;


public class Car {

	private int numeroPorte;
	private String targa;
	private Integer cc;//cilindrata
	
	
	
	public Car() {}



	@Override
	public String toString() {
		return "Car [numeroPorte=" + numeroPorte + ", targa=" + targa + ", cc=" + cc + "]";
	}



	public int getNumeroPorte() {
		return numeroPorte;
	}



	public void setNumeroPorte(int numeroPorte) {
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
