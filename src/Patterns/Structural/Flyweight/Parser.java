package Patterns.Structural.Flyweight;

import java.util.ArrayList;

public class Parser {
    public static ArrayList<Unit> parser() {
        ArrayList<Unit> list = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            list.add(new Goblin());
        }
        for (int i = 0; i < 200; i++) {
            list.add(new Dragon());
        }
        System.out.println("parse units is successful");
        return list;
    }
}
