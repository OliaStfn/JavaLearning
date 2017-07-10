package Patterns.Behavioral.ChainOfResponsibility;

import java.util.ArrayList;

public class GirlFriend extends WeirdCafeVisitor {
    private ArrayList<Food> foods;

    public GirlFriend() {
        super();
        foods = new ArrayList<>();
    }

    @Override
    public void handleFood(Food food) throws Exception {
        if (food.getName().equals("Coffee") || food.getName().equals("Cappuccino")) {
            System.out.println("Girl friend : I drink " + food.getName());
        }else {
            System.out.println("Girl friend : WTF");
            throw new Exception();
        }
    }
}
