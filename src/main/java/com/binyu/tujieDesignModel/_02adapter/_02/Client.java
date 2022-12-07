package com.binyu.tujieDesignModel._02adapter._02;

public class Client {
    public static void main(String[] args) {
        PrintBanner printBanner = new PrintBanner("我也是一段文字");
        printBanner.printStrong();
        printBanner.printWeak();
    }
}
