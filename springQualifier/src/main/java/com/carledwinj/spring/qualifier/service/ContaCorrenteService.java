package com.carledwinj.spring.qualifier.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.carledwinj.spring.qualifier.model.Conta;
import com.carledwinj.spring.qualifier.model.ContaCorrente;

@Qualifier("corrente")
@Service
public class ContaCorrenteService implements ContaService {

	private static Logger log = LoggerFactory.getLogger(ContaCorrenteService.class);
	
	@Override
	public List<Conta> todas() {
		
		log.info("Executando ContaCorrenteService.todas()..."); 
		
		List<Conta> list = new ArrayList<>();
		
		ContaCorrente contaCorrente1 = new ContaCorrente();
		contaCorrente1.setAgencia(2234);
		contaCorrente1.setNumero(66768);
		contaCorrente1.setDigito(4);
		
		ContaCorrente contaCorrente2 = new ContaCorrente();
		contaCorrente2.setAgencia(3654);
		contaCorrente2.setNumero(12222);
		contaCorrente2.setDigito(7);
		
		list.add(contaCorrente1);
		list.add(contaCorrente2);
		return list;
	}

}
