package com.example.digitalparkingapp.repository;

import com.example.digitalparkingapp.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
