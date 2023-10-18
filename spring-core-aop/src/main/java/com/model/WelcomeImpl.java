package com.model;

import org.springframework.stereotype.Component;

@Component("service")
public class WelcomeImpl implements Welcome
{
	@Override
	public String sayWelcome(String name) 
	{
		return "Welcome "+name+" to AOP";
	}

	@Override
	public void sayHi(String name) 
	{
		System.out.println("Hi "+name);
	}
}
