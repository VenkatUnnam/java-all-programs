package com.jsp.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass 
{
public static void main(String[] args) 
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	
	context.scan("com.jsp.app");
	context.refresh();
	Zero w=(Zero) context.getBean("andq");
	w.firstname1();
}


}

