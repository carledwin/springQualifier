package com.carledwinj.spring.qualifier.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carledwinj.spring.qualifier.model.Conta;
import com.carledwinj.spring.qualifier.service.ContaService;


@RestController
public class ContaNameRestController {
	
	private static Logger log = LoggerFactory.getLogger(ContaNameRestController.class);
	
	@Autowired
	private ContaService contaCorrenteService;
	
	@Autowired
	private ContaService contaPoupancaService;
	
	@GetMapping("/name/contasCorrentes")
	public List<Conta> contasCorrentes(){
		
		log.info("Executando ContaNameRestController.contasCorrentes()..."); 
		
		return contaCorrenteService.todas();
	}
	
	@GetMapping("/name/contasPoupancas")
	public List<Conta> contasPoupancas(){
		
		log.info("Executando ContaNameRestController.contasPoupancas()..."); 
		
		return contaPoupancaService.todas();
	}

}
