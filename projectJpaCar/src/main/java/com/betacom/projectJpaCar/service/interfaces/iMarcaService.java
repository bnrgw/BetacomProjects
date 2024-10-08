package com.betacom.projectJpaCar.service.interfaces;


import com.betacom.projectJpaCar.dto.MarcaDto;
import com.betacom.projectJpaCar.exception.AcademyException;

public interface iMarcaService {

	Integer create(MarcaDto marca) throws AcademyException;
}
