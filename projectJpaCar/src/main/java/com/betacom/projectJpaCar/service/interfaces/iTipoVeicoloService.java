package com.betacom.projectJpaCar.service.interfaces;


import com.betacom.projectJpaCar.dto.TipoVeicoloDto;
import com.betacom.projectJpaCar.exception.AcademyException;

public interface iTipoVeicoloService {

	Integer create(TipoVeicoloDto abbo) throws AcademyException;
}
