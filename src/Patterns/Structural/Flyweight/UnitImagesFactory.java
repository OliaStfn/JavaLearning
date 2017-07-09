package Patterns.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class UnitImagesFactory {
    private static Map<Class, Image> imageMap = new HashMap<Class, Image>();

    public static Image createImageGoblin() {
        if (!imageMap.containsKey(Goblin.class)) {
            imageMap.put(Goblin.class, Image.load("Goblin.img"));
        }
        return imageMap.get(Goblin.class);
    }

    public static Image createImageDragon() {
        if (!imageMap.containsKey(Dragon.class)) {
            imageMap.put(Dragon.class, Image.load("Dragon.img"));
        }
        return imageMap.get(Dragon.class);
    }
}
