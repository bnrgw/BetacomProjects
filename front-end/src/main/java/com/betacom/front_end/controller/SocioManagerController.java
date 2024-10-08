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
import com.betacom.front_end.dto.SocioViewDTO;
import com.betacom.front_end.request.SocioReq;
import com.betacom.front_end.response.Response;
import com.betacom.front_end.response.ResponseBase;
import com.betacom.front_end.response.ResponseObject;
import static com.betacom.front_end.utilities.WebUtils.convertInObject;

@Controller
public class SocioManagerController {

	@Value("${jpa.backend}")
	String backend;
	
	@Autowired
	RestTemplate rest;
	
	public static Logger log = LoggerFactory.getLogger(SocioManagerController.class);
	
	@GetMapping(value ={"/jpa","/listAll"})
	public ModelAndView listAllSocio() {
		
		ModelAndView mav = new ModelAndView("index");
		
		URI uri = UriComponentsBuilder
				.fromHttpUrl(backend + "socio/listAll")
				.buildAndExpand().toUri();
		
		log.debug("URI:" + uri);
		
		Response<?> soc = rest.getForEntity(uri, Response.class).getBody();
		mav.addObject("listAll",soc);
		
		return mav;
	}
	
	@GetMapping("/createSocio")
	public ModelAndView createSocio() {
		ModelAndView mav = new ModelAndView("create-socio");
		SocioReq s = new SocioReq();
		s.setErrorMSG(null);
		mav.addObject("socio", s);
		
		return mav;
	}
	
	@SuppressWarnings({"unchecked"})
	@GetMapping("/updateSocio")
	public ModelAndView updateSocio(@RequestParam Integer socioID) {
		ModelAndView mav = new ModelAndView("create-socio");
		URI uri = UriComponentsBuilder
				.fromHttpUrl(backend + "socio/getById")
				.queryParam("id", socioID)
				.buildAndExpand().toUri();
		
		log.debug("URI:" + uri);
		
		ResponseObject<SocioViewDTO> soc = rest.getForEntity(uri, ResponseObject.class).getBody();
		
		SocioReq s = new SocioReq();
		s.setErrorMSG(null);
		SocioViewDTO v = (SocioViewDTO) convertInObject(soc.getDati(),SocioViewDTO.class);
		s.setCognome(v.getCognome());
		s.setcFiscale(v.getcFiscale());
		s.setId(v.getId());
		s.setNome(v.getNome());
		
		mav.addObject("socio",s);
		return mav;
	}
	
	@PostMapping("/saveSocio")
	public Object saveSocio(@ModelAttribute("attivitaReq")SocioReq req) {
		log.debug("saveSocio cognome:" + req.getCognome());
		
		SocioDTO dto = new SocioDTO();
		dto.setId((req.getId()== null)? null: req.getId());
		dto.setcFiscale(req.getcFiscale());
		dto.setCognome(req.getCognome());
		dto.setNome(req.getNome());
		
		URI uri =UriComponentsBuilder
		.fromHttpUrl(backend + "socio/create")
		.buildAndExpand().toUri();
		
		log.debug("URI:" + uri);
		
		ResponseBase resp = rest.postForEntity(uri, dto, ResponseBase.class).getBody();
		
		log.debug("rc:" +resp.getRc());
		
		if(!resp.getRc()) {
			ModelAndView mav =  new ModelAndView("create-socio");
			req.setErrorMSG(resp.getMsg());
			mav.addObject("socio",req);
			return mav;
		}
		return "redirect:/listAll";
	}
}
