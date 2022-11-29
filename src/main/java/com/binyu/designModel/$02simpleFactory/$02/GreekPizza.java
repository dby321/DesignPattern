package com.binyu.designModel.$02simpleFactory.$02;

public class GreekPizza extends Pizza {
    protected String name;
    // 不同的披萨准备原材料不一样
    @Override
    public void prepare() {
        System.out.println("希腊披萨准备...");
    }

    public void bake(){
        System.out.println(name+" baking");
    }
    public void cut(){
        System.out.println(name+" cutting");
    }
    public void box(){
        System.out.println(name+" boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
