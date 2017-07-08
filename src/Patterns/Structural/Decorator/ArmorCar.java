package Patterns.Structural.Decorator;

public class ArmorCar extends CarDecorator{

    public ArmorCar(Car decoratorCar) {
        super(decoratorCar);
    }

    @Override
    public void go() {
        super.go();
        System.out.println("I`m killing people");
    }
}
