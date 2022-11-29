package com.binyu.principle.$01;

public class SingleResponsibility1 {


    /**
     * 违反了单一职责原则，解决方法只用把Vehicle分成两个类
     * @param vehicle
     */
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }


}

/**
 * 交通工具类
 */
class Vehicle{

    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑...");
    }
}
