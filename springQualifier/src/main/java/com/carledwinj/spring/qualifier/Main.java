package com.carledwinj.spring.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.carledwinj.spring.qualifier.service.ContaService;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class.getPackage().getName());
		
		ContaService service = applicationContext.getBean("contaCorrenteService", ContaService.class);
		ContaService service2 = applicationContext.getBean("contaPoupancaService", ContaService.class);
		
		System.out.println(service.todas());
		System.out.println(service2.todas());
	}
}
