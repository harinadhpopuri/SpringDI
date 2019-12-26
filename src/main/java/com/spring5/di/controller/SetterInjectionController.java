package com.spring5.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring5.di.service.HelloService;

@Component
public class SetterInjectionController {
	
	public HelloService helloService;
	@Autowired
	public void setHelloService(@Qualifier("setterServiceImpl")HelloService helloService) {
		this.helloService = helloService;
	}
	
	public String sayHello() {
		return helloService.hello();
	}

}
