package com.binyu.designModel.$03factoryMethod.$02.pizza;

public class LDGreekPizza extends Pizza {
    protected String name;
    // 不同的披萨准备原材料不一样
    @Override
    public void prepare() {
        setName("伦敦希腊披萨");
        System.out.println("伦敦希腊披萨准备...");
    }


}
