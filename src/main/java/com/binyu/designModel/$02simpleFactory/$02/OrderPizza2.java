package com.binyu.designModel.$02simpleFactory.$02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {

    Pizza pizza=null;
    public void setFactory(){
        String orderType="";
        do{
            orderType=getType();
            pizza=SimpleFactory.createPizza2(orderType);
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
    public OrderPizza2(){
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
