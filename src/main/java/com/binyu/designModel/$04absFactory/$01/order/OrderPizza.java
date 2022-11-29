package com.binyu.designModel.$04absFactory.$01.order;

import com.binyu.designModel.$04absFactory.$01.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory){
        String orderType="";
        Pizza pizza=null;
        this.factory=factory;
        do{
            orderType=getType();
            pizza= factory.createPizza(orderType);
            // 输出pizza
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购pizza失败");
                break;
            }
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
