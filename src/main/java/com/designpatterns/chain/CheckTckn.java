package com.designpatterns.chain;

public class CheckTckn extends BaseOrderChain implements OrderValidation {

    public CheckTckn(){}

    public CheckTckn(OrderValidation orderValidation) {
        super(orderValidation);
    }

    @Override
    public void processRequest(User user) {
        if(TcknUtil.kontrol(user.getUserTckn())){
            System.out.println("userTckn is valide");
        }else{
            System.out.println("userTckn is not valide");

        }
        if(super.getOrderValidation() != null){
            super.getOrderValidation().processRequest(user);
        }
    }
}
