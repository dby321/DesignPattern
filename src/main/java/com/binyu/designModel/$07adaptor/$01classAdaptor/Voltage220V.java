package com.binyu.designModel.$07adaptor.$01classAdaptor;

/**
 * 被适配类
 */
public class Voltage220V {
    public int output220V(){
        int src=220;
        System.out.println("U="+src+"V");
        return src;
    }
}
