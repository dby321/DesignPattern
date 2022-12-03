package com.binyu.designModel.$09decorator.$01;

public abstract class Drink {
    public String des;
    private float prize=0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(float prize) {
        this.prize = prize;
    }
    public abstract float cost();
}
