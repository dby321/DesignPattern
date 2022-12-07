package com.binyu.designModel.$16visitor.$01;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人评价失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人评价失败");
    }
}
