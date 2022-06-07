package com.example.jpa_posgresDriver.VehicleRepo;

import com.example.jpa_posgresDriver.Model.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {


        List<Vehicle> findByName(String name);
        Vehicle findById(long iD);


}
