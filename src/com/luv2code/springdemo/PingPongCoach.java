package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class PingPongCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public PingPongCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    // define a default constructor
    public PingPongCoach() {
        System.out.println(">> PingPongCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your pingpong drop shot";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
