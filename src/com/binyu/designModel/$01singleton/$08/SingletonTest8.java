package com.binyu.designModel.$01singleton.$08;

/**
 * 枚举版
 * 优点：借助JDK1.5添加的枚举来实现单例模式，不仅能避免多线程问题，而且还能防止反序列化重新创建新的对象
 * 结论：Effective Java作者提倡的方式，推荐使用
 */
public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton singleton1= Singleton.INSTANCE;
        Singleton singleton2= Singleton.INSTANCE;
        System.out.println(singleton1==singleton2);
        // hashcode相同的对象不一定是同一个对象，这里只是打印测试一下
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("say OK");
    }
}

