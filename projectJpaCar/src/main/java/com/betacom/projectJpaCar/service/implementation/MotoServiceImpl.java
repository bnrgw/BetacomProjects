package com.betacom.projectJpaCar.service.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.betacom.projectJpaCar.dto.MotoDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.Moto;
import com.betacom.projectJpaCar.repository.IMotoRepository;
import com.betacom.projectJpaCar.service.interfaces.iMotoService;
import com.betacom.projectJpaCar.service.interfaces.iVeicoloService;

@Service
public class MotoServiceImpl implements iMotoService {

	public static Logger log = LoggerFactory.getLogger(MotoServiceImpl.class);
	@Autowired
	IMotoRepository motoR;
	@Autowired
	iVeicoloService veicoloS;

	@Override
	public void create(MotoDto moto) throws AcademyException {

		Moto input = new Moto();
		input.setCilindrata(moto.getCilindrata());
		input.setTarga(moto.getTarga());

		Integer IdMoto = motoR.save(input).getId();
		veicoloS.create(moto, IdMoto);

	}

}
