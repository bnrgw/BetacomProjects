package com.betacom.projectJpaCar.pojo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tipo_veicolo")
public class TipoVeicolo {

	@Id
	private Integer id;
	
	@OneToMany(
			mappedBy = "tipo_veicolo",
			fetch = FetchType.EAGER
			)
	private List<Veicolo> veicoli;
	
	@Column(length = 20)
	private String descrizione;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Veicolo> getVeicoli() {
		return veicoli;
	}

	public void setVeicoli(List<Veicolo> veicoli) {
		this.veicoli = veicoli;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
