package com.binyu.designModel.$01singleton.$07;

/**
 * 静态内部类版
 * 说明：采用类的装载机制来保证初始化实例时只有一个线程，静态内部类方式在Singleton类被装载时不会立即实例化
 * 而是在需要实例化时，调用getInstance(),才会装载SingletonInstance类，从而完成Singleton的实例化。
 * 类的静态属性只会在第一次加载类的时候初始化，所以JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程
 * 是无法进入的。
 * 优点：避免了线程不安全，利用静态内部类特点实现了懒加载，效率高
 * 结论：推荐使用
 *
 */
public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton singleton1= Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();
        System.out.println(singleton1==singleton2);
        // hashcode相同的对象不一定是同一个对象，这里只是打印测试一下
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton{
    private Singleton(){

    }
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
