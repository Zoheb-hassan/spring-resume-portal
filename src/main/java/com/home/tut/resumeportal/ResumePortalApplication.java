package com.home.tut.resumeportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.home.tut.resumeportal.repository")
public class ResumePortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumePortalApplication.class, args);
    }

}
