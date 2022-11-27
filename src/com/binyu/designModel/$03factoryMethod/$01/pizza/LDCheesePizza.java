package com.binyu.designModel.$03factoryMethod.$01.pizza;

public class LDCheesePizza extends Pizza {
    protected String name;
    // 不同的披萨准备原材料不一样
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨准备...");
    }


}
