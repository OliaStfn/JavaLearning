package Patterns.AbstractFactory;

public class TeddyFactory implements IToyFactory{

    @Override
    public Cat getCat() {
        return new TeddyCat();
    }

    @Override
    public Bear getBear() {
        return new TeddyBear();
    }
}
