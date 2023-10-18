package com.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AppAdvice2 
{
	@Before("execution (* com.model.Welcome.sayWelcome(..))")
	public void callBefore()
	{
		System.out.println("Called before welcome2");
	}

}
