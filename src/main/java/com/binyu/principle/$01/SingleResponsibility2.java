package com.binyu.principle.$01;

public class SingleResponsibility2 {


    /**
     * 1. 遵守了单一职责原则
     * 2. 但是这样改动很大，既分解了类，也修改了客户端
     * 3. 改进，直接修改Vehicle类
     * @param args
     */
    public static void main(String[] args) {
        RoadVehicle roadVehicle=new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");
        AirVehicle airVehicle=new AirVehicle();
        airVehicle.run("飞机");
    }


}

/**
 * 陆地上的交通工具类
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑...");
    }
}

/**
 * 天空上的交通工具类
 */
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天空上飞...");
    }
}

/**
 * 水面上的交通工具类
 */
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水面上航行...");
    }
}