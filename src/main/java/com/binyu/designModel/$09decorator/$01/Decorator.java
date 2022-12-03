package com.binyu.designModel.$09decorator.$01;

public class Decorator extends Drink{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink=drink;
    }

    @Override
    public float cost() {
        return super.getPrize()+this.drink.cost();
    }

    @Override
    public String getDes() {
        //this.drink.getDes()是被装饰者的信息
        return super.des+" "+super.getPrize()+"&&"+this.drink.getDes();
    }
}
