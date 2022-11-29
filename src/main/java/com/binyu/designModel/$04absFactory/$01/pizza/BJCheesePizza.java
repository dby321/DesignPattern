package com.binyu.designModel.$04absFactory.$01.pizza;

public class BJCheesePizza extends Pizza {
    protected String name;
    // 不同的披萨准备原材料不一样
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨准备...");
    }


}
