package com.binyu.designModel.$16visitor.$01;

public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
