package com.binyu.designModel.$11facade.$01;

public class Stereo {
    private static final Stereo instance=new Stereo();
    public static Stereo getInstance(){
        return instance;
    }
    private Stereo(){

    }
    public void on(){
        System.out.println(instance.getClass().getName()+" on");
    }
    public void off(){
        System.out.println(instance.getClass().getName()+" off");
    }
    public void up(){
        System.out.println(instance.getClass().getName()+" up");
    }

}
