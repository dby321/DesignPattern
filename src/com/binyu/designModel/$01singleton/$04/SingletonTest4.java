package com.binyu.designModel.$01singleton.$04;

/**
 * 线程安全懒汉式 低效版
 * 优点：解决了线程不安全的问题，也实现了懒加载
 * 缺点：效率太低，并发差
 * 结论：在实际开发中，不推荐使用这种方式
 *
 */
public class SingletonTest4 {
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
    private static Singleton instance;
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
