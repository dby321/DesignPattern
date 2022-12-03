package com.binyu.designModel.$11facade.$01;

public class Projecter {
    private static final Projecter instance=new Projecter();
    public static Projecter getInstance(){
        return instance;
    }
    private Projecter(){

    }
    public void on(){
        System.out.println(instance.getClass().getName()+" on");
    }
    public void off(){
        System.out.println(instance.getClass().getName()+" off");
    }
    public void focus(){
        System.out.println(instance.getClass().getName()+" focus");
    }
}
