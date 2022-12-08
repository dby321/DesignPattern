package com.binyu.tujieDesignModel._03template._01;

public class Client {
    public static void main(String[] args) {
        AbstractDisplay d1 = new ChairDisplay('H');
        AbstractDisplay d2 =new StringDisplay("Hello world");
        d1.display();
        d2.display();
    }
}
