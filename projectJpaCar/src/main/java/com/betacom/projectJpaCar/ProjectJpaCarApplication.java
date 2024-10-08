package com.betacom.projectJpaCar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.betacom.projectJpaCar.process.ProcessTest;

@SpringBootApplication
public class ProjectJpaCarApplication {
	
    @Autowired
	ProcessTest proS;
    
	public static void main(String[] args) {
		SpringApplication.run(ProjectJpaCarApplication.class, args);
	}
	
	@Bean //istanza di una classe java che viene gestita dal container spring, 
	CommandLineRunner commandLineRunner() {
		return args ->{
			proS.execute();
		};
	}

}
