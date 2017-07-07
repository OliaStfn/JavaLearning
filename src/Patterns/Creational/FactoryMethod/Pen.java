package Patterns.Creational.FactoryMethod;

public class Pen implements IThing{
    private String vendor;
    private double price;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void buy() {
        System.out.println("You bought this pen");
    }
}
