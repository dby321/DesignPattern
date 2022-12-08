package com.binyu.tujieDesignModel._05singleton._03;

/**
 * 习题5.2
 */
public class Client {
    public static void main(String[] args) {
        Triple instance1 = Triple.getInstance(1);
        Triple instance2 = Triple.getInstance(2);
        Triple instance3 = Triple.getInstance(1);
        System.out.println(instance1==instance3);
        System.out.println(instance1.getClass());
    }
}
