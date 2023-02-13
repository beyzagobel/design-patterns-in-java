package com.designpatterns.command;

public class Client {
    public static void main(String[] args) {
        System.out.println(Invoker.executeCreateNotification(new EmailNotification()));
        System.out.println(Invoker.executeCreateNotification(new FaxNotification()));
        System.out.println(Invoker.executeCreateNotification(new SmsNotification()));

    }
}
