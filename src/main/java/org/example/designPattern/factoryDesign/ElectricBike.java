package org.example.designPattern.factoryDesign;

public class ElectricBike implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing a Electric Bike.");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing a Electric Bike.");
    }
}