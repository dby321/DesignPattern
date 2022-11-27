package com.binyu.designModel.$03factoryMethod.$01.order;



import com.binyu.designModel.$03factoryMethod.$01.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    Pizza pizza=null;
    public void setFactory(){
        String orderType="";
        do{
            orderType=getType();
            pizza= createPizza(orderType);
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

    public abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        setFactory();
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
