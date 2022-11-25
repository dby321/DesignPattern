package com.binyu.principle.$01;

public class SingleResponsibility3 {


    /**
     * 1. 这种修改只是在原来的类上增加了新的方法
     * 2. 在类的级别没有遵守单一职责，在方法的级别遵守了单一职责
     * @param args
     */
    public static void main(String[] args) {
        Vehicle2 vehicle2=new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }


}

class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑...");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle+"在天空上飞...");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+"在水中游...");
    }


}