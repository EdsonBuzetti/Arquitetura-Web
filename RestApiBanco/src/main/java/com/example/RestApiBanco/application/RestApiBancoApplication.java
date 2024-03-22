package com.example.RestApiBanco.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.boot.SpringApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.RestApiBanco.repository")
public class RestApiBancoApplication {
    public static void main(String[] args) { SpringApplication.run(RestApiBancoApplication.class, args);
    }
}
