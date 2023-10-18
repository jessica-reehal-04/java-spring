package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppContext.class);
		
		Welcome wimpl=(WelcomeImpl) context.getBean("service");
		System.out.println(wimpl.sayWelcome("Jessica"));
		
//		wimpl.sayHi("Jessica");
	}

}
