package Patterns.Structural.Flyweight;

public class Goblin extends Unit{
    public Goblin() {
        setHealth(100);
        setName("Goblin");
        //setImage(Image.load("Goblin.img"));
        setImage(UnitImagesFactory.createImageGoblin());
    }
}
