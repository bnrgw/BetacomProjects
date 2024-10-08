package com.betacom.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betacom.jpa.dto.SocioDTO;
import com.betacom.jpa.dto.SocioViewDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.response.Response;
import com.betacom.jpa.response.ResponseBase;
import com.betacom.jpa.service.interfaces.ISocioService;


@RestController
@RequestMapping("/rest/socio")
public class SocioController {
	
	@Autowired
	ISocioService socioS;
	
	@PostMapping("/create")
	public ResponseBase create(@RequestBody (required = true)  SocioDTO req) {
		ResponseBase res = new ResponseBase();
		res.setRc(true);
		
		try {
			if (req.getNome() == null)
				throw new AcademyException("Nome non presente");
			if (req.getCognome() == null)
				throw new AcademyException("Cognome non presente");
			if (req.getcFiscale() == null)
				throw new AcademyException("Codice fiscale non presente");
			
			
			socioS.createUpdateSocio(req);
		} catch (AcademyException e) {
			res.setRc(false);
			res.setMsg(e.getMessage());
		}
		
		return res;
	}

	@GetMapping("/listAll")
	public Response<SocioViewDTO> listAll(){
		Response<SocioViewDTO> resp = new Response<SocioViewDTO>();
		resp.setRc(true);
		resp.setDati(socioS.listAllSocio());
		
		return resp;
	}
	
}
