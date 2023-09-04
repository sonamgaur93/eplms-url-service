package com.sap.eplms.url.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EplmsUrlServiceConfig {
	
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
