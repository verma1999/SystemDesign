package org.example.designPattern.factoryDesign;

public class Car implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing a Car.");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing a Car.");
    }
}
