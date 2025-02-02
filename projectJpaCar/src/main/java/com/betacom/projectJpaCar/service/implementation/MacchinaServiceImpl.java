package com.betacom.projectJpaCar.service.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.projectJpaCar.dto.MacchinaDto;
import com.betacom.projectJpaCar.dto.VeicoloDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.Macchina;
import com.betacom.projectJpaCar.pojo.Veicolo;
import com.betacom.projectJpaCar.repository.IMacchinaRepository;
import com.betacom.projectJpaCar.repository.IVeicoloRepository;
import com.betacom.projectJpaCar.service.interfaces.iMacchinaService;
import com.betacom.projectJpaCar.service.interfaces.iVeicoloService;

import jakarta.transaction.Transactional;

@Service
public class MacchinaServiceImpl implements iMacchinaService {

	public static Logger log = LoggerFactory.getLogger(MacchinaServiceImpl.class);
	@Autowired
	IMacchinaRepository macchinaR;
	@Autowired
	iVeicoloService veicoloS;
	
	@Autowired
	IVeicoloRepository veicoloR;

	
	@Override
	@Transactional(rollbackOn=Exception.class)
	public void create(MacchinaDto macchina) throws AcademyException {

		Macchina input = macchina.getId() != null ? macchinaR.findById(macchina.getId()).get() : new Macchina();
		input.setCilindrata(macchina.getCilindrata());
		input.setNumero_porte(macchina.getNumero_porte());
		input.setTarga(macchina.getTarga());

		if(macchina.getId() != null) {
			input.setId(macchina.getId());
			macchina.setIdVeicolo(input.getVeicolo().getId());
		}
		
		Integer IdMacchina = macchinaR.save(input).getId();
		
		//
		veicoloS.create(macchina, IdMacchina);

	}

	@Override
	public void delete(Integer id) throws AcademyException {
		Optional<Macchina> mac = macchinaR.findById(id);
		if(mac.isEmpty()) {
			throw new AcademyException("Macchina con id: " + id + " non esistente");
		}
		
		Veicolo v =veicoloR.findByMacchina_id(id);
		veicoloS.delete(v.getId());
		macchinaR.delete(mac.get());
	}

	@Override
	public void update(MacchinaDto macchina) throws AcademyException {
		//MacchinaDto macchina = (MacchinaDto)veicolo;
		Optional<Macchina> mac = macchinaR.findById(macchina.getId());
		if(mac.isEmpty()) {
			throw new AcademyException("Macchina con id: " + macchina.getId() + " non esistente");
		}
		macchina.setIdVeicolo(mac.get().getVeicolo().getId());
		veicoloS.update(macchina);
		
		mac.get().setId(macchina.getId());
		mac.get().setCilindrata(macchina.getCilindrata());
		mac.get().setTarga(macchina.getTarga());
		macchinaR.save(mac.get());
	}
	
	

}
