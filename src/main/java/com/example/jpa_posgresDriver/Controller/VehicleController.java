package com.example.jpa_posgresDriver.Controller;

import com.example.jpa_posgresDriver.Model.Vehicle;
import com.example.jpa_posgresDriver.VehicleRepo.VehicleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class VehicleController {
    private final VehicleRepository repository;

    public VehicleController(VehicleRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/vehicle")
    List<Vehicle> all() {
        return (List<Vehicle>) repository.findAll();
    }

    @GetMapping("/vehicle{id}")
    Vehicle one(@PathVariable long id) {
        return repository.findById(id);
    }

    @PostMapping("/vehicle")
    Vehicle newVehicle(@RequestBody Vehicle newVehicle){
        return repository.save(newVehicle);
    }
    @DeleteMapping("/vehicle")
    void DeleteVehicle(@PathVariable long id){
        repository.deleteById(id);
    }
}
