package org.example.designPattern.factoryDesign;

public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new ElectricBike(); // Creates a Bike
    }
}