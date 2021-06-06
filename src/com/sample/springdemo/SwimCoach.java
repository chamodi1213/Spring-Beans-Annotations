package com.sample.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Value("${team}")
	private String team;

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "swim 1000 meters";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
