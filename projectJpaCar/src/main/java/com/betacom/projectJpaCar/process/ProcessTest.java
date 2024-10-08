package com.betacom.projectJpaCar.process;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.projectJpaCar.dto.AmmortizzatoreDto;
import com.betacom.projectJpaCar.dto.BiciDto;
import com.betacom.projectJpaCar.dto.ColoreDto;
import com.betacom.projectJpaCar.dto.MacchinaDto;
import com.betacom.projectJpaCar.dto.MarcaDto;
import com.betacom.projectJpaCar.dto.MotoDto;
import com.betacom.projectJpaCar.dto.TipoAlimentazioneDto;
import com.betacom.projectJpaCar.dto.TipoVeicoloDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.Ammortizzatore;
import com.betacom.projectJpaCar.service.implementation.AmmortizatoreServiceImpl;
import com.betacom.projectJpaCar.service.implementation.TipoAlimentazioneServiceImpl;
import com.betacom.projectJpaCar.service.interfaces.iAmmortizzatoreService;
import com.betacom.projectJpaCar.service.interfaces.iBiciService;
import com.betacom.projectJpaCar.service.interfaces.iColoreService;
import com.betacom.projectJpaCar.service.interfaces.iMacchinaService;
import com.betacom.projectJpaCar.service.interfaces.iMarcaService;
import com.betacom.projectJpaCar.service.interfaces.iMotoService;
import com.betacom.projectJpaCar.service.interfaces.iTipoAlimentazioneService;
import com.betacom.projectJpaCar.service.interfaces.iTipoVeicoloService;
import com.betacom.projectJpaCar.service.interfaces.iVeicoloService;

@Service
public class ProcessTest {
	@Autowired
	iTipoVeicoloService tVeicoloS;

	@Autowired
	iTipoAlimentazioneService tAlimentazioneS;

	@Autowired
	iAmmortizzatoreService tAmmorS;

	@Autowired
	iColoreService colorS;

	@Autowired
	iMarcaService marcaS;

	@Autowired
	iMacchinaService macchinaS;

	@Autowired
	iBiciService biciS;
	
	@Autowired
	iMotoService motoS;
	
	@Autowired
	iVeicoloService veicoloS;

	private List<Integer> tipoVeicoloList = new ArrayList<Integer>();
	private List<Integer> tipoAlimentazioneList = new ArrayList<Integer>();
	private List<Integer> ammortizzatoreList = new ArrayList<Integer>();
	private List<Integer> coloreList = new ArrayList<Integer>();
	private List<Integer> marcaList = new ArrayList<Integer>();

	public static Logger log = LoggerFactory.getLogger(ProcessTest.class);

	public void execute() {
		
		updateVeicolo();
		//createMacchina();
	
	}

	private void createTipoVeicolo() {
		try {
			TipoVeicoloDto tV = new TipoVeicoloDto();
			tV.setId(1);
			tV.setDescrizione("Fuoristrada");
			tipoVeicoloList.add(tVeicoloS.create(tV));

			tV = new TipoVeicoloDto();
			tV.setId(2);
			tV.setDescrizione("SUV");
			tipoVeicoloList.add(tVeicoloS.create(tV));

			tV = new TipoVeicoloDto();
			tV.setId(3);
			tV.setDescrizione("Cross");
			tipoVeicoloList.add(tVeicoloS.create(tV));

			tV = new TipoVeicoloDto();
			tV.setId(4);
			tV.setDescrizione("Sportiva");
			tipoVeicoloList.add(tVeicoloS.create(tV));

			tV = new TipoVeicoloDto();
			tV.setId(5);
			tV.setDescrizione("City");
			tipoVeicoloList.add(tVeicoloS.create(tV));

			tV = new TipoVeicoloDto();
			tV.setId(6);
			tV.setDescrizione("Scooter");
			tipoVeicoloList.add(tVeicoloS.create(tV));

			tV = new TipoVeicoloDto();
			tV.setId(8);
			tV.setDescrizione("Utilitaria");
			tipoVeicoloList.add(tVeicoloS.create(tV));

		} catch (AcademyException e) {
			log.error("Errore in creazione Tipo Veicolo: " + e.getMessage());
		}
	}

	private void createTipoAlimentazione() {

		try {
			TipoAlimentazioneDto tA = new TipoAlimentazioneDto();
			tA.setId(1);
			tA.setDescrizione("Benzina");
			tipoAlimentazioneList.add(tAlimentazioneS.create(tA));

			tA = new TipoAlimentazioneDto();
			tA.setId(2);
			tA.setDescrizione("Metano");
			tipoAlimentazioneList.add(tAlimentazioneS.create(tA));

			tA = new TipoAlimentazioneDto();
			tA.setId(3);
			tA.setDescrizione("Eletricita");
			tipoAlimentazioneList.add(tAlimentazioneS.create(tA));

			tA = new TipoAlimentazioneDto();
			tA.setId(4);
			tA.setDescrizione("Energia");
			tipoAlimentazioneList.add(tAlimentazioneS.create(tA));

		} catch (AcademyException e) {
			log.error("Errore in creazione Tipo Alimentazione: " + e.getMessage());
		}
	}

	private void createAmmortizzatore() {
		try {
			AmmortizzatoreDto amm = new AmmortizzatoreDto();
			amm.setId(1);
			amm.setDescrizione("160");
			ammortizzatoreList.add(tAmmorS.create(amm));

			amm = new AmmortizzatoreDto();
			amm.setId(2);
			amm.setDescrizione("140");
			ammortizzatoreList.add(tAmmorS.create(amm));

			amm = new AmmortizzatoreDto();
			amm.setId(3);
			amm.setDescrizione("180");
			ammortizzatoreList.add(tAmmorS.create(amm));
		} catch (AcademyException e) {
			log.error("Errore in creazione Ammortizzatore: " + e.getMessage());
		}

	}

	private void createColore() {
		try {
			ColoreDto colore = new ColoreDto();
			colore.setId(1);
			colore.setDescrizione("Nero");
			coloreList.add(colorS.create(colore));

			colore = new ColoreDto();
			colore.setId(2);
			colore.setDescrizione("Bianco");
			coloreList.add(colorS.create(colore));

			colore = new ColoreDto();
			colore.setId(3);
			colore.setDescrizione("Grigio");
			coloreList.add(colorS.create(colore));

			colore = new ColoreDto();
			colore.setId(4);
			colore.setDescrizione("Blu");
			coloreList.add(colorS.create(colore));

			colore = new ColoreDto();
			colore.setId(5);
			colore.setDescrizione("Marrone");
			coloreList.add(colorS.create(colore));

			colore = new ColoreDto();
			colore.setId(6);
			colore.setDescrizione("Rosso");
			coloreList.add(colorS.create(colore));

		} catch (AcademyException e) {
			log.error("Errore in creazione Colore: " + e.getMessage());
		}

	}

	private void createMarca() {
		try {
			MarcaDto marca = new MarcaDto();
			marca.setId(1);
			marca.setDescrione("Fiat");
			marcaList.add(marcaS.create(marca));

			marca = new MarcaDto();
			marca.setId(2);
			marca.setDescrione("BMW");
			marcaList.add(marcaS.create(marca));

			marca = new MarcaDto();
			marca.setId(3);
			marca.setDescrione("Audi");
			marcaList.add(marcaS.create(marca));

			marca = new MarcaDto();
			marca.setId(4);
			marca.setDescrione("Volts vagen");
			marcaList.add(marcaS.create(marca));

			marca = new MarcaDto();
			marca.setId(5);
			marca.setDescrione("Citroen");
			marcaList.add(marcaS.create(marca));

			marca = new MarcaDto();
			marca.setId(6);
			marca.setDescrione("Lancia");
			marcaList.add(marcaS.create(marca));

			marca = new MarcaDto();
			marca.setId(7);
			marca.setDescrione("Renault");
			marcaList.add(marcaS.create(marca));

		} catch (AcademyException e) {
			log.error("Errore in creazione Marca: " + e.getMessage());
		}
	}

	private void createMacchina() {
		try {
			MacchinaDto mac = new MacchinaDto();
			mac.setCilindrata(400);
			mac.setIdColore(3);
			mac.setIdMarca(5);
			mac.setIdTipoAlimentazione(2);
			mac.setIdTipoVeicolo(5);
			mac.setNumero_porte(4);
			mac.setNumeroPosti(5);
			mac.setNumeroRuote(4);
			mac.setTarga("CCFR876");
			macchinaS.create(mac);

		} catch (AcademyException e) {
			log.error("Errore in creazione Macchina: " + e.getMessage());
		}

	}

	private void createBici() {
		try {
			BiciDto bici = new BiciDto();

			bici.setIdColore(2);
			bici.setIdMarca(2);
			bici.setIdTipoAlimentazione(2);
			bici.setIdTipoVeicolo(5);
			bici.setNumeroPosti(1);
			bici.setNumeroRuote(2);
			bici.setAssistita(true);
			bici.setPieghevole(false);
			bici.setIdAmmortizzarore(2);
			biciS.create(bici);

		} catch (AcademyException e) {
			log.error("Errore in creazione Bici: " + e.getMessage());
		}
	}
	
	private void createMoto() {

		try {
			MotoDto moto = new MotoDto();
			
			moto.setIdColore(3);
			moto.setIdMarca(3);
			moto.setIdTipoAlimentazione(3);
			moto.setIdTipoVeicolo(4);
			moto.setNumeroPosti(2);
			moto.setNumeroRuote(3);
			moto.setCilindrata(2);
			moto.setTarga("DFR567");
			motoS.create(moto);
			
		}catch (AcademyException e) {
			log.error("Errore in creazione Moto: " + e.getMessage());
		}
	}
	
	private void deleteMacchina(Integer id) {
		try {
			macchinaS.delete(id);
		} catch (AcademyException e) {
			log.error("Errore in delete Macchina: " + e.getMessage());
			
		}
	}
	
	private void deleteBici(Integer id) {
		try {
			biciS.delete(id);
		} catch (AcademyException e) {
			log.error("Errore in delete Macchina: " + e.getMessage());
			
		}
	}
	
	private void updateMacchina() {
		try {
		MacchinaDto mac = new MacchinaDto();
		mac.setId(5);
		mac.setCilindrata(200);
		mac.setIdColore(3);
		mac.setIdMarca(5);
		mac.setIdTipoAlimentazione(2);
		mac.setIdTipoVeicolo(5);
		mac.setNumero_porte(4);
		mac.setNumeroPosti(5);
		mac.setNumeroRuote(6);
		mac.setTarga("CCFR876");
		macchinaS.update(mac);

	} catch (AcademyException e) {
		log.error("Errore in creazione Macchina: " + e.getMessage());
	}
	
	}
	
	private void updateVeicolo() {
		MacchinaDto mac = new MacchinaDto();
		mac.setId(5);
		mac.setCilindrata(600);
		mac.setIdColore(3);
		mac.setIdMarca(5);
		mac.setIdTipoAlimentazione(2);
		mac.setIdTipoVeicolo(5);
		mac.setNumero_porte(4);
		mac.setNumeroPosti(5);
		mac.setNumeroRuote(6);
		mac.setTarga("CCCCCC");
		try {
			veicoloS.update(mac);
		} catch (AcademyException e) {
			log.error("Errore in update veicolo: " + e.getMessage());
		}
	}
	
}
