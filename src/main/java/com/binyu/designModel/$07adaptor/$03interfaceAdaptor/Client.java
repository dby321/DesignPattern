package com.binyu.designModel.$07adaptor.$03interfaceAdaptor;




public class Client {

    public static void main(String[] args) {
        AbstractAdaptor adaptorImpl = new AbstractAdaptor() {
            @Override
            public void m1() {
                super.m1();
                System.out.println("重写m1");
            }
        };
        adaptorImpl.m1();
    }
}
