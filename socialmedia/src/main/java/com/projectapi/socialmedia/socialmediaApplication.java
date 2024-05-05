package com.projectapi.socialmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.projectapi.socialmedia")
public class socialmediaApplication {

    public static void main(String[] args) {
        SpringApplication.run(socialmediaApplication.class, args);
    }

}
