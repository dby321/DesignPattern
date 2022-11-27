package com.binyu.designModel.$02simpleFactory.$02;




public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
        System.out.println("-----");
        new OrderPizza2();
    }
}
