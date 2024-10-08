package com.betacom.projectJpaCar.dto;

public class BiciDto extends VeicoloDto{
 private Integer id;
 private Integer idVeicolo;
 private Boolean pieghevole;
 private Boolean assistita;
 private Integer idAmmortizzarore;
 
 
 
public BiciDto() {
	super();
}


public BiciDto(Integer id, Integer idVeicolo, Boolean pieghevole, Boolean assistita, Integer idAmmortizzarore) {
	super();
	this.id = id;
	this.idVeicolo = idVeicolo;
	this.pieghevole = pieghevole;
	this.assistita = assistita;
	this.idAmmortizzarore = idAmmortizzarore;
}


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getIdVeicolo() {
	return idVeicolo;
}
public void setIdVeicolo(Integer idVeicolo) {
	this.idVeicolo = idVeicolo;
}
public Boolean getPieghevole() {
	return pieghevole;
}
public void setPieghevole(Boolean pieghevole) {
	this.pieghevole = pieghevole;
}
public Boolean getAssistita() {
	return assistita;
}
public void setAssistita(Boolean assistita) {
	this.assistita = assistita;
}
public Integer getIdAmmortizzarore() {
	return idAmmortizzarore;
}
public void setIdAmmortizzarore(Integer idAmmortizzarore) {
	this.idAmmortizzarore = idAmmortizzarore;
}
 
 
 
}
