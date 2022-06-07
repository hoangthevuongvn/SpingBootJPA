package com.example.jpa_posgresDriver;

import com.example.jpa_posgresDriver.Model.RoadVehicle;
import com.example.jpa_posgresDriver.Model.Vehicle;
import com.example.jpa_posgresDriver.Model.WaterwayVehicle;
import com.example.jpa_posgresDriver.VehicleRepo.VehicleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JpaPosgresDriverApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(JpaPosgresDriverApplication.class);

	@Autowired
	private VehicleRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(JpaPosgresDriverApplication.class, args);
	}




	@Override
	public void run(String... args) throws Exception {
		Scanner input = new Scanner(System.in);
		log.info("StartApplication...");
		repository.save(new RoadVehicle("Kia Cerato","C", "KIA", "Car","Gasonlie", "29-XABCD",4, 5, 100,4));
		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));

		System.out.print("Enter new Vehicle: ");

		System.out.print("Enter Name: ");
		String Name = input.nextLine();

		System.out.print("Enter Model: ");
		String Model = input.nextLine();

		System.out.print("Enter Brand: ");
		String Brand = input.nextLine();

		System.out.print("Enter Type: ");
		String Type = input.nextLine();

		System.out.print("Enter FuelType: ");
		String FuelType = input.nextLine();

		System.out.print("Enter BottomType: ");
		String BottomType = input.nextLine();
		System.out.print("Enter LicensePlate: ");
		String LicensePlate = input.nextLine();

		System.out.print("Enter NumberSeat: ");
		int NumberSeat = input.nextInt();

		System.out.print("Enter MaxPower: ");
		int MaxPower = input.nextInt();

		repository.save(new WaterwayVehicle(Name,Model,Brand, Type, FuelType, BottomType, LicensePlate, NumberSeat, MaxPower));
//		repository.deleteById((long)10);

		log.info("-------------------------------");
		for (Vehicle vehicle : repository.findAll()) {
			log.info(vehicle.toString());
		}
		log.info("");
	}
	}


