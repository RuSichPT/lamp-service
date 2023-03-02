package ru.surf.hackathon.backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackathonBackendApplication {

    @Value("${team}")

    public static void main(String[] args) {
        SpringApplication.run(HackathonBackendApplication.class, args);
    }

}
