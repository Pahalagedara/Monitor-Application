package com.weatherApp.api.api.model;


import org.springframework.data.annotation.Id;

public class Sensor {
    @Id private String id;
    private String sensorId;
    private String timeStamp;
    private String value;

    public Sensor(String sensorId, String timeStamp, String value) {

        this.sensorId = sensorId;
        this.timeStamp = timeStamp;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
