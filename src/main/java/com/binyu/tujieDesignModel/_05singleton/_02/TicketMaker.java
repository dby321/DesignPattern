package com.binyu.tujieDesignModel._05singleton._02;

public class TicketMaker {
    private int ticket=1000;
    private static final TicketMaker instance=new TicketMaker();
    private TicketMaker(){

    }
    public static TicketMaker getInstance(){
        return instance;
    }
    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
