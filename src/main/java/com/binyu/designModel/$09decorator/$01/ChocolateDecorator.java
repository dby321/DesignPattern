package com.binyu.designModel.$09decorator.$01;

public class ChocolateDecorator extends Decorator{
    public ChocolateDecorator(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrize(3.0f);
    }
}
