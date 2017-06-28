package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by Evegeny on 26/06/2017.
 */


public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private NotificationProps props;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        props.getMails().forEach(System.out::println);

    }
}










