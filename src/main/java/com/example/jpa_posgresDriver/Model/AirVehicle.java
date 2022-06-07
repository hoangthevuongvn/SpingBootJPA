package com.example.jpa_posgresDriver.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AirVehicle extends Vehicle {

    public String engine;
    public AirVehicle(String name, String model, String brand, String type, String engine, String licensePlate,int numberSeat, int maxPower) {
        super(name, model, brand, type, licensePlate, numberSeat, maxPower);
        this.engine = engine;
    }

    public AirVehicle() {

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
