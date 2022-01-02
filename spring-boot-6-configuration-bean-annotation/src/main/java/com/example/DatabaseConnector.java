package com.example;

public abstract class DatabaseConnector {
    private String url;

    abstract void connect();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
