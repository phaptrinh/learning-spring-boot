package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${mysql.url}")
    String mysqlUrl;

    @Bean
    DatabaseConnector mySqlConnector() {
        DatabaseConnector connector = new MySqlConnector();
        connector.setUrl(mysqlUrl);
        return connector;
    }
}