package com.sample.springdemo;

public class SadFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "sad day!!!!!!!!!!!!!";
	}

}
