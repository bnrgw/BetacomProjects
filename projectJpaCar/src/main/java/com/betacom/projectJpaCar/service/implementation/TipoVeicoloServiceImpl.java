package com.betacom.projectJpaCar.service.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.projectJpaCar.dto.TipoVeicoloDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.TipoVeicolo;
import com.betacom.projectJpaCar.repository.ITipoVeicoloRepository;
import com.betacom.projectJpaCar.repository.IVeicoloRepository;
import com.betacom.projectJpaCar.service.interfaces.iTipoVeicoloService;

@Service
public class TipoVeicoloServiceImpl implements iTipoVeicoloService {

	@Autowired
	ITipoVeicoloRepository tVeicoloR;
	
	@Autowired
	IVeicoloRepository veicoloR;
	
	public static Logger log = LoggerFactory.getLogger(TipoVeicoloServiceImpl.class);
	
	@Override
	public Integer create(TipoVeicoloDto tV) throws AcademyException {
		
		Optional<TipoVeicolo> ve = tVeicoloR.findById(tV.getId());
		if(!ve.isEmpty()) {
			throw new AcademyException(" Tipo Veicolo gia presente");
		}
		
		TipoVeicolo input = new TipoVeicolo();
		input.setId(tV.getId());
		input.setDescrizione(tV.getDescrizione());
		//input.setVeicoli(tV.getVeicoli());
		
		return tVeicoloR.save(input).getId();
	
	}

}
