package com.binyu.designModel.$09decorator.$01;

public class Client {
    public static void main(String[] args) {
        // 用装饰者模式下订单
        LongBlackCoffee longBlackCoffee = new LongBlackCoffee();
        System.out.println(longBlackCoffee.cost());
        System.out.println(longBlackCoffee.getDes());
        MilkDecorator milkDecorator = new MilkDecorator(longBlackCoffee);
        System.out.println(milkDecorator.cost());
        System.out.println(milkDecorator.getDes());
        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(milkDecorator);
        System.out.println(chocolateDecorator.cost());
        System.out.println(chocolateDecorator.getDes());
        ChocolateDecorator chocolateDecorator1 = new ChocolateDecorator(chocolateDecorator);
        System.out.println(chocolateDecorator1.cost());
        System.out.println(chocolateDecorator1.getDes());
        System.out.println("----");
        MilkDecorator milkDecorator1 = new MilkDecorator(new ChocolateDecorator(new LongBlackCoffee()));
        System.out.println(milkDecorator1.cost());
        System.out.println(milkDecorator1.getDes());
    }
}
