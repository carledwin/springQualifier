package com.carledwinj.spring.qualifier.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.carledwinj.spring.qualifier.model.Conta;
import com.carledwinj.spring.qualifier.model.ContaPoupanca;

@Qualifier("poupanca")
@Service
public class ContaPoupancaService implements ContaService {

	private static Logger log = LoggerFactory.getLogger(ContaPoupancaService.class);
	
	@Override
	public List<Conta> todas() {
		
		log.info("Executando ContaPoupancaService.todas()..."); 
		
		List<Conta> list = new ArrayList<>();
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca();
		contaPoupanca1.setAgencia(343);
		contaPoupanca1.setNumero(88876);
		contaPoupanca1.setCodigo(500);
		
		ContaPoupanca contaPoupanca2 = new ContaPoupanca();
		contaPoupanca2.setAgencia(2333);
		contaPoupanca2.setNumero(67788);
		contaPoupanca2.setCodigo(400);
		
		ContaPoupanca contaPoupanca3 = new ContaPoupanca();
		contaPoupanca3.setAgencia(1122);
		contaPoupanca3.setNumero(44543);
		contaPoupanca3.setCodigo(600);
		
		list.add(contaPoupanca1);
		list.add(contaPoupanca2);
		list.add(contaPoupanca3);
		return list;
	}

}
