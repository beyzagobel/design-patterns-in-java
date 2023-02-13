package com.designpatterns.command;

public class SmsNotification implements IUserNotification{
    @Override
    public String createUserNotification() {
        return "Created sms notification";
    }
}
