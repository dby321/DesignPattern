package com.binyu.principle.$03.$01;

public class DependencyInversion {
    /**
     * 如果要获取的对象是微信，短信登，则需要新增类，同事Person也要增加对应的接收方法
     * 解决思路：引入一个抽象接口IReceiver
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
class Email{
    public String getInfo(){
        return "电子邮件信息：hello world";
    }
}
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
