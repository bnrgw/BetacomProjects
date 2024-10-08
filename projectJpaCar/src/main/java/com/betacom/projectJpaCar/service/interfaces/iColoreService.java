package com.betacom.projectJpaCar.service.interfaces;


import com.betacom.projectJpaCar.dto.ColoreDto;
import com.betacom.projectJpaCar.exception.AcademyException;


public interface iColoreService {

	Integer create(ColoreDto colore) throws AcademyException;
	
}
