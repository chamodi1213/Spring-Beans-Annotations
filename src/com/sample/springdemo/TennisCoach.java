package com.sample.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
//	field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
 	public TennisCoach() {
		System.out.println("inside default constructor - TennisCoach");
	}
 	
// 	init method
// 	@PostConstruct
 	public void doStartupStuff() {
 		System.out.println("inside init method - doStartupStuff");
 	}
// 	destroy method
// 	@PreDestroy
 	public void doCleanupStuff() {
 		System.out.println("inside destroy method - doCleanupStuff");
 	}

 	/*
  	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
 	 */
	
 	
// 	define settter method
// 	@Autowired
// 	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("inside setter method - setFortuneService");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "practice Tennis";
	}


	@Override
	public String getFortune() {
		return fortuneService.getFortune();
//		return "bla bla bla";
	}

}
