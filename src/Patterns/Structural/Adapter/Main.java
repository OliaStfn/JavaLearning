package Patterns.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        INewElectricitySystem newSystem = new NewElectricitySystem();
        Laptop.start(newSystem);

        OldElectricitySystem oldSystem= new OldElectricitySystem();
        Adapter adapter= new Adapter(oldSystem);
        Laptop.start(adapter);
    }


}
