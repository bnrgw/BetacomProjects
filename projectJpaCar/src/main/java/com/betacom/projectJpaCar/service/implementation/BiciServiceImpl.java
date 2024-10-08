package com.betacom.projectJpaCar.service.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.projectJpaCar.dto.BiciDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.Ammortizzatore;
import com.betacom.projectJpaCar.pojo.Bici;
import com.betacom.projectJpaCar.pojo.Macchina;
import com.betacom.projectJpaCar.pojo.Veicolo;
import com.betacom.projectJpaCar.repository.IAmmortizatoreRepository;
import com.betacom.projectJpaCar.repository.IBiciRepository;
import com.betacom.projectJpaCar.repository.IVeicoloRepository;
import com.betacom.projectJpaCar.service.interfaces.iBiciService;
import com.betacom.projectJpaCar.service.interfaces.iVeicoloService;

@Service
public class BiciServiceImpl implements iBiciService {

	public static Logger log = LoggerFactory.getLogger(BiciServiceImpl.class);
	@Autowired
	IBiciRepository biciR;
	@Autowired
	iVeicoloService veicoloS;
	@Autowired
	IAmmortizatoreRepository ammoR;
	@Autowired
	IVeicoloRepository veicoloR;

	@Override
	public void create(BiciDto bici) throws AcademyException {

		Bici input = new Bici();
		input.setAssistita(bici.getAssistita());
		input.setPieghevole(bici.getPieghevole());
		Optional<Ammortizzatore> amm = ammoR.findById(bici.getIdAmmortizzarore());
		if(amm.isEmpty()) {
			throw new AcademyException("Errore in Creazione Bici: Ammortizzatore non esiste");
		}
		input.setAmmortizzatore(amm.get());
		
		Integer IdBici = biciR.save(input).getId();
		veicoloS.create(bici, IdBici);

	}

	@Override
	public void delete(Integer id) throws AcademyException {
	
		Optional<Bici> mac = biciR.findById(id);
		if(mac.isEmpty()) {
			throw new AcademyException("Bici con id: " + id + " non esistente");
		}
		
		Veicolo v =veicoloR.findByBici_id(id);
		veicoloS.delete(v.getId());
		biciR.delete(mac.get());
		
	}
	
	

}
