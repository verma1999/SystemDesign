package org.example.designPattern.factoryDesign;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.design();
        car.manufacture();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.design();
        bike.manufacture();
    }
}
