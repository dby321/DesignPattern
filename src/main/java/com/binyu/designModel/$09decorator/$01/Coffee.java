package com.binyu.designModel.$09decorator.$01;

public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrize();
    }
}
