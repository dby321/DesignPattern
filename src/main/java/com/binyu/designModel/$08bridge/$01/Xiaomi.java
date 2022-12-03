package com.binyu.designModel.$08bridge.$01;

public class Xiaomi implements Brand {

    @Override
    public void open() {
        System.out.println("Xiaomi open");
    }

    @Override
    public void close() {
        System.out.println("Xiaomi close");
    }

    @Override
    public void call() {
        System.out.println("Xiaomi call");
    }
}
