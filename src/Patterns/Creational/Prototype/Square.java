package Patterns.Creational.Prototype;

public class Square extends Shape{

    public Square() {
        setType("Square");
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
