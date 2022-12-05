package com.binyu.designModel.$13proxy.$02dynamicProxy;

import com.binyu.designModel.$13proxy.$01staticProxy.ITeacherDao;
import com.binyu.designModel.$13proxy.$01staticProxy.TeacherDao;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target=new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("proxyInstance="+proxyInstance);
        System.out.println("proxyInstance.getClass()="+proxyInstance.getClass());
        proxyInstance.teach();
    }
}
