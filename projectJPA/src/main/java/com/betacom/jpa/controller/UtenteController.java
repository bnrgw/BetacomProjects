package com.betacom.jpa.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betacom.jpa.dto.UtenteDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.request.UtenteRequest;
import com.betacom.jpa.response.ResponseBase;
import com.betacom.jpa.service.interfaces.IUtenteService;

@RestController
@RequestMapping("/rest/utente")
public class UtenteController {

	@Autowired
	private IUtenteService utenteS;
	
	@PostMapping("/create")
	public ResponseBase create(@RequestBody (required = true) UtenteRequest req) {
		ResponseBase res = new ResponseBase();
		res.setRc(true);
		
		try {
			utenteS.createUtente(req);
		}catch(AcademyException e) {
			res.setRc(false);
			res.setMsg(null);
		}
		return res;
	}
	
	@GetMapping("/list")
	/*
	public List<HashMap<String, Object>> list(){
		List<UtenteDTO> ut = utenteS.getAll();
		
		 List<HashMap<String, Object>> resp = new ArrayList<HashMap<String, Object>>();
		 
		 for(UtenteDTO it:ut) {
			 HashMap<String, Object> map = new HashMap<String, Object>();
			 map.put("userName", it.getUserName());
			 map.put("password", it.getPassword());
			 map.put("role", it.getRole());
			 resp.add(map);
		 }
		 return resp;
	}
}
*/
	public List<UtenteDTO> list(){
		return utenteS.getAll();
	}
	
}
