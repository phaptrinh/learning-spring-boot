package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        SimpleBean simpleBean = context.getBean(SimpleBean.class);

        System.out.println(simpleBean);

        DatabaseConnector connector1 = (DatabaseConnector) context.getBean("mysql");

        connector1.connect();

        DatabaseConnector connector2 = context.getBean(MongoDbConnector.class);

        connector2.connect();
    }
}
