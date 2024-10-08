package com.betacom.azienda.dto;

import java.util.Date;

public class Istruttore {

	private Integer identificatore; // puo essere dipendente, consulente
	private String cognome;
	private String nome;
	private int idAttività; //
	
	
	public Istruttore() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "Istruttore [identificatore=" + identificatore + ", cognome=" + cognome + ", nome=" + nome
				+ ", idAttività=" + idAttività + "]";
	}



	public Integer getIdentificatore() {
		return identificatore;
	}
	public void setIdentificatore(Integer identificatore) {
		this.identificatore = identificatore;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdAttività() {
		return idAttività;
	}
	
	
	public void setIdAttività(int idAttività) {
		this.idAttività = idAttività;
	}

	
	
}