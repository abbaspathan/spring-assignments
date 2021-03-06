package com.capgemini.spring.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;
 
@Configuration
public class MessageConfig {
 	
	@Bean
	public MessageProvider provider(){
		return new GMMessageProvider();
	}

	@Bean
	public MessageRender render(){
		MessageRender render=new MessageRender(provider());

		return render; 
	}
}