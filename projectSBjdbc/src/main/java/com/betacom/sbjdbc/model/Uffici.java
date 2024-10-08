package com.betacom.sbjdbc.model;

public class Uffici {
 private Integer id_Ufficcio;
 private String nome_Ufficio;
 
 
public Uffici() {
	super();
}

public Uffici(Integer id_Ufficcio, String nome_Ufficio) {
	super();
	this.id_Ufficcio = id_Ufficcio;
	this.nome_Ufficio = nome_Ufficio;
}



@Override
public String toString() {
	return "Uffici [id_Ufficcio=" + id_Ufficcio + ", nome_Ufficio=" + nome_Ufficio + "]";
}

public Integer getId_Ufficcio() {
	return id_Ufficcio;
}
public void setId_Ufficcio(Integer id_Ufficcio) {
	this.id_Ufficcio = id_Ufficcio;
}
public String getNome_Ufficio() {
	return nome_Ufficio;
}
public void setNome_Ufficio(String nome_Ufficio) {
	this.nome_Ufficio = nome_Ufficio;
}
 

 
}
