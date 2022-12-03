package com.binyu.designModel.$07adaptor.$02objectAdaptor;

import com.binyu.designModel.$07adaptor.$01classAdaptor.Voltage220V;

public class VoltageAdaptor implements IVoltage5V{
    private Voltage220V voltage220V;

    public VoltageAdaptor(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src= this.voltage220V.output220V();
        int dst=src/44;
        return dst;
    }
}
