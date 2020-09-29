package com.csye6225.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.csye6225.lms.dao")
public class BuildingManagementsystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(BuildingManagementsystemApplication.class, args);
    }
}