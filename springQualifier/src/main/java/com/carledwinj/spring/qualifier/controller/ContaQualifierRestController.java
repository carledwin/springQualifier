package com.carledwinj.spring.qualifier.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carledwinj.spring.qualifier.model.Conta;
import com.carledwinj.spring.qualifier.service.ContaService;


@RestController
public class ContaQualifierRestController {
	
	private static Logger log = LoggerFactory.getLogger(ContaQualifierRestController.class);
	
	@Qualifier("corrente")
	@Autowired
	private ContaService service1;
	
	@Qualifier("poupanca")
	@Autowired
	private ContaService service2;
	
	@GetMapping("/qualifier/contasCorrentes")
	public List<Conta> contasCorrentes(){
		
		log.info("Executando ContaQualifierRestController.contasCorrentes()..."); 
		
		return service1.todas();
	}
	
	@GetMapping("/qualifier/contasPoupancas")
	public List<Conta> contasPoupancas(){
		
		log.info("Executando ContaQualifierRestController.contasPoupancas()..."); 
		
		return service2.todas();
	}

}
