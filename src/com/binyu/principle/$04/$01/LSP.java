package com.binyu.principle.$04.$01;

public class LSP {
    /**
     * 继承具有侵入性，不要频繁重写父类的方法
     * @param args
     */
    public static void main(String[] args) {

    }
}
class A{
    public Integer fun1(Integer num1,Integer num2){
        return num1+num2;
    }
}
class B extends A{
    public Integer fun1(Integer num1,Integer num2){
        return num1-num2;
    }
    public Integer fun2(Integer num1,Integer num2){
        return fun1(num1,num2)+1;
    }
}
