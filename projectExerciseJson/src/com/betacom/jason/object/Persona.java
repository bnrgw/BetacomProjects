package com.betacom.json.object;

import java.security.KeyStore.PrivateKeyEntry;

public class Persona {
	
	private String nome;
	private String cognome;
	private Data nascita;
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
	public Data getNascita() {
		return nascita;
	}
	public void setNascita(Data nascita) {
		this.nascita = nascita;
	}
	public Persona(String nome, String cognome, Data nascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
	}

	@Override
	public String toString() {
		return "Person [nome=" + nome + ", cognome=" + cognome + ", nascita=" + nascita + "]";
	}
	
}
