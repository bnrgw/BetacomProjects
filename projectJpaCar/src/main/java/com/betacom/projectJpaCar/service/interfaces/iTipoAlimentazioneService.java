package com.betacom.projectJpaCar.service.interfaces;


import com.betacom.projectJpaCar.dto.TipoAlimentazioneDto;
import com.betacom.projectJpaCar.exception.AcademyException;

public interface iTipoAlimentazioneService {

	Integer create(TipoAlimentazioneDto ali) throws AcademyException;
}
