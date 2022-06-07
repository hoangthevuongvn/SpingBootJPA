package com.example.jpa_posgresDriver.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoadVehicle extends Vehicle {
    public int wheel;
    public int numberEngine;
    public String fuelType;
    public RoadVehicle(String name, String model, String brand, String type, String fuelType, String licensePlate, int numberEngine ,int numberSeat , int maxPower, int wheel) {
        super(name, model, brand, type, licensePlate, numberSeat, maxPower );
        this.wheel = wheel;
        this.numberEngine = numberEngine;
        this.fuelType = fuelType;
    }

    public RoadVehicle() {

    }


    @Override
    public void Transport() {
    }

    @Override
    public long getiD() {
        return super.getiD();
    }

    @Override
    public void setiD(int iD) {
        super.setiD(iD);
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getNumberEngine() {
        return numberEngine;
    }

    public void setNumberEngine(int numberEngine) {
        this.numberEngine = numberEngine;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getLicensePlate() {
        return super.getLicensePlate();
    }

    @Override
    public void setLicensePlate(String licensePlate) {
        super.setLicensePlate(licensePlate);
    }

    @Override
    public String getEngine() {
        return super.getEngine();
    }

    @Override
    public void setEngine(String engine) {
        super.setEngine(engine);
    }

    @Override
    public int getNumberSeat() {
        return super.getNumberSeat();
    }

    @Override
    public void setNumberSeat(int numberSeat) {
        super.setNumberSeat(numberSeat);
    }

    @Override
    public int getMaxPower() {
        return super.getMaxPower();
    }

    @Override
    public void setMaxPower(int maxPower) {
        super.setMaxPower(maxPower);
    }

}
