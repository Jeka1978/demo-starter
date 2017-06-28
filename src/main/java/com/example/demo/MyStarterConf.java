package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by Evegeny on 26/06/2017.
 */
@EnableConfigurationProperties(NotificationProps.class)
public class MyStarterConf {
    @Bean
    @Profile("PROD")
    @ConditionalOnMissingBean(name = "prodListener")
    @ConditionalOnProperty(name = "notification.sendMails",havingValue = "true", matchIfMissing = true)
    public ProdNotificationListener prodNotificationListener(){
        return new ProdNotificationListener();
    }
}
