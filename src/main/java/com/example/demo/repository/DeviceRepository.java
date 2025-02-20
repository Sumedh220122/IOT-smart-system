package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Device;

import java.util.List;

public interface DeviceRepository extends MongoRepository<Device, String> {
    List<Device> findByOwnerId(String ownerId);
    Device findByDeviceId(String deviceId);
} 