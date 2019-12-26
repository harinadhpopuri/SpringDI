package com.spring5.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring5.di.controller.ConstructorInjectionController;
import com.spring5.di.controller.PropertyInjectedController;
import com.spring5.di.controller.SetterInjectionController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		
		SetterInjectionController st = (SetterInjectionController) ctx.getBean("setterInjectionController");
		ConstructorInjectionController ct = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		PropertyInjectedController pt = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(st.sayHello());
		System.out.println(ct.sayHello());
		System.out.println(pt.sayHello());
	}

}
