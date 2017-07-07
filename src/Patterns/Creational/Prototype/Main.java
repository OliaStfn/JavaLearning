package Patterns.Creational.Prototype;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.setId(1);
        shapes.add(circle);
        shapes.add((Shape) circle.clone());

        for(Shape shape:shapes){
            System.out.println(shape);
        }
    }
}
