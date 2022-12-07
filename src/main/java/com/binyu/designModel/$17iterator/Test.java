package com.binyu.designModel.$17iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> arrList=new ArrayList<>();
        arrList.add("Jack");
        Iterator iterator= arrList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
