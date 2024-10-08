package com.betacom.jpa;

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

import com.betacom.jpa.dto.SocioDTO;
import com.betacom.jpa.exception.AcademyException;
import com.betacom.jpa.service.interfaces.ISocioService;

@SpringBootTest
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class socioListTest {

	@Autowired
	ISocioService socioS;

	@Test
	@Order(1)
	public void searchCognomeTest() {
		try {
			SocioDTO soc = new SocioDTO();
			soc.setNome("Paolo");
			soc.setCognome("Verdi");
			soc.setDataCerticicato("12/05/2024");
			soc.setcFiscale("CF0101004");

			socioS.createUpdateSocio(soc);
			
			List<SocioDTO> ls =socioS.searchCognome("Verdi");
			
			Assertions.assertThat(ls.size()).isGreaterThan(0);
		} catch (AcademyException e) {
			fail("error in create socio:" + e.getMessage());
		}

	}
	

	@Test
	@Order(2)
	public void searchCognomiLikeTest() {
		try {
			SocioDTO soc = new SocioDTO();
			soc.setNome("Mario");
			soc.setCognome("Rossi");
			soc.setDataCerticicato("12/05/2024");
			soc.setcFiscale("FEES456FE");
			
			socioS.createUpdateSocio(soc);
			
			List<SocioDTO> ls =socioS.searchCognomiLike("Ros");
			
			Assertions.assertThat(ls.get(0).getCognome()).isEqualTo("Rossi");
			
		} catch (AcademyException e) {
			fail("error in create socio:" + e.getMessage());
		}
	}
	
	
}
