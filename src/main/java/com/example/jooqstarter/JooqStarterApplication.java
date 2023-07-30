package com.example.jooqstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class JooqStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(JooqStarterApplication.class, args);
    }

}
