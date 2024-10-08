package com.betacom.projectJpaCar.service.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.betacom.projectJpaCar.dto.MarcaDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.Marca;
import com.betacom.projectJpaCar.repository.IMarcaRepository;
import com.betacom.projectJpaCar.service.interfaces.iMarcaService;


@Service
public class MarcaServiceImpl implements iMarcaService{

	public static Logger log = LoggerFactory.getLogger(MarcaServiceImpl.class);
	

	@Autowired
	IMarcaRepository marcaR;
	
	@Override
	public Integer create(MarcaDto marca) throws AcademyException {
		
		Optional<Marca> marc = marcaR.findById(marca.getId());
		if(!marc.isEmpty()) {
			throw new AcademyException(" Tipo Veicolo gia presente");
		}
		
		Marca input = new Marca();
	input.setId(marca.getId());
	input.setDescrizione(marca.getDescrione());
	
	return marcaR.save(input).getId();
	}


}
