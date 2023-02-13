package com.designpatterns.chain;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args){
        User user = new User();
        user.setName("beyza");
        user.setAddress("address");
        user.setUserTckn("23451345");

        List<OrderValidation> orderValidations = Arrays.asList(
                new CheckNameAndLastName(new CheckTckn(new CheckAddress()))
        );
        Executer executer = new Executer(orderValidations);
        executer.executeChain(user);
    }


}
