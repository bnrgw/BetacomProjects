package com.betacom.projectJpaCar.service.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.projectJpaCar.dto.TipoAlimentazioneDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.TipoAlimentazione;
import com.betacom.projectJpaCar.repository.ITipoAlimentazioneRepository;
import com.betacom.projectJpaCar.service.interfaces.iTipoAlimentazioneService;

@Service
public class TipoAlimentazioneServiceImpl implements iTipoAlimentazioneService{

	public static Logger log = LoggerFactory.getLogger(TipoAlimentazioneServiceImpl.class);
	

	@Autowired
	ITipoAlimentazioneRepository tAliR;
	
	@Override
	public Integer create(TipoAlimentazioneDto ali) throws AcademyException {
		
		Optional<TipoAlimentazione> tAli = tAliR.findById(ali.getId());
		if(!tAli.isEmpty()) {
			throw new AcademyException(" Tipo Veicolo gia presente");
		}
		
	TipoAlimentazione input = new TipoAlimentazione();
	input.setId(ali.getId());
	input.setDescrizione(ali.getDescrizione());
	
	return tAliR.save(input).getId();
	}


}
