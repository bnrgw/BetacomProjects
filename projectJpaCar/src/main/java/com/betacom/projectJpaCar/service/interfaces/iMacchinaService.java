package com.betacom.projectJpaCar.service.interfaces;

import com.betacom.projectJpaCar.dto.MacchinaDto;
import com.betacom.projectJpaCar.dto.VeicoloDto;
import com.betacom.projectJpaCar.exception.AcademyException;

public interface iMacchinaService  {

	void create(MacchinaDto macchina) throws AcademyException;
	
	void delete(Integer id) throws AcademyException;
	
	void update(MacchinaDto macchina)throws AcademyException;
 }
