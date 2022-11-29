package com.binyu.designModel.$02simpleFactory.$02;

import java.sql.SQLOutput;

public class SimpleFactory {

    /**
     * 根据orderType,返回对应的pizza对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza=null;
        if(orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza=new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(orderType.equals("pepper")){
            pizza=new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
    public static Pizza createPizza2(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza=null;
        if(orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza=new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(orderType.equals("pepper")){
            pizza=new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
