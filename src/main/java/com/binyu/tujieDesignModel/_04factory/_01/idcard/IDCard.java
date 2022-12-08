package com.binyu.tujieDesignModel._04factory._01.idcard;

import com.binyu.tujieDesignModel._04factory._01.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;
    IDCard(String owner,int serial) {
        System.out.println("制作"+owner+"的ID卡");
        this.owner = owner;
        this.serial=serial;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"("+serial+")"+"的ID卡");
    }



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
}
