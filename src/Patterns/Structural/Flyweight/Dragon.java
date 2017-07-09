package Patterns.Structural.Flyweight;

public class Dragon extends Unit{
    public Dragon() {
        setHealth(100000);
        setName("Dragon");
        //setImage(Image.load("Dragon.img"));
        setImage(UnitImagesFactory.createImageDragon());
    }
}
