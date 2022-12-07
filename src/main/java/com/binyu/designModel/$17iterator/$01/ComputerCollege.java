package com.binyu.designModel.$17iterator.$01;

import java.util.Iterator;

public class ComputerCollege implements College{
    Department[] departments;
    int numOfDepartment=0;

    public ComputerCollege() {
        departments=new Department[5];
        departments[0]=new Department("部门0","描述0");
        departments[1]=new Department("部门1","描述1");
        departments[2]=new Department("部门2","描述2");
        numOfDepartment=3;
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment]=department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
