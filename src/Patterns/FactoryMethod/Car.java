package Patterns.FactoryMethod;

public class Car implements IThing{
    private double price;
    private String name;


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void buy() {
        System.out.println("You bought this car");
    }
}
