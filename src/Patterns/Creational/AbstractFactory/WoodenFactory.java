package Patterns.Creational.AbstractFactory;

public class WoodenFactory implements IToyFactory{
    @Override
    public Cat getCat() {
        return new WoodenCat();
    }

    @Override
    public Bear getBear() {
        return new WoodenBear();
    }
}
