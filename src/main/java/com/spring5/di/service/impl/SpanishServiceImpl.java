package com.spring5.di.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.di.service.HelloService;
@Service
@Primary
@Profile("es")
public class SpanishServiceImpl implements HelloService {

	@Override
	public String hello() {
		return "Spanish Greetings";
	}

}
