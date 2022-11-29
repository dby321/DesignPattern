package com.binyu.designModel.$06builder.$02;

public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic(String basic) {
        super.buildBasic(basic);
        System.out.println("普通房子建地基...");
    }

    @Override
    public void buildWalls(String walls) {
        super.buildWalls(walls);
        System.out.println("普通房子砌墙...");
    }

    @Override
    public void roofed(String roof) {
        super.roofed(roof);
        System.out.println("普通房子封顶...");
    }
}
