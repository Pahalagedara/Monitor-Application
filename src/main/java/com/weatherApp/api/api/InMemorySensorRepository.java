package com.weatherApp.api.api;

import com.weatherApp.api.api.model.Sensor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class InMemorySensorRepository implements SensorRepository{


    @Override
    public String setSensor(String sensorId, String value) {
        String timeStamp;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        timeStamp=dtf.format(dateTime);




        return "successful";
    }

    @Override
    public List<Sensor> getTempHistory() {
        return null;
    }

    @Override
    public List<Sensor> getHumidityHistory() {
        return null;
    }

    @Override
    public List<Sensor> getWindHistory() {
        return null;
    }

    @Override
    public Sensor getTodayTemp() {
        return null;
    }

    @Override
    public Sensor getTodayHumidity() {
        return null;
    }

    @Override
    public Sensor getTodayWind() {
        return null;
    }
}
