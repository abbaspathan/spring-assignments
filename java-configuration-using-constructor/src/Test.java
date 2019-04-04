package com.capgemini.spring.test;
import com.capgemini.spring.render.*; 
import org.springframework.context.annotation.*;
import org.springframework.context.*;
import com.capgemini.spring.config.*;


public class Test{
	public static void  main(String args[]){
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageRender render=(MessageRender)context.getBean("render");
		render.displayMessage();
	}
}