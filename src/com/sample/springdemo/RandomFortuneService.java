package com.sample.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {
			"About Time",
			"Age of Adaline",
			"Friends"
	};
	
	private Random myRandom =  new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.length);
		String fortune = fortunes[index];
		return fortune;
	}

}
