package com.binyu.designModel.$03factoryMethod.$02;

import com.binyu.designModel.$03factoryMethod.$02.order.BJOrderPizza;
import com.binyu.designModel.$03factoryMethod.$02.pizza.Pizza;

/**
 * 自己瞎掰的反射抽象工厂模式
 */
public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new BJOrderPizza().createPizza("com.binyu.designModel.$03factoryMethod.$02.pizza.BJCheesePizza");
        pizza.prepare();
    }
}
