package com.betacom.front_end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontEndApplication.class, args);
	}

	@Bean
	public RestTemplate rest() {
		RestTemplate rt = new RestTemplateBuilder().build();
		return rt;
	}
	//restTemplate da la possibilita di comunicare con il backend
}
