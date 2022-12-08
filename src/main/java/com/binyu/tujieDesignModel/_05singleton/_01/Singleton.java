package com.binyu.tujieDesignModel._05singleton._01;

public class Singleton {
    private static final Singleton singleton=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return singleton;
    }
}
