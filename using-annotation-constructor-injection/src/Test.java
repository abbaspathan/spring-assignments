package com.capgemini.spring.test;
import com.capgemini.spring.render.*; 
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test{
	public static void  main(String args[]){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("context.xml");
		MessageRender render=(MessageRender)ctx.getBean("messageRender");
		render.displayMessage();
	}
}