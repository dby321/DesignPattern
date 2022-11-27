package com.binyu.designModel.$01singleton.$03;

/**
 * 线程不安全懒汉式
 * 优点：起到了懒加载的效果，
 * 缺点：只能在单线程下使用，如果在多线程下，可能会有多个线程进入if(instance==null)的语句块，
 * 这时会产生多个实例。
 * 结论：实际开发中，不要使用这种方式。
 *
 */
public class SingletonTest3 {
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
            instance=new Singleton();
        }
        return instance;
    }

}
