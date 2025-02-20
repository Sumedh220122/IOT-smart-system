package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Reading;

import java.time.Instant;
import java.util.List;

public interface ReadingRepository extends MongoRepository<Reading, String> {
    List<Reading> findByDeviceIdAndTimestampBetween(String deviceId, Instant start, Instant end);
} 