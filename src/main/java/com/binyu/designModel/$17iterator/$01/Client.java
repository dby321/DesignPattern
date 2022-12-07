package com.binyu.designModel.$17iterator.$01;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        ComputerCollege computerCollege = new ComputerCollege();
        computerCollege.addDepartment("部门3","描述3");
        Iterator iterator = computerCollege.createIterator();
        while(iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department);
        }

    }
}
