package com.home.tut.resumeportal;

import com.home.tut.resumeportal.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ResumePortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumePortalApplication.class, args);
    }

}
