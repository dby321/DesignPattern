package com.binyu.designModel.$06builder.$02;

public class HouseDirector {
    HouseBuilder houseBuilder=null;
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House buildHouse(String basic,String walls,String roof){
        this.houseBuilder.buildBasic(basic);
        System.out.println("房子建地基 END");
        this.houseBuilder.buildWalls(walls);
        System.out.println("房子砌墙 END");
        this.houseBuilder.roofed(roof);
        System.out.println("房子封顶 END");
        return this.houseBuilder.buildHouse();
    }
}
