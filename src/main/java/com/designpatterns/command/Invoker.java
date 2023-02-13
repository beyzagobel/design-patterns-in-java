package com.designpatterns.command;

public class Invoker {
    private IUserNotification userNotification;

    public void setUserNotification(IUserNotification userNotification) {
        this.userNotification = userNotification;
    }

    public static String executeCreateNotification(IUserNotification userNotification){
        return userNotification.createUserNotification();
    }
}
