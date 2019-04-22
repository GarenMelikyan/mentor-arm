package com.mentorarm.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author William Arustamyan
 */

@Configuration
public class MapperConfig {


    @Bean
    public ModelMapper createModelMapper() {
        return new ModelMapper();
    }
}
