package com.betacom.projectJpaCar.dto;

import java.util.List;

import com.betacom.projectJpaCar.pojo.Veicolo;

public class MarcaDto {

	private Integer id;
	private String descrione;
	private List<Veicolo> veicoli;
	
	
	public MarcaDto(Integer id, String descrione, List<Veicolo> veicoli) {
		super();
		this.id = id;
		this.descrione = descrione;
		this.veicoli = veicoli;
	}
	
	public MarcaDto() {
		super();
	}

	
	@Override
	public String toString() {
		return "MarcaDto [id=" + id + ", descrione=" + descrione + ", veicoli=" + veicoli + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescrione() {
		return descrione;
	}
	public void setDescrione(String descrione) {
		this.descrione = descrione;
	}
	public List<Veicolo> getVeicoli() {
		return veicoli;
	}
	public void setVeicoli(List<Veicolo> veicoli) {
		this.veicoli = veicoli;
	}
	
	
}
