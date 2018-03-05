package com.carledwinj.spring.qualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carledwinj.spring.qualifier.service.ContaCorrenteService;

@SpringBootApplication
public class SpringDependencyApplication {
	
	private static Logger log = LoggerFactory.getLogger(ContaCorrenteService.class);

	public static void main(String[] args) {
		
		log.info("Executando SpringDependencyApplication.main()...");
		
		SpringApplication.run(SpringDependencyApplication.class, args);
	}
}
