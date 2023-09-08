package com.example.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SampleAWSApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleAWSApplication.class, args);
    }

}
