package com.binyu.tujieDesignModel._02adapter._01;

/**
 * 使用继承的适配器
 */
public class Client {
    public static void main(String[] args) {
        PrintBanner printBanner = new PrintBanner("我是一段文字");
        printBanner.printStrong();
        printBanner.printWeak();
    }
}
