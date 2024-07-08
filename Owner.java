package com.example.digitalparkingapp.entity;

import javax.persistence.*;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ownerId;
    private String name;
    private String contactNumber;
    private String email;

    // Getters and Setters
}
