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
import com.betacom.jpa.service.interfaces.ISocioService;

@SpringBootTest
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SocioServiceTest {
	
	@Autowired
	ISocioService socioS;
	

	@Test
	@Order(1)
	public void createSocioTest() {
		try {
			SocioDTO soc = new SocioDTO();
			soc.setNome("Paolo");
			soc.setCognome("Verdi");
			soc.setDataCerticicato("12/05/2024");
			soc.setcFiscale("CF0101001");
			
			socioS.createUpdateSocio(soc);
			
			Assertions.assertThat(socioS.listSocio(1, null, null).get(0).getCognome()).isEqualTo("Verdi");
			
			soc = new SocioDTO();
			soc.setNome("Giovanni");
			soc.setCognome("Blue");
			soc.setDataCerticicato("12/06/2024");
			soc.setcFiscale("CF0101002");
			
			socioS.createUpdateSocio(soc);
			Assertions.assertThat(socioS.listSocio(2, null, null).get(0).getCognome()).isEqualTo("Blue");

			
			soc = new SocioDTO();
			soc.setNome("Marta");
			soc.setCognome("Yellow");
			soc.setDataCerticicato("13/06/2024");
			soc.setcFiscale("CF0101003");
			
			socioS.createUpdateSocio(soc);
			Assertions.assertThat(socioS.listSocio(3, null, null).get(0).getCognome()).isEqualTo("Yellow");

		} catch (Exception e) {
			fail("error in create socio:" + e.getMessage());
		}
	}
	
	@Test
	@Order(2)
	public void removeTest() {
		try {
			SocioDTO soc = new SocioDTO();
			soc.setNome("Paolo");
			soc.setCognome("Gialli");
			soc.setDataCerticicato("12/05/2024");
			soc.setcFiscale("FEFEF455h");
			
			socioS.createUpdateSocio(soc);
			List<SocioDTO> ls =socioS.searchCognome("Gialli");
			socioS.removeSocio(ls.get(0));
		
			

		} catch (Exception e) {
			fail("error in create socio:" + e.getMessage());
		}
	}
}
