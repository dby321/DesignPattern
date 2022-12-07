package com.binyu.designModel.$18observer.$01;

import lombok.Data;

@Data
public class WeatherData {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions){
        this.currentConditions = currentConditions;
    }

    public void dataChange(){
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    //当数据更新时，就调用setData
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


}
