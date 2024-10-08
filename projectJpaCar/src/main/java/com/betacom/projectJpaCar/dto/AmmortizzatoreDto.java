package com.betacom.projectJpaCar.dto;

import java.util.List;

import com.betacom.projectJpaCar.pojo.Bici;

public class AmmortizzatoreDto {

	private Integer id;
	private String descrizione;
	private List<Bici> bici;
	
	
	public AmmortizzatoreDto() {
		super();
	}
	
	
	public AmmortizzatoreDto(Integer id, String descrizione, List<Bici> bici) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.bici = bici;
	}


	@Override
	public String toString() {
		return "AmmortizzatoreDto [id=" + id + ", descrizione=" + descrizione + ", bici=" + bici + "]";
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
	public List<Bici> getBici() {
		return bici;
	}
	public void setBici(List<Bici> bici) {
		this.bici = bici;
	}
	
	
}
