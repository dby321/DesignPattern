package com.binyu.designModel.$17iterator.$01;

import java.util.Iterator;

public interface College {
    public String getName();
    public void addDepartment(String name,String desc);
    public Iterator createIterator();
}
