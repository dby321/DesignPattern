package com.binyu.designModel.$10composite.$01;

public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学", "中国顶级大学");
        College college1 = new College("计算机学院", "计算机学院");
        College college2 = new College("信息工程学院", "信息工程学院");
        university.add(college1);
        university.add(college2);
        college1.add(new Department("软件工程","不错不错真不错"));
        college1.add(new Department("计算机科学与技术","不错不错真不错"));
        university.print();
    }
}
