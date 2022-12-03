package com.binyu.designModel.$07adaptor.$01classAdaptor;

public class Client {
    /**
     * 类适配器：
     * 1. Java是单继承机制，所以类适配器需要继承src类这一点算一个缺点，因为这要求dst必须是接口，有一定局限性
     * 2. src类的方法在Adaptor中都会暴露出来，增加了使用成本
     * 3. 由于其继承了src类，所以他可以根据需求量重现src类的方法，使得Adaptor的灵活性增加了
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        phone.charge(new VoltageAdaptor());
    }
}
