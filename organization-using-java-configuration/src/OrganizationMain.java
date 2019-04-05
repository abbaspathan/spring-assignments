package com.capgemini.spring.client;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.*;
import com.capgemini.spring.model.*;
import com.capgemini.spring.config.*;

public class OrganizationMain{

	public static void main(String args[]){
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Organization org=(Organization)context.getBean("getOrganization");
		System.out.println();
		System.out.println(org);
	}
}