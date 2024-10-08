package com.betacom.projectJpaCar.pojo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="macchina")
public class Macchina {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(mappedBy = "macchina")
	private  Veicolo veicolo;
	
	@Column(nullable = false)
	private Integer numero_porte;
	
	@Column(length =7,nullable = false,unique = true)
	private String targa;
	
	@Column(nullable = false)
	private Integer cilindrata;

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
