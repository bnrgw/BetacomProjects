package com.betacom.projectJpaCar.dto;

import java.util.List;

import com.betacom.projectJpaCar.pojo.Veicolo;

public class TipoAlimentazioneDto {

	private Integer id;
	private  String descrizione;
	private List<Veicolo> veicoli;
	
	
	public TipoAlimentazioneDto() {
		super();
	}
	
	
	public TipoAlimentazioneDto(Integer id, String descrizione, List<Veicolo> veicoli) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.veicoli = veicoli;
	}

	

	@Override
	public String toString() {
		return "ColoreDto [id=" + id + ", descrizione=" + descrizione + ", veicoli=" + veicoli + "]";
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public List<Veicolo> getVeicoli() {
		return veicoli;
	}
	public void setVeicoli(List<Veicolo> veicoli) {
		this.veicoli = veicoli;
	}
	
}
