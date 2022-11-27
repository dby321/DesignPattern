package com.binyu.designModel.$02simpleFactory.$01;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("胡椒披萨准备...");
    }
}
