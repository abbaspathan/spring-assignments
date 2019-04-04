package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;

public class MessageRender{

	public static MessageProvider provider;

	public void setMessageProvider(MessageProvider provider){
		this.provider=provider;
	}

	public void displayMessage(){
		System.out.println(provider.getMessage());
	}
}