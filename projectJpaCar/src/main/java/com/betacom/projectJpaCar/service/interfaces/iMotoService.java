package com.betacom.projectJpaCar.service.interfaces;


import com.betacom.projectJpaCar.dto.MotoDto;
import com.betacom.projectJpaCar.exception.AcademyException;

public interface iMotoService {

	void create(MotoDto moto) throws AcademyException;
}
