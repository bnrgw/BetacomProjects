package com.betacom.jpa.response;

import java.util.List;

import com.betacom.jpa.pojo.Socio;

public class Response<T> extends ResponseBase{
	private List<T> dati;

	public List<T> getDati() {
		return dati;
	}

	public void setDati(List<T> dati) {
		this.dati = dati;
	}

	
}
