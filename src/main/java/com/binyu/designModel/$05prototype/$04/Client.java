package com.binyu.designModel.$05prototype.$04;

public class Client {


    /**
     * 原型模式
     * 方便拓展 此处是 深拷贝:重写clone()或者实现序列化
     * @param args
     */

    public static void main(String[] args) {
        Sheep sheep1=new Sheep("tom",10,"白色");
        sheep1.setFriendSheep(new Sheep2());
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

        Sheep sheep7 = (Sheep) sheep1.deepClone();
        System.out.println(sheep7);
    }
}
