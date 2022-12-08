package com.binyu.tujieDesignModel._04factory._01.idcard;

import com.binyu.tujieDesignModel._04factory._01.framework.Factory;
import com.binyu.tujieDesignModel._04factory._01.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IDCardFactory extends Factory {
    private int serial=100;
    private HashMap database=new HashMap();
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner,serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(new Integer(card.getSerial()),card.getOwner());
    }
    public HashMap getOwners(){
        return database;
    }
}
