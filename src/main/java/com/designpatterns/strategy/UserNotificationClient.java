package com.designpatterns.strategy;

public class UserNotificationClient {

    public static  void main(String[] args){
        UserNotificationStrategy strategy = new UserNotificationStrategy();
        System.out.println(strategy.invoke(UserNotificationEnum.SMS));
        System.out.println(strategy.invoke(UserNotificationEnum.EMAIL));
        System.out.println(strategy.invoke(UserNotificationEnum.FAX));
        System.out.println(strategy.invoke(UserNotificationEnum.TELEPHONE));

    }
}
