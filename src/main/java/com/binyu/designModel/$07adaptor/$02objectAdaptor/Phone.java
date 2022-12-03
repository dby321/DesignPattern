package com.binyu.designModel.$07adaptor.$02objectAdaptor;

public class Phone {
    public void charge(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V()==5){
            System.out.println("可以充电");
        }else if(iVoltage5V.output5V()>5){
            System.out.println("电压过高，不能充电");
        }
    }
}