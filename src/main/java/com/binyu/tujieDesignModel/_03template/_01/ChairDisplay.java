package com.binyu.tujieDesignModel._03template._01;

public class ChairDisplay extends AbstractDisplay{
    private char ch;

    public ChairDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
