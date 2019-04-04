package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.*;
 
@Service
public class MessageRender{
	
    	@Autowired
	@Qualifier("gm")
	public MessageProvider provider;

	public void displayMessage(){
		System.out.println(provider.getMessage());
	}
}