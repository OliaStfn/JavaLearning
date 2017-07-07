package Patterns.Creational.Prototype;

public class Circle extends Shape{

    public Circle() {
        setType("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
