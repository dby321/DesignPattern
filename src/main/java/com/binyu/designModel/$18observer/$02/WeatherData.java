package com.binyu.designModel.$18observer.$02;

import com.binyu.designModel.$18observer.$01.CurrentConditions;
import lombok.Data;

import java.util.ArrayList;


@Data
public class WeatherData implements Subject{
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;
    public WeatherData(){
        observers=new ArrayList<>();
    }

    public void dataChange(){
        notifyObserver();
    }

    //当数据更新时，就调用setData
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(this.temperature,this.pressure,this.humidity);
        }
    }
}
