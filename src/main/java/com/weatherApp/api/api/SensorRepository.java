package com.weatherApp.api.api;

import com.weatherApp.api.api.model.Sensor;

import java.util.List;

public interface SensorRepository {

    public String setSensor(String sensorId,String value);
    public List<Sensor> getTempHistory() ;
    public List<Sensor>  getHumidityHistory();
    public List<Sensor> getWindHistory();

    public Sensor getTodayTemp();
    public Sensor getTodayHumidity();
    public Sensor getTodayWind();


}
