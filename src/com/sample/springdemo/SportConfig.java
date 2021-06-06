package com.sample.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.sample.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
//	define bean for sadFortune
	@Bean
	public FortuneService anyNameSad() {
		return new SadFortune();
	}
	
	
//	define bean for swimCoach and inject dependency
	@Bean
	public Coach anyNameSwimCoah() {
		return new SwimCoach(anyNameSad());
	}
	

}
