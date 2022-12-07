package com.binyu.designModel.$18observer.$02;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);
        weatherData.setData(10,100,3.3f);
        System.out.println("--------------------------------------");
        BaiduSite baiduSite=new BaiduSite();
        weatherData.registerObserver(baiduSite);
        weatherData.setData(20,200,43f);
    }
}
