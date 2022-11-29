package com.binyu.designModel.$05prototype.$01;

public class Client {


    /**
     * 传统方式:
     * 优点：好理解，易操作
     * 缺点：在创建新对象时，总是要重新获取原始对象的属性，如果创建的对象比较复杂是，效率较低
     * 总是需要重新初始化对象，而不是动态地获取对象运行时的状态，不够灵活
     * 改进思路：clone()
     * @param args
     */
    public static void main(String[] args) {
        Sheep sheep1=new Sheep("tom",10,"白色");
        Sheep sheep2=new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep3=new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep4=new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep5=new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep6=new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        System.out.println(sheep6);
    }
}
