package com.betacom.car.oggetti;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public abstract class Veicolo {
 @Override
	public String toString() {
		return "Veicolo [numeroRuote=" + numeroRuote + ", velocità=" + velocità + ", tipoAlimentazione="
				+ tipoAlimentazione + ", dataCreazione=" + dataCreazione + ", dataDopoUnMese=" + dataDopoUnMese
				+ ", id=" + id + ", tipoVeicolo=" + tipoVeicolo + "]";
	}
private Integer numeroRuote;
 private Integer velocità;
 private String tipoAlimentazione;//benzina,gas,gasolio,elettrica,manuale
 private Date  dataCreazione;
 private Date  dataDopoUnMese;
 
 public Date getDataDopoUnMese() {
	return dataDopoUnMese;
}
public void setDataDopoUnMese(Date dataDopoUnMese) {
	
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(dataDopoUnMese);
	calendar.add(Calendar.MONTH, 1);
	 
	this.dataDopoUnMese = calendar.getTime();
}
private Integer id;
 private String tipoVeicolo;
 
 public String getTipoVeicolo() {
	return tipoVeicolo;
}
public void setTipoVeicolo(String tipoVeicolo) {
	this.tipoVeicolo = tipoVeicolo;
}
public static  Integer numeroMacchina = 0;
 
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Date getDataCreazione() {
	return dataCreazione;
}
public void setDataCreazione(Date dataCreazione) {
	this.dataCreazione = dataCreazione;
}
public Integer getNumeroRuote() {
	return numeroRuote;
}
public void setNumeroRuote(Integer numeroRuote) {
	this.numeroRuote = numeroRuote;
}
public Integer getVelocità() {
	return velocità;
}
public void setVelocità(Integer velocità) {
	this.velocità = velocità;
}
public String getTipoAlimentazione() {
	return tipoAlimentazione;
}
public void setTipoAlimentazione(String tipoAlimentazione) {
	this.tipoAlimentazione = tipoAlimentazione;
}
 
 
 

}
