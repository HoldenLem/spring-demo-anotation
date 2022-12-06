package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()

public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define my init method
    @PostConstruct
    public  void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of my doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanStuff() {
        System.out.println(">> TennisCoach: inside of my doMyCleanStuff()");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside setFortuneService");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practise you backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
