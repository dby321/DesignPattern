package com.binyu.designModel.$08bridge.$01;

public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折疊样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折疊样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折疊样式手机");
    }
}
