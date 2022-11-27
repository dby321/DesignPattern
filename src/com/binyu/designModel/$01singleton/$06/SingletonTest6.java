package com.binyu.designModel.$01singleton.$06;

/**
 * 线程安全的懒汉式 双重检查高效版
 * 优点：既线程安全，也实现了懒加载，同时效率高
 * 缺点：无
 * 结论：实际开发推荐使用。
 */
public class SingletonTest6 {
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
    private static volatile Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance==null){
           synchronized (Singleton.class){
               if(instance==null){
                   instance=new Singleton();
               }
           }
        }
        return instance;
    }

}
