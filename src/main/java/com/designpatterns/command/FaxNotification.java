package com.designpatterns.command;

public class FaxNotification implements IUserNotification{
    @Override
    public String createUserNotification() {
        return "Created fax notification";
    }
}
