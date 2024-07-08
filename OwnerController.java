package com.example.digitalparkingapp.controller;

import com.example.digitalparkingapp.entity.Owner;
import com.example.digitalparkingapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

    @GetMapping("/{id}")
    public Owner getOwnerById(@PathVariable int id) {
        return ownerService.getOwnerById(id);
    }

    @PostMapping
    public Owner saveOwner(@RequestBody Owner owner) {
        return ownerService.saveOwner(owner);
    }

    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable int id) {
        ownerService.deleteOwner(id);
    }
}
