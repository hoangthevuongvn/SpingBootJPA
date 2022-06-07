package com.example.jpa_posgresDriver.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long iD;

    public String name;
    private String type;
    public String model;
    public String brand;
    public String licensePlate;
    public String engine;

    public  int numberSeat;
    public int maxPower;


    public Vehicle(String name, String model, String brand, String type, String licensePlate,int numberSeat, int maxPower) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.licensePlate = licensePlate;
        this.numberSeat = numberSeat;
        this.maxPower = maxPower;
    }

    public Vehicle() {

    }

    public abstract void Transport();

    public long getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }
}
