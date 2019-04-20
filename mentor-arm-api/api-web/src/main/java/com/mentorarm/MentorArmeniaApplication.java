package com.mentorarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ImportResource("classpath:/com/mentorarm/mentorarm-api-web-context.xml")
@SpringBootApplication
//@EnableJpaRepositories("com.mentorarm.repositories")
public class MentorArmeniaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MentorArmeniaApplication.class, args);
    }

}
