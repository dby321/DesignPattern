package com.binyu.designModel.$13proxy.$02dynamicProxy;



public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
