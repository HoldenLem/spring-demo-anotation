package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemmoApp {
    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());
        // close th context
        context.close();
    }

}
