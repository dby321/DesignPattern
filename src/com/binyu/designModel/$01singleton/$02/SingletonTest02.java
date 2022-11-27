package com.binyu.designModel.$01singleton.$02;

/**
 * 静态常量饿汉式2
 * 优点：写法简单，在类装载的时候就完成了实例化，避免了线程同步问题
 * 缺点：在类装载的时候就完成实例化，没有实现懒加载。如果始终没有使用过这个实例，则会造成内存的浪费
 *
 * 这种方式基于classloader机制避免了多线程的同步问题，不过，instance在类装载时就实例化，在单例模式中大多数都是调用
 * getInstance()，但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，这时达不到
 * 懒加载。
 *
 * 结论：这种单例模式可用，可能造成内存浪费。
 */
public class SingletonTest02 {
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
    /**
     * 1. 构造器私有化，外部不能new
     */
    private Singleton(){

    }

    /**
     * 2.本类的内部创建对象实例
     */
    private final static Singleton instance;

    /**
     * 静态代码块只会执行一次
     */
    static{
        instance=new Singleton();
    }

    /**
     * 3. 提供一个公有的静态方法，返回
     * @return
     */
    public static Singleton getInstance(){
        return instance;
    }
}
