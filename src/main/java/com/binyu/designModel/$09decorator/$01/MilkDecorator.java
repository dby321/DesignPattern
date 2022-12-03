package com.binyu.designModel.$09decorator.$01;

public class MilkDecorator extends Decorator{
    public MilkDecorator(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrize(2.0f);
    }
}
