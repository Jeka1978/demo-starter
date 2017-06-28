package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Created by Evegeny on 26/06/2017.
 */
@Data
@ConfigurationProperties("notification")
public class NotificationProps {
    private List<String> mails;
    private boolean sendMails;
}
