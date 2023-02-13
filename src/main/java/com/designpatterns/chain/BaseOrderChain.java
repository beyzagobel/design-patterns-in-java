package com.designpatterns.chain;

public class BaseOrderChain {
    private OrderValidation orderValidation;

    public BaseOrderChain() {}

    public BaseOrderChain(OrderValidation orderValidation) {
        this.orderValidation = orderValidation;
    }

    public OrderValidation getOrderValidation() {
        return orderValidation;
    }
}
