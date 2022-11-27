package com.binyu.designModel.$01singleton.$05;

/**
 * 错误的线程安全懒汉式
 * 结论：不能解决线程安全问题，完全错误的写法
 *
 */
public class SingletonTest5 {
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
    public static Singleton getInstance(){
        if(instance==null){
           synchronized (Singleton.class){
               instance=new Singleton();
           }
        }
        return instance;
    }

}
