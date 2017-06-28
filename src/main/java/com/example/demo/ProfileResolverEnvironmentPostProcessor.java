package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 26/06/2017.
 */


public class ProfileResolverEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication springApplication) {
        if (environment.getActiveProfiles().length == 0) {
            if (System.getenv().get("OS").toLowerCase().contains("windows")) {
                environment.addActiveProfile("DEV");
            }
        }

    }
}










