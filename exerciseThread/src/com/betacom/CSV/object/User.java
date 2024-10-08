package com.betacom.CSV.object;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class User {

	private String nome;
	private String cognome;
	private Boolean  sesso;
	private Date dataNascita;
	
	
	
	
	


	public User(String nome, String cognome, Boolean sesso, Date dataNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.dataNascita = dataNascita;
	}





	


	public String getNome() {
		return nome;
	}








	public void setNome(String nome) {
		this.nome = nome;
	}








	public String getCognome() {
		return cognome;
	}








	public void setCognome(String cognome) {
		this.cognome = cognome;
	}








	public Boolean getSesso() {
		return sesso;
	}








	public void setSesso(Boolean sesso) {
		this.sesso = sesso;
	}








	public Date getDataNascita() {
		return dataNascita;
	}








	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}








	@Override
	public String toString() {
		return "User [nome=" + nome + ", cognome=" + cognome + ", sesso=" + sesso + ", dataNascita=" + dataNascita
				+ "]";
	}











	

}

 



