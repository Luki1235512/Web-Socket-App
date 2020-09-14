package com.example.websocketapp;

public class HelloMessage {

    private String name = "name";

    private String message = "message";

    public HelloMessage() {
    }

    public HelloMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String content) {
        this.message = content;
    }
}
