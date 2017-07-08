package Patterns.Structural.Decorator;

public class AmbulanceCar extends CarDecorator{

    public AmbulanceCar(Car decoratorCar) {
        super(decoratorCar);
    }

    @Override
    public void go() {
        super.go();
        System.out.println("beeep-beeep");
    }
}
