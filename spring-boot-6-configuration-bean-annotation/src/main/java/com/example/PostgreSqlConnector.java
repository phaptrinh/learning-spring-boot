package com.example;

public class PostgreSqlConnector extends DatabaseConnector {
    @Override
    void connect() {
        System.out.println("Đã kết nối tới PostgreSQL");
    }
}
