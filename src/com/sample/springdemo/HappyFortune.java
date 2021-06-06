package com.sample.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "lucky day for annotations!!!!!!!!!!!!!!";
	}

}
