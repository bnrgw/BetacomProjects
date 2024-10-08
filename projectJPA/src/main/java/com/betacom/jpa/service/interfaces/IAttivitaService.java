package com.betacom.jpa.service.interfaces;

import java.util.List;

import com.betacom.jpa.dto.AttivitaDTO;
import com.betacom.jpa.dto.AttivitaViewDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.pojo.Attivita;
import com.betacom.jpa.request.AttivitaReq;

public interface IAttivitaService {
	void create(AttivitaReq att) throws AcademyException ;
	
	void createAttivitaAbbonamento(AttivitaReq req) throws AcademyException;
	void removeAttivitaAbbonamento(AttivitaReq req) throws AcademyException;
	void removeAttivita(AttivitaReq req) throws AcademyException;
	
	List<AttivitaDTO> listAll();
	Attivita searchByDescrizione(String desc);
	AttivitaViewDTO list(Integer id) throws AcademyException;
	 List<AttivitaDTO>listByAbbonamento(Integer id) throws AcademyException;

	List<AttivitaDTO> listAttivitaNonAbbonamento(Integer id) throws AcademyException;
	
	
}
