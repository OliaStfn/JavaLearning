package Patterns.Structural.Adapter;

public class Laptop {

    public static void start(INewElectricitySystem system) {
        System.out.println("Start with power " + system.MatchWideSocket());
    }
}
