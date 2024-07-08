package com.example.digitalparkingapp.repository;

import com.example.digitalparkingapp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
