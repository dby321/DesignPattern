package com.binyu.designModel.$09decorator.$01;

public class SoyDecorator extends Decorator{
    public SoyDecorator(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrize(1.5f);
    }
}
