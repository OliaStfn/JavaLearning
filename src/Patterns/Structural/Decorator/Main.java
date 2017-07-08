package Patterns.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Car porsche = new ArmorCar(new Porsche());
        Car porsche2 = new AmbulanceCar(new Porsche());

        porsche.go();

        System.out.println();

        porsche2.go();
    }
}
