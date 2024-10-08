package com.betacom.jpa.service.implementations;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.jpa.dto.AbbonamentoDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.pojo.Abbonamento;
import com.betacom.jpa.pojo.Attivita;
import com.betacom.jpa.pojo.Socio;
import com.betacom.jpa.repository.IAbbonamentoRepository;
import com.betacom.jpa.repository.IAttivitaRepository;
import com.betacom.jpa.repository.ISocioRepository;
import com.betacom.jpa.request.AbbonamentoAttivitaReq;
import com.betacom.jpa.service.interfaces.IAbbonamentoService;

import jakarta.transaction.Transactional;

@Service
public class AbbonamentoServiceImpl implements IAbbonamentoService{
	
	@Autowired
	IAbbonamentoRepository abboR;
	
	@Autowired
	ISocioRepository socioR;
	
	@Autowired
	IAttivitaRepository attiR;
	
	public static Logger log = LoggerFactory.getLogger(AbbonamentoServiceImpl.class);
	@Override
	public Integer create(AbbonamentoDTO abbo) throws AcademyException {
		Optional<Socio> soc = socioR.findById(abbo.getSocioID());
		if (soc.isEmpty())
			throw new AcademyException("Socio sconosciuto");
		Abbonamento abb = new Abbonamento();
		abb.setDataIscrizione(abbo.getDataIscrizione());
		abb.setSocio(soc.get());
		return abboR.save(abb).getId();
		
	}
	@Override
	public void createAttivita(AbbonamentoAttivitaReq req) throws AcademyException {
		Optional<Abbonamento> abb = abboR.findById(req.getAbbonamentoID());
		if (abb.isEmpty())
			throw new AcademyException("Abbonamento sconosciuto");
		
		
		for (String attivita:req.getAttivita()) {
			Optional<Attivita> myAtt = attiR.findByDescrizione(attivita.trim());
			if (myAtt.isEmpty())
				throw new AcademyException("Attivita " + attivita + " non trovata");
			if (existAttivita(abb.get().getAttivita(), attivita.trim()))
				throw new AcademyException("Attivita " + attivita + " già presente");
			abb.get().getAttivita().add(myAtt.get());
		}
		abboR.save(abb.get());
	}
	
	@Override
	public void removeAttivita(AbbonamentoAttivitaReq req) throws AcademyException {
		Optional<Abbonamento> abb = abboR.findById(req.getAbbonamentoID());
		if (abb.isEmpty())
			throw new AcademyException("Abbonamento sconosciuto");
		
		
		for (String attivita:req.getAttivita()) {
			Optional<Attivita> myAtt = attiR.findByDescrizione(attivita.trim());
			if (myAtt.isEmpty())
				throw new AcademyException("Attivita " + attivita + " non trovata");
			if (!existAttivita(abb.get().getAttivita(), attivita.trim()))
				throw new AcademyException("Attivita " + attivita + " non é presente");
	        abb.ifPresent(a -> a.getAttivita().removeIf(att -> att.getDescrizione().equalsIgnoreCase(attivita)));
			//abb.get().getAttivita().remove(myAtt.get());
			
		}
		log.debug("attivita size:" + abb.get().getAttivita().size());
		
		abboR.save(abb.get());
		log.debug("Abbonamento saved...");
		
	}
	  
	private boolean existAttivita (Set<Attivita> att, String search) {
		return att.stream()
				.map(Attivita::getDescrizione)
				.anyMatch(descrizione -> descrizione.equalsIgnoreCase(search));
	    }
}
