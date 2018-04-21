package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside setter method set Email address");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method setTeam");
		this.team = team;
	}



	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach: inside no-arg constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method constructor");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
