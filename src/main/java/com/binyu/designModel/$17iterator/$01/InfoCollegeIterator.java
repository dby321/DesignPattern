package com.binyu.designModel.$17iterator.$01;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    List<Department> departments;
    int position=0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(position>=departments.size()||departments.get(position)==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department=departments.get(position);
        position++;
        return department;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
