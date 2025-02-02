package com.betacom.front_end.controller;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.betacom.front_end.dto.SocioDTO;
import com.betacom.front_end.request.AbbonamentoReq;
import com.betacom.front_end.request.AttivitaReq;
import com.betacom.front_end.request.SocioReq;
import com.betacom.front_end.response.Response;
import com.betacom.front_end.response.ResponseBase;

@Controller
public class AttivitaManagerController {

	@Value("${jpa.backend}")
	String backend;
	
	@Autowired
	RestTemplate rest;
	
	public static Logger log = LoggerFactory.getLogger(AttivitaManagerController.class);
	
	@GetMapping("/attivitaAbbonamento")
	public ModelAndView attivitaAbbonamento(@RequestParam Integer abbID,@RequestParam Integer socioID) {
		ModelAndView mav = new ModelAndView("list-attivita");
		
		URI uri = UriComponentsBuilder
				.fromHttpUrl(backend + "attivita/listByAbbonamento")
				.queryParam("id", abbID)
				.buildAndExpand().toUri();
		log.debug("URI:" + uri);
		
		Response<?> attiv = rest.getForEntity(uri, Response.class).getBody();
		
		mav.addObject("attivita", attiv);
		mav.addObject("abbID", abbID);
		mav.addObject("socioID", socioID);
		mav.addObject("funzione","list");
		return mav;
	
	}
	
	@GetMapping("/removeAttivitaAbbonamento")
	public String  removeAttivitaAbbonamento(@RequestParam Integer abbID,@RequestParam Integer attID,@RequestParam Integer socioID) {
	
		AttivitaReq req = new AttivitaReq();
		req.setAbbonamentoID(abbID);
		req.setId(attID);
		
		
		URI uri = UriComponentsBuilder
				.fromHttpUrl(backend + "attivita/removeAttivitaAbbo")
				.buildAndExpand().toUri();
		log.debug("URI:" + uri);
		
		ResponseBase r = rest.postForEntity(uri,req,ResponseBase.class).getBody();
		
		log.debug("rc:" + r.getRc());
		
		
		
		return "redirect:attivitaAbbonamento?abbID=" + abbID + "&socioID=" + socioID;
	}
	
	@GetMapping("/createAttivita")
	public ModelAndView createAttivita(@RequestParam Integer abbID,@RequestParam Integer socioID) {
		log.debug("abbID:" + abbID);
		
		ModelAndView mav = new ModelAndView("create-attivita");
		
		URI uri = UriComponentsBuilder
				.fromHttpUrl(backend + "attivita/listAttivitaNonAbbonamento")
				.queryParam("id", abbID)
				.buildAndExpand().toUri();
		log.debug("URI:" + uri);
		
		Response<?> lattiv = rest.getForEntity(uri, Response.class).getBody();
		
		mav.addObject("listAttivita",lattiv);
		
		AttivitaReq req = new AttivitaReq();
		req.setAbbonamentoID(abbID);
		req.setSocioID(socioID);
		mav.addObject("attivitaReq", req);
		
		return mav;
	}
	
	@PostMapping("/saveAttivitaAbbonamento")
	public Object saveAttivitaAbbonamento(@ModelAttribute("attivitaReq")AttivitaReq req) {
		
		URI uri =UriComponentsBuilder
		.fromHttpUrl(backend + "attivita/createAttivitaAbbo")
		.buildAndExpand().toUri();
		
		log.debug("URI:" + uri);
		
		ResponseBase resp = rest.postForEntity(uri, req, ResponseBase.class).getBody();
		
		log.debug("rc:" +resp.getRc());
		
		return "redirect:/attivitaAbbonamento?abbID="+req.getAbbonamentoID() + "&socioID=" + req.getSocioID();
	}
	
	

	
	
}
