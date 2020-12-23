package com.weatherApp.api.api.db;

import com.weatherApp.api.api.model.Sensor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel="sensor",path="sensor")
public interface SensorRepository extends MongoRepository {
    List<Sensor> findSensorDataBySensorId (@Param("sensorId") String sensorId);
}
