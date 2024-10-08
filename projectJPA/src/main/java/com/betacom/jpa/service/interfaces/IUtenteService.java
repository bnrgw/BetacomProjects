package com.betacom.jpa.service.interfaces;

import java.util.List;

import com.betacom.jpa.dto.UtenteDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.request.UtenteRequest;

public interface IUtenteService {

	void createUtente(UtenteRequest req) throws AcademyException;
	List<UtenteDTO> getAll();
}
