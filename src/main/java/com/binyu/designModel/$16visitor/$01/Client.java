package com.binyu.designModel.$16visitor.$01;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure=new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.display(new Success());

    }
}
