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
@Table(name="Veicolo")
public class Veicolo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(
			name = "macchina_id",
			referencedColumnName= "id",
			nullable = true
			)
	private Macchina macchina;
	
	@OneToOne
	@JoinColumn(
			name = "moto_id",
			referencedColumnName= "id",
			nullable = true
			)
	private Moto moto;
	
	@OneToOne
	@JoinColumn(
			name = "bic_id",
			referencedColumnName= "id",
			nullable = true
			)
	private Bici bici;
	
	
	@ManyToOne
	@JoinColumn(
			name = "id_code_colore",
			referencedColumnName= "id"
			)
	private Colore colore;
	

	@ManyToOne
	@JoinColumn(
			name = "id_code_marca",
			referencedColumnName= "id"
			)
	private Marca marca;
	

	@ManyToOne
	@JoinColumn(
			name = "id_tipo_alimentazione",
			referencedColumnName= "id"
			)
	private TipoAlimentazione tipo_alimentazione;
	
	@ManyToOne
	@JoinColumn(
			name = "id_tipo_veicolo",
			referencedColumnName= "id"
			)
	private TipoVeicolo tipo_veicolo;
	
	
	@Column
	private Integer numero_ruote;
	
	@Column
	private Integer numero_posti;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Macchina getMacchina() {
		return macchina;
	}

	public void setMacchina(Macchina macchina) {
		this.macchina = macchina;
	}

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	public Bici getBici() {
		return bici;
	}

	public void setBici(Bici bici) {
		this.bici = bici;
	}

	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public TipoAlimentazione getTipo_alimentazione() {
		return tipo_alimentazione;
	}

	public void setTipo_alimentazione(TipoAlimentazione tipo_alimentazione) {
		this.tipo_alimentazione = tipo_alimentazione;
	}

	public TipoVeicolo getTipo_veicolo() {
		return tipo_veicolo;
	}

	public void setTipo_veicolo(TipoVeicolo tipo_veicolo) {
		this.tipo_veicolo = tipo_veicolo;
	}

	public Integer getNumero_ruote() {
		return numero_ruote;
	}

	public void setNumero_ruote(Integer numero_ruote) {
		this.numero_ruote = numero_ruote;
	}

	public Integer getNumero_posti() {
		return numero_posti;
	}

	public void setNumero_posti(Integer numero_posti) {
		this.numero_posti = numero_posti;
	}

	@Override
	public String toString() {
		return "Veicolo [id=" + id + ", macchina=" + macchina + ", moto=" + moto + ", bici=" + bici + ", colore="
				+ colore + ", marca=" + marca + ", tipo_alimentazione=" + tipo_alimentazione + ", tipo_veicolo="
				+ tipo_veicolo + ", numero_ruote=" + numero_ruote + ", numero_posti=" + numero_posti + "]";
	}
	
	
	
}
