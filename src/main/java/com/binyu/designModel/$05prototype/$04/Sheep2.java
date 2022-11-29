package com.binyu.designModel.$05prototype.$04;

import java.io.Serializable;

public class Sheep2 implements Cloneable, Serializable {
    @Override
    protected Sheep2 clone() throws CloneNotSupportedException {
        return (Sheep2) super.clone();
    }
}
