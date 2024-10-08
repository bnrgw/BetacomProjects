package com.betacom.projectJpaCar.dto;

public class VeicoloDto {

	private Integer id;
	private Integer idMacchina;
	private Integer idMoto;
	private Integer IdBici;
	private Integer idMarca;
	private Integer idTipoVeicolo;
	private Integer idTipoAlimentazione;
	private Integer idColore;
	private Integer numeroPosti;
	private Integer numeroRuote;
	
	
	
	public VeicoloDto() {
		super();
	}
	
	
	public VeicoloDto(Integer id, Integer idMacchina, Integer idMoto, Integer idBici, Integer idMarca,
			Integer idTipoVeicolo, Integer idTipoAlimentazione, Integer idColore, Integer numeroPosti,
			Integer numeroRuote) {
		super();
		this.id = id;
		this.idMacchina = idMacchina;
		this.idMoto = idMoto;
		IdBici = idBici;
		this.idMarca = idMarca;
		this.idTipoVeicolo = idTipoVeicolo;
		this.idTipoAlimentazione = idTipoAlimentazione;
		this.idColore = idColore;
		this.numeroPosti = numeroPosti;
		this.numeroRuote = numeroRuote;
	}

	
	

	@Override
	public String toString() {
		return "VeicoloDto [id=" + id + ", idMacchina=" + idMacchina + ", idMoto=" + idMoto + ", IdBici=" + IdBici
				+ ", idMarca=" + idMarca + ", idTipoVeicolo=" + idTipoVeicolo + ", idTipoAlimentazione="
				+ idTipoAlimentazione + ", idColore=" + idColore + ", numeroPosti=" + numeroPosti + ", numeroRuote="
				+ numeroRuote + "]";
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdMacchina() {
		return idMacchina;
	}
	public void setIdMacchina(Integer idMacchina) {
		this.idMacchina = idMacchina;
	}
	public Integer getIdMoto() {
		return idMoto;
	}
	public void setIdMoto(Integer idMoto) {
		this.idMoto = idMoto;
	}
	public Integer getIdBici() {
		return IdBici;
	}
	public void setIdBici(Integer idBici) {
		IdBici = idBici;
	}
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public Integer getIdTipoVeicolo() {
		return idTipoVeicolo;
	}
	public void setIdTipoVeicolo(Integer idTipoVeicolo) {
		this.idTipoVeicolo = idTipoVeicolo;
	}
	public Integer getIdTipoAlimentazione() {
		return idTipoAlimentazione;
	}
	public void setIdTipoAlimentazione(Integer idTipoAlimentazione) {
		this.idTipoAlimentazione = idTipoAlimentazione;
	}
	public Integer getIdColore() {
		return idColore;
	}
	public void setIdColore(Integer idColore) {
		this.idColore = idColore;
	}
	public Integer getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(Integer numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	public Integer getNumeroRuote() {
		return numeroRuote;
	}
	public void setNumeroRuote(Integer numeroRuote) {
		this.numeroRuote = numeroRuote;
	}
	
	
	
}
