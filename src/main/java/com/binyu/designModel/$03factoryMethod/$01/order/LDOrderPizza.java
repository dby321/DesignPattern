package com.binyu.designModel.$03factoryMethod.$01.order;



import com.binyu.designModel.$03factoryMethod.$01.pizza.*;

public class LDOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if(orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
