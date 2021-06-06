package com.sample.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("anyNameSwimCoah", Coach.class);
			
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		System.out.println(((SwimCoach)theCoach).getEmail());
		System.out.println(((SwimCoach)theCoach).getTeam());
		
		context.close();

	}

}
