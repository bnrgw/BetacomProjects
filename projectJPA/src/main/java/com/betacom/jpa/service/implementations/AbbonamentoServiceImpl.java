package com.betacom.jpa.service.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.jpa.dto.AbbonamentoViewDTO;
import com.betacom.jpa.dto.SocioViewDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.pojo.Abbonamento;
import com.betacom.jpa.pojo.Attivita;
import com.betacom.jpa.pojo.Socio;
import com.betacom.jpa.repository.IAbbonamentoRepository;
import com.betacom.jpa.repository.IAttivitaRepository;
import com.betacom.jpa.repository.ISocioRepository;
import com.betacom.jpa.request.AbbonamentoReq;
import com.betacom.jpa.service.interfaces.IAbbonamentoService;
import com.betacom.jpa.service.interfaces.IMessaggioService;

import jakarta.transaction.Transactional;

import static com.betacom.jpa.util.Utilities.loadListViewAbbonamentoDTO;
import static com.betacom.jpa.util.Utilities.loadListViewSocioDTO;
@Service
public class AbbonamentoServiceImpl implements IAbbonamentoService{
	
	@Autowired
	IAbbonamentoRepository abboR;
	
	@Autowired
	ISocioRepository socioR;
	
	@Autowired
	IAttivitaRepository attiR;
	
	@Autowired
	IMessaggioService msgS;
	
	public static Logger log = LoggerFactory.getLogger(AbbonamentoServiceImpl.class);
	@Override
	public Integer create(AbbonamentoReq abbo) throws AcademyException {
		Optional<Socio> soc = socioR.findById(abbo.getSocioID());
		if (soc.isEmpty())
			throw new AcademyException(msgS.getMessaggio("socio-non-trovato"));
		Abbonamento abb = new Abbonamento();
		abb.setDataIscrizione(abbo.getDataIscrizione());
		abb.setSocio(soc.get());
		return abboR.save(abb).getId();
		
	}
	@Override
	public List<AbbonamentoViewDTO> listAbbonamenti(Integer id) throws AcademyException {
		List<Abbonamento> r = new ArrayList<Abbonamento>();
		if (id == null)
			r = abboR.findAll();
		else {
			Optional<Abbonamento> ab = abboR.findById(id);
			if (ab.isEmpty())
				throw new AcademyException(msgS.getMessaggio("abbo-noexist"));
			r.add(ab.get());
		}
		
		return loadListViewAbbonamentoDTO(r);
	}
	@Override
	public List<AbbonamentoViewDTO> listAbbonamentiBySocio(Integer id) throws AcademyException {
		Optional<Socio> soc = socioR.findById(id);
		if(soc.isEmpty())
			throw new AcademyException(msgS.getMessaggio("socio-non-trovato"));
		List<Abbonamento> r = new ArrayList<Abbonamento>();
		if(soc.get().getAbbonamenti().isEmpty())
			throw new AcademyException(msgS.getMessaggio("abbo-zero"));
		else 
			return loadListViewAbbonamentoDTO(soc.get().getAbbonamenti());
	}
	
	@Override
	public void removeAbbonamento(Integer id)throws AcademyException{
		Optional<Abbonamento> abb = abboR.findById(id);
		if (abb.isEmpty())
			throw new AcademyException(msgS.getMessaggio("abbo-noexist"));
		if (!abb.get().getAttivita().isEmpty())
			throw new AcademyException(msgS.getMessaggio("attiv-no-empty"));
		abboR.delete(abb.get());
	}
	
	public List<SocioViewDTO> ListSocioByAbboAttivita(Integer idAttivita) throws AcademyException{
		
		Optional<Attivita> att = attiR.findById(idAttivita);
		if(att.isEmpty())
			throw new AcademyException(msgS.getMessaggio("attiv-ntfnd"));
		List<Abbonamento> abb = att.get().getAbbonamenti();
		List<Socio> soci = new ArrayList<Socio>();
		
		for(Abbonamento a : abb) {
			soci.add(a.getSocio());
		}
		return loadListViewSocioDTO(soci);
		
	}
	
	@Override
	@Transactional(rollbackOn=Exception.class)
	public void forseRemoveAbbonamento(Integer id)throws AcademyException {
		Optional<Abbonamento> ab = abboR.findById(id);
		if (ab.isEmpty())
			throw new AcademyException(msgS.getMessaggio("abbo-noexist"));
		ab.get().getAttivita().clear();
		abboR.save(ab.get());
		abboR.delete(ab.get());
		
	}
}
