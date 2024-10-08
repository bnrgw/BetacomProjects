package com.betacom.projectJpaCar.pojo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ammortizzatore")
public class Ammortizzatore {

	@Id
	private Integer id;
	
	@Column(length = 20, nullable= false)
	private String descrizione;
	
	@OneToMany(
			mappedBy = "ammortizzatore",
			fetch = FetchType.EAGER
			)
	private List<Bici> bici;
	
	

	public Ammortizzatore() {
		super();
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

	@Override
	public String toString() {
		return "Ammortizzatore [id=" + id + ", descrizione=" + descrizione + ", bici=" + bici + "]";
	}
	
	
	
}
