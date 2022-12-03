package com.binyu.designModel.$11facade.$01;

public class PopcornMachine {
    private static final PopcornMachine instance=new PopcornMachine();
    public static PopcornMachine getInstance(){
        return instance;
    }
    private PopcornMachine(){

    }
    public void on(){
        System.out.println(instance.getClass().getName()+" on");
    }
    public void off(){
        System.out.println(instance.getClass().getName()+" off");
    }
    public void pop(){
        System.out.println(instance.getClass().getName()+" pop");
    }

}
