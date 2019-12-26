package com.spring5.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring5.di.service.HelloService;

@Component
public class ConstructorInjectionController {
	
	public HelloService helloService;
	
	@Autowired //not Necessary to have annotation here as 4.2 default to inject with constructor 
	public ConstructorInjectionController(@Qualifier("contructorServiceImpl")HelloService helloService) {
		super();
		this.helloService = helloService;
	}
	
	public String sayHello() {
		return helloService.hello();
	}
	

}
