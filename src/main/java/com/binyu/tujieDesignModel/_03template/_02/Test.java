package com.binyu.tujieDesignModel._03template._02;

import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        // 3.1 InputStream 的read()方法需要子类实现
        // 3.2 不希望子类对其进行重写
        // 3.3 protected
        // 3.4 因为display()【它就是模版方法】方法不能写在接口中
    }
}
