package com.spring5.di.service.impl;

import org.springframework.stereotype.Service;

import com.spring5.di.service.HelloService;
@Service
public class SetterServiceImpl implements HelloService {

	@Override
	public String hello() {
		return "Hello -Setter Service";
	}

}
