package com.betacom.sql.dao;

import java.math.BigDecimal;
import java.util.Date;

public class Dipendenti {
  private Integer idUser;
  private String nome;
  private String cognome;
  private Date dataAssunzione;
  private String telefono;
  private String mansione;
  private BigDecimal stipendio;
  private Integer idUffucio;
  
  
  
public Dipendenti(Integer idUser, String nome, String cognome, Date dataAssunzione, String telefono, String mansione,
		BigDecimal stipendio, Integer idUffucio) {
	super();
	this.idUser = idUser;
	this.nome = nome;
	this.cognome = cognome;
	this.dataAssunzione = dataAssunzione;
	this.telefono = telefono;
	this.mansione = mansione;
	this.stipendio = stipendio;
	this.idUffucio = idUffucio;
}


public Dipendenti() {
	super();
}


@Override
public String toString() {
	return "Dipendenti [idUser=" + idUser + ", nome=" + nome + ", cognome=" + cognome + ", dataAssunzione="
			+ dataAssunzione + ", telefono=" + telefono + ", mansione=" + mansione + ", stipendio=" + stipendio
			+ ", idUffucio=" + idUffucio + "]";
}
public Integer getIdUser() {
	return idUser;
}
public void setIdUser(Integer idUser) {
	this.idUser = idUser;
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
public Date getDataAssunzione() {
	return dataAssunzione;
}
public void setDataAssunzione(Date dataAssunzione) {
	this.dataAssunzione = dataAssunzione;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getMansione() {
	return mansione;
}
public void setMansione(String mansione) {
	this.mansione = mansione;
}
public BigDecimal getStipendio() {
	return stipendio;
}
public void setStipendio(BigDecimal stipendio) {
	this.stipendio = stipendio;
}
public Integer getIdUffucio() {
	return idUffucio;
}
public void setIdUffucio(Integer idUffucio) {
	this.idUffucio = idUffucio;
}
  
  
}
