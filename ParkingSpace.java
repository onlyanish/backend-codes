package com.example.digitalparkingapp.entity;

import javax.persistence.*;

@Entity
public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int spaceId;
    private String location;
    private boolean isOccupied;

    // Getters and Setters
}
