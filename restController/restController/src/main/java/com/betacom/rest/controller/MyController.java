package com.betacom.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.betacom.rest.controller.object.RequestObject;
import com.betacom.rest.controller.object.ResponseObject;
import com.betacom.rest.controller.object.Student;

@RestController
@RequestMapping("/rest")
public class MyController {
	
	
	@RequestMapping("/service1")
	public Student service1() {
		Student s = new Student();
		s.setNome("valentino");
		s.setCognome("Rossi");
		return s;
	}
	
	@GetMapping("/service2")
	public Student service2(String nome,@RequestParam("cognome") String cognome) {
		Student s = new Student();
		if(nome == null) s.setNome("...");
		else s.setNome(nome);
		if(cognome == null) s.setCognome("....");
		else s.setCognome(cognome);
		
		return s;
		}
	

	@GetMapping("/service3/{cognome}")
	public Student service3(String nome,@PathVariable("cognome") String cognome) {
		Student s = new Student();
		if(nome == null) s.setNome("...");
		else s.setNome(nome);
		if(cognome == null) s.setCognome("...");
		else s.setCognome(cognome);
		
		return s;
		}
	
	@PostMapping("/service4")
	public Object create( @RequestBody  (required = true) RequestObject req) {
		ResponseObject resp = new ResponseObject();
		Student s = new Student();
		resp.setRc(false);
		if(req.getAzione() == null) {
			resp.setRc(false);
			resp.setMessage("azione non valida");
		}
		if("add".equalsIgnoreCase(req.getAzione())) {
			if(req.getMode() == null) {
				s.setCognome(req.getCognome());
				s.setNome(req.getNome());
			}else if (req.getMode().equalsIgnoreCase("upper")) {
				s.setCognome(req.getCognome().toUpperCase());
				s.setNome(req.getNome().toUpperCase());
			}else {
				s.setCognome(req.getCognome().toLowerCase());
				s.setNome(req.getNome().toLowerCase());
			}
			resp.setDati(s);
		}else {
			resp.setRc(false);
			resp.setMessage("azione invalida");
		}
			return resp;
	}
	
	
	
}

