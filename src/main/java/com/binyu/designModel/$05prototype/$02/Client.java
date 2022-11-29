package com.binyu.designModel.$05prototype.$02;

public class Client {


    /**
     * 原型模式
     * 方便拓展,不过此处是 浅拷贝
     * @param args
     */
    public static void main(String[] args) {
        Sheep sheep1=new Sheep("tom",10,"白色");
        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        Sheep sheep4 = (Sheep) sheep1.clone();
        Sheep sheep5 = (Sheep) sheep1.clone();
        Sheep sheep6 = (Sheep) sheep1.clone();
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        System.out.println(sheep6);
    }
}
