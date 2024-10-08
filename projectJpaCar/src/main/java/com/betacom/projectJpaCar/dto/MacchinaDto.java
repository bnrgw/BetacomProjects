package com.betacom.projectJpaCar.dto;

public class MacchinaDto extends VeicoloDto {

	private Integer id;
	private Integer idVeicolo;
	private  Integer numero_porte;
	private String targa;
	private Integer cilindrata;
	
	
	public MacchinaDto() {
		super();
	}
	
	
	public MacchinaDto(Integer id, Integer idVeicolo, Integer numero_porte, String targa, Integer cilindrata) {
		super();
		this.id = id;
		this.idVeicolo = idVeicolo;
		this.numero_porte = numero_porte;
		this.targa = targa;
		this.cilindrata = cilindrata;
	}


	@Override
	public String toString() {
		return "MacchinaDto [id=" + id + ", idVeicolo=" + idVeicolo + ", numero_porte=" + numero_porte + ", targa="
				+ targa + ", cilindrata=" + cilindrata + "]";
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
	public Integer getNumero_porte() {
		return numero_porte;
	}
	public void setNumero_porte(Integer numero_porte) {
		this.numero_porte = numero_porte;
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
