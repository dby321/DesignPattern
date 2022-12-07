package com.binyu.tujieDesignModel._02adapter._03;

import java.io.*;
import java.util.Date;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String filename) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        super.load(fileInputStream);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(filename);
        String comments="written by FileProperties";
        super.store(fileOutputStream,comments);
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key,"");
    }
}
