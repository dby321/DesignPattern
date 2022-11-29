package com.binyu.designModel.$06builder.$02;

public class Client {
    /**
     * 二十三种设计模式是死的，人是活的，
     * @param args
     */
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouseBuilder());
        House house1 = houseDirector.buildHouse("【地基】", "【墙】", "【屋顶】");
        houseDirector.setHouseBuilder(new BigHouseBuilder());
        House house2 = houseDirector.buildHouse("【大房子地基】", "【大房子墙】", "【大房子屋顶");
    }
}
