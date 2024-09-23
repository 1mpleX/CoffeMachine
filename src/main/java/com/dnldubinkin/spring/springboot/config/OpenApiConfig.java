package com.dnldubinkin.spring.springboot.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi customApi() {
        String[] paths = {"/**"};
        return GroupedOpenApi.builder()
                .group("public-api")
                .pathsToMatch(paths)
                .packagesToScan("com.dnldubinkin.spring.springboot.controller")
                .build();
    }
}