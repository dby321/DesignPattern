package com.binyu.designModel.$04absFactory.$01;

import com.binyu.designModel.$03factoryMethod.$01.order.BJOrderPizza;
import com.binyu.designModel.$04absFactory.$01.order.BJFactory;
import com.binyu.designModel.$04absFactory.$01.order.OrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
       new OrderPizza(new BJFactory());

    }
}
