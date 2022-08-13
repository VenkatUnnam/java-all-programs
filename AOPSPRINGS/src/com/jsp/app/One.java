package com.jsp.app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component("andq")
@Aspect
@EnableAspectJAutoProxy
public class One 
{
	@After("public void firstname1()")
	public void middlename()
	{
		System.out.println("bhanu");
	}
	
}
