package Patterns.Structural.Decorator;

public class Car {
    private String brandName;

    public Car() {
    }

    public Car(String brandName) {
        this.brandName = brandName;
    }

    public void go(){
        System.out.println("I`m chukh-chukh-chukh");
    }
}
