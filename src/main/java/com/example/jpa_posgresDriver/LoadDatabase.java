package com.example.jpa_posgresDriver;


import com.example.jpa_posgresDriver.Model.RoadVehicle;
import com.example.jpa_posgresDriver.VehicleRepo.VehicleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(VehicleRepository repository) {

        return args -> {
            log.info("Preloading " + 	repository.save(new RoadVehicle("Kia Cerato","C", "KIA", "Car","Gasonlie", "29-XABCD",4, 5, 100,4)));

        };
    }
}
