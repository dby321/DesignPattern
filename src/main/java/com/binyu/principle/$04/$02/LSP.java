package com.binyu.principle.$04.$02;

public class LSP {
    /**
     * 创建一个更加基础的类,如果A和B还想有依赖关系，可以通过聚合、组合、依赖来解决问题
     * @param args
     */
    public static void main(String[] args) {

    }
}
class Base{

}
class A extends Base{
    public Integer fun1(Integer num1,Integer num2){
        return num1+num2;
    }
}
class B extends Base{
    private A a=new A();
    public Integer fun1(Integer num1,Integer num2){
        return num1-num2;
    }
    public Integer fun2(Integer num1,Integer num2){
        return a.fun1(num1,num2)+1;
    }
    public Integer fun3(Integer num1,Integer num2){
        return fun1(num1,num2)+1;
    }
}
