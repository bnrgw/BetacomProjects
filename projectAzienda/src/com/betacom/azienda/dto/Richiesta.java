package com.betacom.azienda.dto;

import java.util.Date;

public class Richiesta {

	private String tipo; // puo essere add, remove,update di elementi
	private String giorno; // LUN,MAR,MER....
	private Integer ora;
	private Integer idIstruttore;
	private Integer idAttività;
	
	
	@Override
	public String toString() {
		return "Richiesta [tipo=" + tipo + ", giorno=" + giorno + ", ora=" + ora + ", idIstruttore=" + idIstruttore
				+ ", idAttività=" + idAttività + "]";
	}
	public Richiesta(String tipo, String giorno, Integer ora, Integer idIstruttore, Integer idAttività) {
		super();
		this.tipo = tipo;
		this.giorno = giorno;
		this.ora = ora;
		this.idIstruttore = idIstruttore;
		this.idAttività = idAttività;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getGiorno() {
		return giorno;
	}
	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}
	public Integer getOra() {
		return this.ora;
	}
	public void setOra(Integer ora) {
		this.ora = ora;
	}
	public Integer getidIstruttore() {
		return idIstruttore;
	}
	public void setidIstruttore(Integer idIstruttore) {
		this.idIstruttore = idIstruttore;
	}
	public Integer getidAttività() {
		return this.idAttività;
	}
	public void setAttività(Integer attività) {
		this.idAttività = attività;
	}
	
	
	
	
	
	
	
}
