package com.betacom.Junit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Rollback(value= false)
public class EmployeeRepositoryTest {

	@Autowired
	EmployeeRepository reposE;
	
	@Test
	@Order(1)

	public void saveEmployee() {
		Employee e = new Employee();
		e.setCognome("Neri");
		e.setNome("Paolo");
		e.setEmail("p.neri@betacom.it");
		
		reposE.save(e);
		Assertions.assertThat(e.getId()).isGreaterThan(0);
	}
	
	public void save2() {
		Employee e = new Employee();
		e.setCognome("Biondo");
		e.setNome("Emi");
		e.setEmail("b.emi@betacom.it");
		
		reposE.save(e);
		Assertions.assertThat(e.getId()).isGreaterThan(0);
	}
	
	@Test
	@Order(2)
	public void getEmployeeTest() {
		
		Employee e = reposE.findById(1).get();
		
		Assertions.assertThat(e.getId()).isEqualTo(1);
	}
}
