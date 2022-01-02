package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Girl {
    @PostConstruct
    public void postConstruct() {
        System.out.println("\t>> Đối tượng Girl sau khi khởi tạo sẽ chạy hàm này");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("\t>> Đối tượng Girl trước khi bị destroy sẽ chạy hàm này");
    }
}
