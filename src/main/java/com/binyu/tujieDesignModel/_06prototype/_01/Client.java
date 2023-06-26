package com.binyu.tujieDesignModel._06prototype._01;

import com.binyu.tujieDesignModel._06prototype._01.framework.Product;

public class Client {
    public static void main(String[] args) {
        MessageBox messageBox = new MessageBox();
        Product clone = messageBox.createClone();
        System.out.println(messageBox==clone);
        messageBox.use("hahaha");
        clone.use("lalala");
    }
}
