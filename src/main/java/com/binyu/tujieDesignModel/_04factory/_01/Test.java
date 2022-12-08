package com.binyu.tujieDesignModel._04factory._01;

import com.binyu.tujieDesignModel._04factory._01.framework.Factory;
import com.binyu.tujieDesignModel._04factory._01.framework.Product;
import com.binyu.tujieDesignModel._04factory._01.idcard.IDCardFactory;

public class Test {
    public static void main(String[] args) {
        Factory factory=new IDCardFactory();
        Product card1=factory.create("小明");
        Product card2=factory.create("小红");
        card1.use();
        card2.use();

    }
}
