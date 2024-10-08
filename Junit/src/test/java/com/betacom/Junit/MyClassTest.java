package com.betacom.Junit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyClassTest {

	@Test
  public void calcoloTest() {
	  MyClass c = new MyClass();
	  Assertions.assertThat(c.calcolo(4,2)).isEqualTo(6);
	
  }
}
