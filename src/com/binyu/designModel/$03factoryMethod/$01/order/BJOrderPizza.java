package com.binyu.designModel.$03factoryMethod.$01.order;



import com.binyu.designModel.$03factoryMethod.$01.pizza.BJCheesePizza;
import com.binyu.designModel.$03factoryMethod.$01.pizza.BJPepperPizza;
import com.binyu.designModel.$03factoryMethod.$01.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if(orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
