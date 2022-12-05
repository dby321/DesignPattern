package com.binyu.designModel.$13proxy.$03cglibProxy;


public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        String hello = proxyInstance.teach();
        System.out.println(hello);
    }
}
