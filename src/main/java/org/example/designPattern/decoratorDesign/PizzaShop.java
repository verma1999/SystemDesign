package org.example.designPattern.decoratorDesign;

public class PizzaShop {
    public static void main(String[] args){
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.getDescription() + " Cost: " + plainPizza.getCost());

        Pizza cheesePizza = new CheeseDecorator(plainPizza);
        System.out.println(cheesePizza.getDescription() + " Cost: " + cheesePizza.getCost());

        Pizza fullyLoadedPizza = new OliveDecorator(cheesePizza);
        System.out.println(fullyLoadedPizza.getDescription() + " Cost: " + fullyLoadedPizza.getCost());
    }
}