package com.kanti.springbootcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.kanti.springbootcore.common.Coach;
import com.kanti.springbootcore.common.SwimCoach;

@Configuration
public class SportConfig {
    
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
