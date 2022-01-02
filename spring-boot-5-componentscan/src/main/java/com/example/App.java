package com.example;

import com.example.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.others")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println(girl);
        } catch (Exception e) {
            System.out.println("Girl không tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            System.out.println(otherGirl);
        } catch (Exception e) {
            System.out.println("OtherGirl không tồn tại");
        }
    }
}
