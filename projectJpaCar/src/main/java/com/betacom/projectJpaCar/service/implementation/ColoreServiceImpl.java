package com.betacom.projectJpaCar.service.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.betacom.projectJpaCar.dto.ColoreDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.Colore;
import com.betacom.projectJpaCar.repository.IColoreRepository;
import com.betacom.projectJpaCar.service.interfaces.iColoreService;


@Service
public class ColoreServiceImpl implements iColoreService{

	public static Logger log = LoggerFactory.getLogger(ColoreServiceImpl.class);
	

	@Autowired
	IColoreRepository coloR;
	
	@Override
	public Integer create(ColoreDto color) throws AcademyException {
		
		Optional<Colore> col = coloR.findById(color.getId());
		if(!col.isEmpty()) {
			throw new AcademyException(" Tipo Veicolo gia presente");
		}
		
		Colore input = new Colore();
	input.setId(color.getId());
	input.setDescrizione(color.getDescrizione());
	
	return coloR.save(input).getId();
	}

	

	

}
