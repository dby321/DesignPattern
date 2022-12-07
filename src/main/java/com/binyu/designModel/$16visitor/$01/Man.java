package com.binyu.designModel.$16visitor.$01;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
