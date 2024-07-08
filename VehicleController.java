package com.example.digitalparkingapp.controller;

import com.example.digitalparkingapp.entity.Vehicle;
import com.example.digitalparkingapp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable int id) {
        return vehicleService.getVehicleById(id);
    }

    @PostMapping
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable int id) {
        vehicleService.deleteVehicle(id);
    }
}
