package com.designpatterns.chain;

import java.util.List;

public class Executer {
    private final List<OrderValidation> orderValidations;

    public Executer(List<OrderValidation> orderValidations) {
        this.orderValidations = orderValidations;
    }

    public void executeChain(User user){
        this.orderValidations.stream().forEach(item -> {
            item.processRequest(user);
        });
    }
}
