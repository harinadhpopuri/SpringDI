package com.spring5.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring5.di.service.HelloService;

@Service
public class PropertyInjectedController {
	@Autowired
	//@Qualifier("helloServiceImpl")
	public HelloService helloService;
	
	public String sayHello() {
		return helloService.hello();
	}

}
