package com.weatherApp.api.api;

import com.weatherApp.api.api.model.Sensor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SensorController {
    InMemorySensorRepository inMemorySensorRepository=new InMemorySensorRepository();

    @PostMapping("/setSensor")
    public String setSensor(String sensorId, String value){
       String state= inMemorySensorRepository.setSensor( sensorId,value);

        return state;
    }



    @GetMapping("/getTempHistory")
    public List<Sensor> getTempHistory(){
        List<Sensor> sensors=new ArrayList<>();

        return sensors;
    }
    @GetMapping("/getHumidityHistory")
    public List<Sensor>  getHumidityHistory(){
        List<Sensor> sensors=new ArrayList<>();

        return sensors;
    }

    @GetMapping("/getWindHistory")
    public List<Sensor> getWindHistory(){
        List<Sensor> sensors=new ArrayList<>();

        return sensors;
    }


    @GetMapping("/getTodayTemp")
    public Sensor getTodayTemp(){
        Sensor sensor=null;
        return sensor;
    }
    @GetMapping("/getTodayHumidity")
    public Sensor getTodayHumidity(){
        Sensor sensor=null;
        return sensor;
    }
    @GetMapping("/getTodayWind")
    public Sensor getTodayWind(){
        Sensor sensor=null;
        return sensor;
    }


}
