package com.example.digitalparkingapp.repository;

import com.example.digitalparkingapp.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
