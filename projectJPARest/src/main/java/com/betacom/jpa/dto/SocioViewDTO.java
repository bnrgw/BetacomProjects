package com.betacom.jpa.dto;


public class SocioViewDTO {
	private Integer id;
	private String cognome;
	private String nome;
	private String cFiscale;
	
	
	
	public SocioViewDTO() {
		super();
	}
	public SocioViewDTO(Integer id, String cognome, String nome, String cFiscale) {
		super();
		this.id = id;
		this.cognome = cognome;
		this.nome = nome;
		this.cFiscale = cFiscale;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getcFiscale() {
		return cFiscale;
	}
	public void setcFiscale(String cFiscale) {
		this.cFiscale = cFiscale;
	}


}
