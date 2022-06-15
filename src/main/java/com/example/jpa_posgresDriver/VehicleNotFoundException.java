package com.example.jpa_posgresDriver;

public class VehicleNotFoundException extends RuntimeException {

    VehicleNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
