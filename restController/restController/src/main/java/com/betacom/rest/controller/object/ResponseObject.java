package com.betacom.rest.controller.object;

public class ResponseObject <T>{
 public boolean rc;
 public String message;
 public T dati;
public boolean isRc() {
	return rc;
}
public void setRc(boolean rc) {
	this.rc = rc;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public T getDati() {
	return dati;
}
public void setDati(T dati) {
	this.dati = dati;
}
  
 
}
