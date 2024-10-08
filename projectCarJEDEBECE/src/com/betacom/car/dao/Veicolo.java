	package com.betacom.car.dao;

public  class Veicolo {

	private Integer id;
	private String tipoVeicolo;
	private String tipoAlimentazione;
	private String colore;
	private String marca;
	private Integer numeroRoute;
	
	public Veicolo() {
		super();
	}
	
	private Integer numeroPosti;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoVeicolo() {
		return tipoVeicolo;
	}
	public void setTipoVeicolo(String tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}
	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}
	public void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione = tipoAlimentazione;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getNumeroRuote() {
		return numeroRoute;
	}
	public void setNumeroRuote(Integer numRuote) {
		this.numeroRoute = numRuote;
	}
	public Integer getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(Integer numPosti) {
		this.numeroPosti = numPosti;
	}
	/*public Veicolo(Integer id, String tipoVeicolo, String tipoAlimentazione, String colore, String marca,
			Integer numeroRoute, Integer numeroPosti) {
		super();
		this.id = id;
		this.tipoVeicolo = tipoVeicolo;
		this.tipoAlimentazione = tipoAlimentazione;
		this.colore = colore;
		this.marca = marca;
		this.numeroRoute = numeroRoute;
		this.numeroPosti = numeroPosti;
	}*/
	
	@Override
	public String toString() {
		return "Veicolo [id=" + id + ", tipoVeicolo=" + tipoVeicolo + ", tipoAlimentazione=" + tipoAlimentazione
				+ ", colore=" + colore + ", marca=" + marca + ", numeroRoute=" + numeroRoute + ", numeroPosti="
				+ numeroPosti + "]";
	}

	

}
