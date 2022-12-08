package com.binyu.tujieDesignModel._05singleton._02;

/**
 * 习题5.1
 */
public class Client {
    public static void main(String[] args) {
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        System.out.println(ticketMaker1.getNextTicketNumber());
        System.out.println(ticketMaker1.getNextTicketNumber());
        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        System.out.println(ticketMaker2.getNextTicketNumber());

    }
}
