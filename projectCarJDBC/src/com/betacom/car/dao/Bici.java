package com.betacom.car.dao;

public class Bici extends Veicolo{
	
	private String ammortizzatore;
	private boolean pieghevole;
	private boolean assistita;
	
	
	public String getAmmortizzatore() {
		return ammortizzatore;
	}

	public void setAmmortizzatore(String ammortizzatore) {
		this.ammortizzatore = ammortizzatore;
	}

	public boolean isPieghevole() {
		return pieghevole;
	}

	public void setPieghevole(boolean pieghevole) {
		this.pieghevole = pieghevole;
	}

	public boolean isAssistita() {
		return assistita;
	}

	public void setAssistita(boolean assistita) {
		this.assistita = assistita;
	}

	public Bici(Integer id, String tipoVeicolo, String tipoAlimentazione, String colore, String marca,
			Integer numeroRoute, Integer numeroPosti, String ammortizzatore, boolean pieghevole, boolean assistita) {
		super(id, tipoVeicolo, tipoAlimentazione, colore, marca, numeroRoute, numeroPosti);
		this.ammortizzatore = ammortizzatore;
		this.pieghevole = pieghevole;
		this.assistita = assistita;
	}
	

	@Override
	public String toString() {
		return "Bici [ammortizzatore=" + ammortizzatore + ", pieghevole=" + pieghevole + ", assistita=" + assistita
				+ "]";
	}
	
	
}
