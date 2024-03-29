package com.ginsan.activitydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude={org.activiti.spring.boot.SecurityAutoConfiguration.class})
public class ActivityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivityDemoApplication.class, args);
    }

}
