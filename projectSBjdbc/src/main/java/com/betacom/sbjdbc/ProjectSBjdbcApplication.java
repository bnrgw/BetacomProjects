package com.betacom.sbjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.betacom.sbjdbc.component.BuisnessComponent;

@SpringBootApplication
public class ProjectSBjdbcApplication {
	@Autowired
	private BuisnessComponent bu;

	public static void main(String[] args) {
		SpringApplication.run(ProjectSBjdbcApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			bu.listUffici();
		};
	}
}
