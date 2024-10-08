package com.betacom.projectJpaCar.service.interfaces;



import com.betacom.projectJpaCar.dto.VeicoloDto;
import com.betacom.projectJpaCar.exception.AcademyException;

public interface iVeicoloService {

	void create(VeicoloDto veicolo, Integer id) throws AcademyException;
	
	void delete(Integer idVeicolo) ;
	
	void update(VeicoloDto veicolo) throws AcademyException;
	

}
