package com.betacom.jpa;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.betacom.jpa.dto.AbbonamentoDTO;
import com.betacom.jpa.dto.AttivitaDTO;
import com.betacom.jpa.dto.AttivitaViewDTO;
import com.betacom.jpa.dto.SocioDTO;
import com.betacom.jpa.dto.SocioViewDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.pojo.Abbonamento;
import com.betacom.jpa.pojo.Socio;
import com.betacom.jpa.request.AbbonamentoReq;
import com.betacom.jpa.request.AttivitaReq;
import com.betacom.jpa.service.interfaces.IAbbonamentoService;
import com.betacom.jpa.service.interfaces.IAttivitaService;
import com.betacom.jpa.service.interfaces.ISocioService;

@SpringBootTest
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AttivitaServiceTest {
	
	@Autowired
	private IAttivitaService attivS;
	
	@Autowired
	ISocioService socioS;
		
	@Autowired
	IAbbonamentoService abboS;
	
	@Test
	@Order(1)
	public void attivitaServiceImplTest() {
		try {
			
			//Assertions.assertThat(socioS.listSocio(2, null, null).get(0).getCognome()).isEqualTo("Blue");
			
			AttivitaReq req = new AttivitaReq();
			req.setDescrizione("Judo");
			attivS.create(req);
			
			List<AttivitaDTO> lA = attivS.listAll();
			
			Assertions.assertThat(lA.size()).isGreaterThan(0);
	
		} catch (Exception e) {
			fail("error in esecuzione:" + e.getMessage());
		}
	}
	
	@Test
	@Order(2)
	public void attivitaServiceImplTest1(){
		try {
			AttivitaReq req = new AttivitaReq();
			req.setDescrizione("Karate");
			attivS.create(req);
			
			List<AttivitaDTO> lA = attivS.listAll();
			
			Assertions.assertThat(lA.size()).isGreaterThan(1);
	
		} catch (Exception e) {
			fail("error in esecuzione:" + e.getMessage());
		}
	}
	@Test
	@Order(3)
	public void createAttivitaAbbonamento() {
		try {
		   SocioDTO soc = new SocioDTO();
		    soc.setNome("Giovanni");
			soc.setCognome("Blue");
			soc.setDataCerticicato("12/06/2024");
			soc.setcFiscale("CF0101005");
			socioS.createUpdateSocio(soc);
			
			AbbonamentoReq abb = new AbbonamentoReq();
			abb.setDataIscrizione("12/06/2024");
			abb.setSocioID(socioS.searchCognome("Blue").get(0).getId());
			//abboS.create(abb);
			
			AttivitaReq req = new AttivitaReq();
			req.setAttivita(new String []{"Judo","Karate"});
			req.setAbbonamentoID(abboS.create(abb));
			attivS.createAttivitaAbbonamento(req);
			
			AttivitaViewDTO a = attivS.list(2);
			
			//Assertions.assertThat(a.getAttivita().get(0).getCognome()).isEqualTo("Verdi");
			Assertions.assertThat(a.getDescrizione()).isEqualTo("Karate");
	
		} catch (Exception e) {
			fail("error in createAttivitaAbbonamento:" + e.getMessage());
		}
	}
	
	@Test
	@Order(4)
	public void removeAttivitaTest() {
		try {
		
				AttivitaReq req = new AttivitaReq();
				req.setDescrizione("Yoga");
				attivS.create(req);
			
				List<AttivitaDTO> lA = attivS.listAll();
				Assertions.assertThat(lA.size()).isEqualTo(3);
				
				
				req.setId(attivS.searchByDescrizione(req.getDescrizione()).getId());
				
				attivS.removeAttivita(req);
				
				lA = attivS.listAll();
				Assertions.assertThat(lA.size()).isEqualTo(2);
				
			
			} catch (Exception e) {
				fail("error in removeAttivita:" + e.getMessage());
			}
	}
	
	@Test
	@Order(5)
	public void removeAttivitaAbbonamento() {
		try {
		   SocioDTO soc = new SocioDTO();
		    soc.setNome("Giovanni");
			soc.setCognome("Blue");
			soc.setDataCerticicato("12/06/2024");
			soc.setcFiscale("CF0101006");
			socioS.createUpdateSocio(soc);
			
			AbbonamentoReq abb = new AbbonamentoReq();
			abb.setDataIscrizione("12/06/2024");
			abb.setSocioID(socioS.searchCognome("Blue").get(0).getId());
			
			
			AttivitaReq req = new AttivitaReq();
			req.setAttivita(new String []{"Judo"});
			req.setDescrizione("Judo");
			req.setAbbonamentoID(abboS.create(abb));
			attivS.createAttivitaAbbonamento(req);
			
			req.setId(attivS.searchByDescrizione(req.getDescrizione()).getId());
			
			attivS.removeAttivitaAbbonamento(req);
			
			
		} catch (Exception e) {
			fail("error in removeAttivitaAbbonamento:" + e.getMessage());
		}
	}
	

}
