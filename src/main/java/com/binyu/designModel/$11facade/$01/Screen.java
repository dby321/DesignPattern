package com.binyu.designModel.$11facade.$01;

public class Screen {
    private static final Screen instance=new Screen();
    public static Screen getInstance(){
        return instance;
    }
    private Screen(){

    }
    public void up(){
        System.out.println(instance.getClass().getName()+" up");
    }
    public void down(){
        System.out.println(instance.getClass().getName()+" down");
    }

}
