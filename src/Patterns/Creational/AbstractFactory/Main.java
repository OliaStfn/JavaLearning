package Patterns.Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        IToyFactory teddy = new TeddyFactory();
        IToyFactory wooden = new WoodenFactory();

        Cat cat1 = teddy.getCat();
        cat1.getInformation();
        Cat cat2 = wooden.getCat();
        cat2.getInformation();
        Bear bear1 = teddy.getBear();
        bear1.getInformation();
        Bear bear2 = wooden.getBear();
        bear2.getInformation();
    }
}
