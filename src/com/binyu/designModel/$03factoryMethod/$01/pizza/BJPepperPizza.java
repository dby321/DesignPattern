package com.binyu.designModel.$03factoryMethod.$01.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨准备...");
    }
}
