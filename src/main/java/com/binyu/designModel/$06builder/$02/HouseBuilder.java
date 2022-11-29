package com.binyu.designModel.$06builder.$02;

public abstract class HouseBuilder {
    protected House house=new House();
    public void buildBasic(String basic){
        this.house.setBasic(basic);
        System.out.println("房子建地基 START");
    }
    public void buildWalls(String walls){
        this.house.setWalls(walls);
        System.out.println("房子砌墙 START");
    }
    public void roofed(String roof){
        this.house.setRoof(roof);
        System.out.println("房子封顶 START");
    }
    public House buildHouse(){
        return this.house;
    }

}
