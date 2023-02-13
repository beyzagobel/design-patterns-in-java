package com.designpatterns.strategy.no;

public class UserNotification {
    public String getInformation(String informationType){
        switch (informationType) {
            case "sms":
                return "Kullanıcıya sms atıldı";
            case "email":
                return "Kullanıcıya email atıldı";
            case "fax":
                return "Kullanıcıya fax atıldı";
        }
        return informationType;
    }
}
