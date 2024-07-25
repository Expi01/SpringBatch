package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task1Application {

    private static final Logger logger = LoggerFactory.getLogger(Task1Application.class);

    public static void main(String[] args) {
        logger.info("Starting Task1Application...");
        SpringApplication.run(Task1Application.class, args);
        logger.info("Task1Application started successfully.");
    }
}
