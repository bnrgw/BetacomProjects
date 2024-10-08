package com.betacom.jpa.service.interfaces;

import com.betacom.jpa.dto.AbbonamentoDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.request.AbbonamentoAttivitaReq;

public interface IAbbonamentoService {
 
	Integer create(AbbonamentoDTO abbo) throws AcademyException;
	void createAttivita(AbbonamentoAttivitaReq req) throws AcademyException;
	void removeAttivita(AbbonamentoAttivitaReq req) throws AcademyException;
	
	
}
