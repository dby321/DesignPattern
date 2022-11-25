package com.binyu.principle.$03.$02;

public class DependencyInversion {
    /**
     * 如果要获取的对象是微信，短信登，则需要新增类，同事Person也要增加对应的接收方法
     * 解决思路：引入一个抽象接口IReceiver
     * @param args
     */
    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email());
        person.receive(new WeiXinEmail());
    }
}
interface IReceiver{
    public String getInfo();
}
class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息：hello world";
    }
}
class WeiXinEmail implements IReceiver{

    @Override
    public String getInfo() {
        return "微信信息：hello world";
    }
}
class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
