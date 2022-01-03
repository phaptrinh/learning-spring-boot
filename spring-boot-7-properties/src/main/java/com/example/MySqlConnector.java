package com.example;

public class MySqlConnector extends DatabaseConnector {
    @Override
    void connect() {
        System.out.println("Đã kết nối với MySQL");
    }
}
