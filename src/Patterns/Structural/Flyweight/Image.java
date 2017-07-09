package Patterns.Structural.Flyweight;

import java.util.ArrayList;

public class Image {
    public static Image load(String str){
        ArrayList<Image> images = new ArrayList<>();
        for (int i = 0; i<200;i++){
            images.add(new Image());
        }
        return images.get(198);
    }
}
