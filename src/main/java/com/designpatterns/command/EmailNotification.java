package com.designpatterns.command;

public class EmailNotification implements IUserNotification{
    @Override
    public String createUserNotification() {
        return "Created email notification";
    }
}
