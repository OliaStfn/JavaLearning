package Patterns.Creational.Prototype;

public class Rectangle extends Shape{

    public Rectangle() {
        setType("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
