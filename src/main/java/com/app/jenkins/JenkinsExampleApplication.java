package com.app.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsExampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(JenkinsExampleApplication.class, args);
        System.out.println("Jenkins Example");
    }

}
