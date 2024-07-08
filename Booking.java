package com.example.digitalparkingapp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "space_id")
    private ParkingSpace parkingSpace;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Getters and Setters
}
