package com.example.digitalparkingapp.repository;

import com.example.digitalparkingapp.entity.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Integer> {
}
