package org.example.designPattern.decoratorDesign;

public class PizzaDecorator implements Pizza{

    Pizza pizza;  // HAS-A relationship

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
