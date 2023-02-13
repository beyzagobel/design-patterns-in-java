package com.designpatterns.chain;

public class CheckAddress extends BaseOrderChain implements OrderValidation {

    public CheckAddress() {}

    public CheckAddress(OrderValidation orderValidation) {
        super(orderValidation);
    }

    @Override
    public void processRequest(User user) {
        if(user.getAddress() != null){
            System.out.println("address is valide");

        }else{
            System.out.println("address is not valide");
        }
        if(super.getOrderValidation() != null){
            super.getOrderValidation().processRequest(user);
        }
    }
}
