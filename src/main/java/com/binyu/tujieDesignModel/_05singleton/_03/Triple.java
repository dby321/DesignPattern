package com.binyu.tujieDesignModel._05singleton._03;


public class Triple {
    private Triple(){

    }
    private static Triple[] triples=new Triple[3];
    static{
        for(int i=0;i<3;i++){
            triples[i]=new Triple();
        }
    }
    public static Triple getInstance(int id){
        return triples[id];
    }
}
