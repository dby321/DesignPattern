package com.binyu.tujieDesignModel._06prototype._01;

import com.binyu.tujieDesignModel._06prototype._01.framework.Product;

public class MessageBox extends Product {

    @Override
    public void use(String s) {
        System.out.println("我不重要,这时消息箱："+this);
    }


}
