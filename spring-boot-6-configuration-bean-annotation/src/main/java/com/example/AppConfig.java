package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    SimpleBean getSimpleBean() {
        return new SimpleBean("Hello");
    }

    @Bean("mysql")
    DatabaseConnector getMySqlConnector() {
        DatabaseConnector mySqlConnector = new MySqlConnector();
        mySqlConnector.setUrl("mysql-url");
        return mySqlConnector;
    }

    @Bean("mongodb")
    DatabaseConnector getMongoDbConnector() {
        DatabaseConnector mongoDbConnector = new MongoDbConnector();
        mongoDbConnector.setUrl("mongodb-url");
        return mongoDbConnector;
    }

    @Bean("postgresql")
    DatabaseConnector getPostgreSqlConnector() {
        DatabaseConnector postgreSqlConnector = new PostgreSqlConnector();
        postgreSqlConnector.setUrl("postgresql-url");
        return postgreSqlConnector;
    }
}
