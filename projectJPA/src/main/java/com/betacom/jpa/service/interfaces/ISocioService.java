package com.betacom.jpa.service.interfaces;

import java.util.List;

import com.betacom.jpa.dto.SocioDTO;
import com.betacom.jpa.dto.SocioViewDTO;
import com.betacom.jpa.exception.AcademyException;

public interface ISocioService {
	
	void createUpdateSocio(SocioDTO socio) throws AcademyException;
	List<SocioViewDTO> listSocio(Integer id, String nome, String cognome);
	
	List<SocioDTO> searchCognome(String cognome);
	List<SocioDTO> searchCognomi(List<String> cognomi);
	List<SocioDTO> searchCognomiLike(String pattern);
	List<SocioDTO> searchByAttivia(String attivita);
	
	SocioViewDTO searchById(Integer id);
	
	void removeSocio(SocioDTO socio) throws AcademyException;
	List<SocioViewDTO> listAll();
	
}
