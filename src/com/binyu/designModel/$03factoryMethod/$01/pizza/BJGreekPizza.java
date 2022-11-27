package com.binyu.designModel.$03factoryMethod.$01.pizza;

public class BJGreekPizza extends Pizza {
    protected String name;
    // 不同的披萨准备原材料不一样
    @Override
    public void prepare() {
        setName("北京希腊披萨");
        System.out.println("北京希腊披萨准备...");
    }

}
