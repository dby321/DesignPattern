package com.binyu.designModel.$02simpleFactory.$01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(){
        Pizza pizza=null;
        String orderType;//订购pizza的类型
        do{
            orderType=getType();
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
            else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }
    private String getType(){
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str=bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
