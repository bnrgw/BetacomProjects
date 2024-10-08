package com.betacom.thread;

public abstract class Automobile {

	private String marca;
	private String modello;
	private String targa;
	private int cilindrata;
	
	
	public Automobile(String marca, String modello, String targa, int cilindrata) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.cilindrata = cilindrata;
	}
	
	public abstract String getType();
	
	public String getMessage() {
		return "" + this + "Tipo " + getType() + this.marca + " Modello "
				+ this.modello +" cilindrata " + this.cilindrata;
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", targa=" + targa + ", cilindrata=" + cilindrata
				+ "]";
	}
	
	
	
	
}
