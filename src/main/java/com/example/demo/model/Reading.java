package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import java.time.Instant;

@Data
@Document(collection = "readings")
public class Reading {
    @Id
    private String id;
    
    @Indexed
    private String deviceId;
    
    @Indexed
    private Instant timestamp;
    
    private String type;
    private Object value;
    private String unit;
    private Instant createdAt;
} 