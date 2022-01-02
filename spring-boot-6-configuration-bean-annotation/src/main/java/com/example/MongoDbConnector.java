package com.example;

public class MongoDbConnector extends DatabaseConnector {
    @Override
    void connect() {
        System.out.println("Đã kết nối tới MongoDB");
    }
}
