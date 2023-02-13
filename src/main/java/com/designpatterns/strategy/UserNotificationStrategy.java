package com.designpatterns.strategy;

import java.util.HashMap;
import java.util.Map;

public class UserNotificationStrategy {

    private final Map<UserNotificationEnum, String> createUserNotificationEnumConsumer= new HashMap<>();

    public UserNotificationStrategy(){
        createUserNotificationEnumConsumer.put(UserNotificationEnum.SMS, createSmsNotification());
        createUserNotificationEnumConsumer.put(UserNotificationEnum.FAX, createFaxNotification());
        createUserNotificationEnumConsumer.put(UserNotificationEnum.EMAIL, createEmailNotification());
        createUserNotificationEnumConsumer.put(UserNotificationEnum.TELEPHONE, createTelephoneNotification());
    }

    public String createSmsNotification() { return "Kullanıcıya sms  atıldı";}
    public String createFaxNotification(){
        return "Kullanıcıya fax  atıldı";
    }
    public String createEmailNotification(){
        return "Kullanıcıya mail  atıldı";
    }
    public String createTelephoneNotification(){
        return "Kullanıcıya telefon edildi";
    }

    public String invoke(UserNotificationEnum notificationEnum){
        return createUserNotificationEnumConsumer.get(notificationEnum);
    }

}
