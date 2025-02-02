package com.betacom.projectJpaCar.service.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.projectJpaCar.dto.BiciDto;
import com.betacom.projectJpaCar.dto.MacchinaDto;
import com.betacom.projectJpaCar.dto.MotoDto;
import com.betacom.projectJpaCar.dto.VeicoloDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.Bici;
import com.betacom.projectJpaCar.pojo.Colore;
import com.betacom.projectJpaCar.pojo.Macchina;
import com.betacom.projectJpaCar.pojo.Marca;
import com.betacom.projectJpaCar.pojo.Moto;
import com.betacom.projectJpaCar.pojo.TipoAlimentazione;
import com.betacom.projectJpaCar.pojo.TipoVeicolo;
import com.betacom.projectJpaCar.pojo.Veicolo;
import com.betacom.projectJpaCar.repository.IBiciRepository;
import com.betacom.projectJpaCar.repository.IColoreRepository;
import com.betacom.projectJpaCar.repository.IMacchinaRepository;
import com.betacom.projectJpaCar.repository.IMarcaRepository;
import com.betacom.projectJpaCar.repository.IMotoRepository;
import com.betacom.projectJpaCar.repository.ITipoAlimentazioneRepository;
import com.betacom.projectJpaCar.repository.ITipoVeicoloRepository;
import com.betacom.projectJpaCar.repository.IVeicoloRepository;
import com.betacom.projectJpaCar.service.interfaces.iMacchinaService;
import com.betacom.projectJpaCar.service.interfaces.iVeicoloService;

@Service
public class VeicoloServiceImpl implements iVeicoloService {

	public static Logger log = LoggerFactory.getLogger(VeicoloServiceImpl.class);
	@Autowired
	IVeicoloRepository veicoloR;
	
	
	@Autowired
	IMacchinaRepository macchinaR;
	@Autowired
	IColoreRepository coloR;
	@Autowired
	IMarcaRepository marcaR;
	@Autowired
	ITipoAlimentazioneRepository tAliR;
	@Autowired
	ITipoVeicoloRepository tVeicoloR;
	@Autowired
	IBiciRepository biciR;
	@Autowired
	IMotoRepository motoR;
	
	
	

	@Override
	public void create(VeicoloDto veicolo, Integer id) throws AcademyException {
	 
		Veicolo input = createVeicoloParameters(veicolo);
		
		if(veicolo instanceof BiciDto) {
			Optional<Bici> bici = biciR.findById(id);
			if (bici.isEmpty()) {
				throw new AcademyException("Errore in inserimento Bici");
			}
			input.setBici(bici.get());
		}
		
		else if(veicolo instanceof MacchinaDto ) {
			Optional<Macchina> mac = macchinaR.findById(id);
			if (mac.isEmpty()) {
				throw new AcademyException("Errore in inserimento Macchina");
			}
			input.setMacchina(mac.get());
		}
		else if(veicolo instanceof MotoDto) {
			Optional<Moto> moto = motoR.findById(id);
			if (moto.isEmpty()) {
				throw new AcademyException("Errore in inserimento Macchina");
			}
			input.setMoto(moto.get());
		}
		
		if (veicolo.getId() != null) {
			input.setId(veicolo.getId());
		}
		veicoloR.save(input);
	}

	

@Override
public void update(VeicoloDto veicolo) throws AcademyException {

	Veicolo ve  =updateVeicoloParameters((VeicoloDto) veicolo);
	veicoloR.save(ve);
	
	if(veicolo instanceof MacchinaDto) {
		MacchinaDto macchina = (MacchinaDto)veicolo;
		Macchina mac =updateMacchinaParameters(macchina);
		
		macchinaR.save(mac);
	}
}



@Override
public void delete(Integer idVeicolo)  {

	 veicoloR.deleteById(idVeicolo);
   
}

private Macchina updateMacchinaParameters(MacchinaDto macchina) throws AcademyException{
	Optional<Macchina> mac = macchinaR.findById(macchina.getId());
	 if(mac.isEmpty()) {
		 throw new AcademyException("Macchina non esistente nel database");
	 }
	 mac.get().setCilindrata(macchina.getCilindrata());
	 mac.get().setTarga(macchina.getTarga());
	 
	 return mac.get();
}

private Veicolo createVeicoloParameters(VeicoloDto veicolo) {
	Veicolo input = new Veicolo();
	
	Optional<Colore> col = (coloR.findById(veicolo.getIdColore()));
	input.setColore(col.get());
	Optional<Marca> marca = (marcaR.findById(veicolo.getIdMarca()));
	input.setMarca(marca.get());
	Optional<TipoAlimentazione> tAli = (tAliR.findById(veicolo.getIdTipoAlimentazione()));
	input.setTipo_alimentazione(tAli.get());
	Optional<TipoVeicolo> tVeicolo = (tVeicoloR.findById(veicolo.getIdTipoVeicolo()));
	input.setTipo_veicolo(tVeicolo.get());
	input.setNumero_posti(veicolo.getNumeroPosti());
	input.setNumero_ruote(veicolo.getNumeroRuote());
	
	return input;
}

private Veicolo updateVeicoloParameters(VeicoloDto veicolo)throws AcademyException {
 Optional<Veicolo> ve = veicoloR.findById(veicolo.getId());
 if(ve.isEmpty()) {
	 throw new AcademyException("Veicolo non esistente nel database");
 }
 Optional<Colore> col = (coloR.findById(veicolo.getIdColore()));
	ve.get().setColore(col.get());
	Optional<Marca> marca = (marcaR.findById(veicolo.getIdMarca()));
	ve.get().setMarca(marca.get());
	Optional<TipoAlimentazione> tAli = (tAliR.findById(veicolo.getIdTipoAlimentazione()));
	ve.get().setTipo_alimentazione(tAli.get());
	Optional<TipoVeicolo> tVeicolo = (tVeicoloR.findById(veicolo.getIdTipoVeicolo()));
	ve.get().setTipo_veicolo(tVeicolo.get());
	ve.get().setNumero_posti(veicolo.getNumeroPosti());
	ve.get().setNumero_ruote(veicolo.getNumeroRuote());
	
	return ve.get();
}








}
