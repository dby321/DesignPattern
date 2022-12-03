package com.binyu.designModel.$07adaptor.$01classAdaptor;

/**
 * 适配器类
 */
public class VoltageAdaptor extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int scrV=output220V();
        int dstV=scrV/44;
        return dstV;
    }
}
