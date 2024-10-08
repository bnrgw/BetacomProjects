package com.betacom.projectJpaCar.dto;

public class MotoDto extends VeicoloDto {

	private Integer id;
	private Integer idVeicolo;
	private String targa;
	private Integer cilindrata;
	
	
	public MotoDto() {
		super();
	}
	
	
	public MotoDto(Integer id, Integer idVeicolo, String targa, Integer cilindrata) {
		super();
		this.id = id;
		this.idVeicolo = idVeicolo;
		this.targa = targa;
		this.cilindrata = cilindrata;
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
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Integer getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
}
