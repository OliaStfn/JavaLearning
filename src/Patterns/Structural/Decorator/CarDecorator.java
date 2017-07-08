package Patterns.Structural.Decorator;

public class CarDecorator extends Car{
    private Car decoratorCar;

    public CarDecorator(Car decoratorCar) {
        this.decoratorCar=decoratorCar;
    }

    @Override
    public void go() {
        decoratorCar.go();
    }
}
