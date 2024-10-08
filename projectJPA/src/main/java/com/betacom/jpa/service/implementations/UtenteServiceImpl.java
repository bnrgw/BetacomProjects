package com.betacom.jpa.service.implementations;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.jpa.dto.UtenteDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.pojo.Utente;
import com.betacom.jpa.repository.IUtenteRepository;
import com.betacom.jpa.request.UtenteRequest;
import com.betacom.jpa.service.interfaces.IMessaggioService;
import com.betacom.jpa.service.interfaces.IUtenteService;
import com.betacom.jpa.util.Roles;

@Service
public class UtenteServiceImpl implements IUtenteService {

	@Autowired
	IUtenteRepository utenteR;
	
	@Autowired
	IMessaggioService msgS;
	
	@Override
	public void createUtente(UtenteRequest req) throws AcademyException {
		Optional<Utente> u = utenteR.findByUserName(req.getUserName().trim());
		if(!u.isEmpty()) {
			 throw new AcademyException(msgS.getMessaggio("user-exist"));
		}
		Utente ut = new Utente();
		ut.setUserName(req.getUserName());
		ut.setPassword(req.getPassword());
		  ut.setRole(Roles.valueOf(req.getRole()) );
		  
		 utenteR.save(ut); 
		
	}

	@Override
	public List<UtenteDTO> getAll() {
	List<Utente> r= utenteR.findAll();
		return r.stream()
				.map(s->new UtenteDTO(
						s.getId(),
						s.getUserName(),
						s.getPassword(),
						s.getRole().toString())
						).collect(Collectors.toList());
	}

	
}
