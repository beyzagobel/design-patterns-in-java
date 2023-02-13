package com.designpatterns.strategy.no;


public class UserNotificationClient {
    public static void main(String[] args){
        UserNotification userNotificationClient = new UserNotification();
        String sms = userNotificationClient.getInformation("sms");
        String email = userNotificationClient.getInformation("email");
        String fax = userNotificationClient.getInformation("fax");

        System.out.println(sms);
        System.out.println(email);
        System.out.println(fax);

    }
}
