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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.betacom.front_end.dto.SocioDTO;
import com.betacom.front_end.request.AttivitaReq;
import com.betacom.front_end.request.SocioReq;
import com.betacom.front_end.request.UtenteRequest;
import com.betacom.front_end.response.Response;
import com.betacom.front_end.response.ResponseBase;

@Controller
@RequestMapping("/admin")
public class AmministratoreManagerController {

	@Value("${jpa.backend}")
	String backend;

	@Autowired
	RestTemplate rest;

	public static Logger log = LoggerFactory.getLogger(AmministratoreManagerController.class);

	@GetMapping("/listAllAttivita")
	public ModelAndView listAllAttivita() {

		ModelAndView mav = new ModelAndView("IndexAttivita");

		URI uri = UriComponentsBuilder.fromHttpUrl(backend + "attivita/listAll").buildAndExpand().toUri();

		log.debug("URI:" + uri);

		Response<?> att = rest.getForEntity(uri, Response.class).getBody();

		mav.addObject("listAll", att);

		return mav;
	}

	@GetMapping("/createNewAttivita")
	public ModelAndView createNewAttivita() {
		ModelAndView mav = new ModelAndView("create-new-attivita");
		AttivitaReq a = new AttivitaReq();
		mav.addObject("attivita", a);

		return mav;
	}

	@PostMapping("/saveAttivita")
	public Object saveAttivita(@ModelAttribute("attivita") AttivitaReq req) {

		URI uri = UriComponentsBuilder.fromHttpUrl(backend + "attivita/create").buildAndExpand().toUri();

		log.debug("URI:" + uri);

		ResponseBase resp = rest.postForEntity(uri, req, ResponseBase.class).getBody();

		log.debug("rc:" + resp.getRc());

		if (!resp.getRc()) {
			ModelAndView mav = new ModelAndView("create-new-attivita");
			req.setErrorMSG(resp.getMsg());
			mav.addObject("attivita", req);
			return mav;
		}
		return "redirect:/listAllAttivita";
	}

	@GetMapping("/deleteAttivita")
	public ModelAndView deleteAttivita(@RequestParam Integer attID) {
		log.debug("removeAttivita attID:" + attID );
		ModelAndView mav = new ModelAndView("list-socio");

		URI uri = UriComponentsBuilder.fromHttpUrl(backend + "abbonamento/listSocioByAttivita")
				.queryParam("id", attID)
				.buildAndExpand()
				.toUri();

		log.debug("URI:" + uri);

		Response<?> soc = rest.getForEntity(uri, Response.class).getBody();
		mav.addObject("listAll", soc);

		return mav;
	}

	
	@GetMapping("/removeAttivita")
	public Object removeAttivita(@RequestParam Integer attID) {
	
		AttivitaReq req = new AttivitaReq();
		req.setId(attID);
		
		URI uri =UriComponentsBuilder
		.fromHttpUrl(backend + "attvita/removeAttivita")
		.queryParam("req", req)
		.buildAndExpand().toUri();
		
		log.debug("URI:" + uri);
		
		ResponseBase resp = rest.postForEntity(uri, req, ResponseBase.class).getBody();
		
		log.debug("rc:" +resp.getRc());
		
		if(!resp.getRc()) {
			ModelAndView mav =  new ModelAndView("list-socio");
			req.setErrorMSG(resp.getMsg());
			mav.addObject("listAll",resp);
			return mav;
		}
		return "redirect:/listAllAttivita";
	}
	@GetMapping("/createUtente")
	public Object createUtente() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("req", new UtenteRequest());
        mav.addObject("errorMSG", "");

        return mav;
	}
	
	@PostMapping("/saveUser")
	public Object saveUser(@ModelAttribute UtenteRequest req) {
		
		URI uri =UriComponentsBuilder
				.fromHttpUrl(backend + "utente/create")
				.buildAndExpand().toUri();
				
				log.debug("URI:" + uri);
				ResponseBase r = rest.postForEntity(uri, req, ResponseBase.class).getBody();
				log.debug("RC:" + r.getRc());
				if(!r.getRc()) {
					ModelAndView mav = new ModelAndView("create-user");
					mav.addObject("req",req);
					mav.addObject(r.getMsg());
					return mav;
				}
				return "redirect:/admin/createUtente";
	}
	
}
