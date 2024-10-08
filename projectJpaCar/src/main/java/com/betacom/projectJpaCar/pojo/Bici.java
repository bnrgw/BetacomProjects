package com.betacom.projectJpaCar.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bici")
public class Bici {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(mappedBy = "bici")
	private  Veicolo veicolo;
	
	@Column
	private Boolean pieghevole;
	
	@Column
	private Boolean assistita;
	
	@ManyToOne
	@JoinColumn(
			name = "ammortizzatore",
			referencedColumnName= "id"
			)
	private Ammortizzatore ammortizzatore;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Veicolo getVeicolo() {
		return veicolo;
	}

	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}

	public Boolean getPieghevole() {
		return pieghevole;
	}

	public void setPieghevole(Boolean pieghevole) {
		this.pieghevole = pieghevole;
	}

	public Boolean getAssistita() {
		return assistita;
	}

	public void setAssistita(Boolean assistita) {
		this.assistita = assistita;
	}

	public Ammortizzatore getAmmortizzatore() {
		return ammortizzatore;
	}

	public void setAmmortizzatore(Ammortizzatore ammortizzatore) {
		this.ammortizzatore = ammortizzatore;
	}
	
	
}
