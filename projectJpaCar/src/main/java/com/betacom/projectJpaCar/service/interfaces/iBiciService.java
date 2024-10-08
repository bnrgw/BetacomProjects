package com.betacom.projectJpaCar.service.interfaces;

import com.betacom.projectJpaCar.dto.BiciDto;
import com.betacom.projectJpaCar.exception.AcademyException;

public interface iBiciService {
	void create(BiciDto bici) throws AcademyException;
	
	void delete (Integer id) throws AcademyException;
}
