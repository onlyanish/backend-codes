package com.example.digitalparkingapp.service;

import com.example.digitalparkingapp.entity.ParkingSpace;
import com.example.digitalparkingapp.repository.ParkingSpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpaceService {

    @Autowired
    private ParkingSpaceRepository parkingSpaceRepository;

    public List<ParkingSpace> getAllParkingSpaces() {
        return parkingSpaceRepository.findAll();
    }

    public ParkingSpace getParkingSpaceById(int id) {
        return parkingSpaceRepository.findById(id).orElse(null);
    }

    public ParkingSpace saveParkingSpace(ParkingSpace parkingSpace) {
        return parkingSpaceRepository.save(parkingSpace);
    }

    public void deleteParkingSpace(int id) {
        parkingSpaceRepository.deleteById(id);
    }
}
