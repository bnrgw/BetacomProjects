package com.betacom.car.oggetti;

public class Moto extends Veicolo{
   private String targa;
   private Integer cc;//cilindrata
   
   public Moto(String targa, Integer cc) {
	   super();
	   this.targa= targa;
	   this.cc = cc;
   }
   
   public Moto() {}

public String getTarga() {
	return targa;
}

public void setTarga(String targa) {
	this.targa = targa;
}

public Integer getCc() {
	return cc;
}

public void setCc(Integer cc) {
	this.cc = cc;
}
   
   
}
