package com.binyu.tujieDesignModel._06prototype._01;

import com.binyu.tujieDesignModel._06prototype._01.framework.Product;

public class UnderlinePen extends Product {
    @Override
    public void use(String s) {
        System.out.println("我也不重要，这时下划线："+this);
    }


}
