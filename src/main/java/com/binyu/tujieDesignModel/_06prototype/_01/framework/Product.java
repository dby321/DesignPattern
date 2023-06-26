package com.binyu.tujieDesignModel._06prototype._01.framework;

public abstract class Product implements Cloneable{
    public abstract void use(String s);
    public Product createClone() {
        Product product=null;
        try {
            product= (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return product;
    }
}
