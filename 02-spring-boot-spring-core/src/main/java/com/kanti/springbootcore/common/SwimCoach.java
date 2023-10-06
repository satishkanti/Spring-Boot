package com.kanti.springbootcore.common;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Swin 1000 metres as a warm up";
    }
    
}
