package com.designpatterns.chain;

public class CheckNameAndLastName extends BaseOrderChain implements OrderValidation {

    public CheckNameAndLastName(){}

    public CheckNameAndLastName(OrderValidation orderValidation){
        super(orderValidation);
    }

    @Override
    public void processRequest(User user) {
        if(user.getName()!= null && user.getLastName() != null ){
            if(user.getName().length()> 1 && user.getLastName().length()>1){
                System.out.println("name and lastName is valide");

            }
            else{
                System.out.println("name and lastName is not valide");
            }
        }else{
            System.out.println("name and lastName is not valide");
        }
        if(super.getOrderValidation() != null){
            super.getOrderValidation().processRequest(user);
        }
    }
}
