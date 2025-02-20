package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Data
@Document(collection = "devices")
public class Device {
    @Id
    private String id;
    
    private String deviceId;
    private String name;
    private DeviceType type;
    private String location;
    private DeviceStatus status;
    private Reading lastReading;
    private String ownerId;
    private Instant createdAt;
    private Instant updatedAt;

    public enum DeviceType {
        THERMOSTAT, LIGHT, SMART_METER, SECURITY_CAMERA
    }

    public enum DeviceStatus {
        ONLINE, OFFLINE
    }
} 