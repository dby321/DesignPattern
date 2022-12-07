package com.binyu.tujieDesignModel._02adapter._03;

import java.io.File;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        FileIO f=new FileProperties();
        File file = new File("file.txt");
        File file1 = new File("/file.txt");
        System.out.println(file.getAbsolutePath());
        String parentPath="src/main/java/com/binyu/tujieDesignModel/_02adapter/_03/";
        File file2=new File(parentPath+"file.txt");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.exists());
        System.out.println("-----------------------------");
        try {
            f.readFromFile(parentPath+"file.txt");
            f.setValue("year","2004");
            f.setValue("month","4");
            f.setValue("day","21");
            f.writeToFile(parentPath+"newfile.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
