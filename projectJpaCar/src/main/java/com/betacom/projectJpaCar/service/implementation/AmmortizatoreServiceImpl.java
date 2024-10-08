package com.betacom.projectJpaCar.service.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.betacom.projectJpaCar.dto.AmmortizzatoreDto;
import com.betacom.projectJpaCar.exception.AcademyException;
import com.betacom.projectJpaCar.pojo.Ammortizzatore;
import com.betacom.projectJpaCar.repository.IAmmortizatoreRepository;
import com.betacom.projectJpaCar.service.interfaces.iAmmortizzatoreService;


@Service
public class AmmortizatoreServiceImpl implements iAmmortizzatoreService{

	public static Logger log = LoggerFactory.getLogger(AmmortizatoreServiceImpl.class);
	

	@Autowired
	IAmmortizatoreRepository tAmmoR;
	
	@Override
	public Integer create(AmmortizzatoreDto amm) throws AcademyException {
		
		Optional<Ammortizzatore> tAmmo = tAmmoR.findById(amm.getId());
		if(!tAmmo.isEmpty()) {
			throw new AcademyException(" Tipo Veicolo gia presente");
		}
		
		Ammortizzatore input = new Ammortizzatore();
	input.setId(amm.getId());
	input.setDescrizione(amm.getDescrizione());
	
	return tAmmoR.save(input).getId();
	}


}
