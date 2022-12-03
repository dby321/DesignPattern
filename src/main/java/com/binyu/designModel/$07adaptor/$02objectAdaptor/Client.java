package com.binyu.designModel.$07adaptor.$02objectAdaptor;


import com.binyu.designModel.$07adaptor.$01classAdaptor.Voltage220V;

public class Client {

    public static void main(String[] args) {
        System.out.println("对象适配器模式");
        Phone phone = new Phone();
        phone.charge(new VoltageAdaptor(new Voltage220V()));
    }
}
