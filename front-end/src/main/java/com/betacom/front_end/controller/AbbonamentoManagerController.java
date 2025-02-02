package com.betacom.front_end.controller;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.betacom.front_end.request.AbbonamentoReq;
import com.betacom.front_end.response.Response;
import com.betacom.front_end.response.ResponseBase;

@Controller
public class AbbonamentoManagerController {

	@Value("${jpa.backend}")
	String backend;
	
	@Autowired
	RestTemplate rest;
	
	public static Logger log = LoggerFactory.getLogger(AbbonamentoManagerController.class);
	
	@GetMapping("/listAbbonamenti")
	public ModelAndView listAbbonamenti(@RequestParam Integer socioID) {
		ModelAndView mav =  new ModelAndView("list-abbonamento");
		
		URI uri = UriComponentsBuilder
				.fromHttpUrl(backend + "abbonamento/listBySocio")
				.queryParam("id", socioID)
				.buildAndExpand().toUri();
		
		log.debug("URI:" + uri);
		
		Response<?> abbo = rest.getForEntity(uri, Response.class).getBody();
		mav.addObject("abbonamento",abbo);
		
		mav.addObject("socioId",socioID);
		
		return mav;
		
	}
	@GetMapping("/removeAbbonamento")
	public Object removeAbbonamento(@RequestParam Integer abbID,@RequestParam Integer socioID) {
		
		log.debug("removeAbbonamento abbID:" + abbID + " socioID:" + socioID);
		
		URI uri = UriComponentsBuilder
				.fromHttpUrl(backend + "abbonamento/remove")
				.buildAndExpand().toUri();
		
		log.debug("URI:" + uri);
		
		ResponseBase r = rest.postForEntity(uri,abbID, ResponseBase.class).getBody();
		log.debug("rc remove:" +r.getRc() +" " + r.getMsg());
		
		if(!r.getRc()) {
			ModelAndView mav = new ModelAndView("list-attivita");
			
			 uri = UriComponentsBuilder
					.fromHttpUrl(backend + "attivita/listByAbbonamento")
					.queryParam("id", abbID)
					.buildAndExpand().toUri();
			log.debug("URI:" + uri);
			
			Response<?> attiv = rest.getForEntity(uri, Response.class).getBody();
			
			mav.addObject("attivita", attiv);
			mav.addObject("abbID", abbID);
			mav.addObject("socioID", socioID);
			mav.addObject("funzione","remove");
			return mav;
		}
		return "redirect:/listAbbonamenti?socioID=" +socioID;
	}
	
	
	@PostMapping("/createAbbonamento")
	public String createAbbonamento(@RequestParam Integer socioID) {
	
		AbbonamentoReq req = new AbbonamentoReq();
		req.setSocioID(socioID);
		req.setDataIscrizione(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
		
		URI uri = UriComponentsBuilder
				.fromHttpUrl(backend + "abbonamento/create")
				
				.buildAndExpand().toUri();
		
		log.debug("URI:" + uri);
		
		ResponseBase r = rest.postForEntity(uri,req, ResponseBase.class).getBody();
		
		return "redirect:/listAbbonamenti?socioID=" +socioID;
		
	}
	@GetMapping("/forseRemoveAbonamento")
	public Object forseRemoveAbonamento(@RequestParam Integer abbID, @RequestParam Integer socioID) {
		
		log.debug("forseRemoveAbbonamenti abbID:" + abbID + " socioID:" + socioID);
		
		URI uri = UriComponentsBuilder
				.fromHttpUrl(backend + "abbonamento/forseremove")
				.buildAndExpand().toUri();
		log.debug("URI:" + uri);
		
		ResponseBase r = rest.postForEntity(uri,abbID,  ResponseBase.class).getBody();
		
		log.debug("rc remove :" + r.getRc() + " " + r.getMsg());

		return "redirect:/listAbbonamenti?socioID=" + socioID ;
	}
	
	
}
