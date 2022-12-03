package com.binyu.designModel.$08bridge.$01;

public class Client {
    public static void main(String[] args) {
        FoldedPhone phone1 = new FoldedPhone(new Xiaomi());
        phone1.open();
        phone1.close();
        phone1.call();
        UpRightPhone phone2= new UpRightPhone(new Xiaomi());
        phone2.open();
        phone2.close();
        phone2.call();
    }
}
