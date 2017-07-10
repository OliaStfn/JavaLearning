package Patterns.Behavioral.ChainOfResponsibility;

import java.util.ArrayList;

public class Friend extends WeirdCafeVisitor {
    private ArrayList<Food> foods;

    public Friend(WeirdCafeVisitor visitor) {
        super(visitor);
        foods = new ArrayList<>();
    }

    @Override
    public void handleFood(Food food) throws Exception {

        if (food.getName().equals("Coffee")) {
            if (foods.contains(food) && visitor != null) visitor.handleFood(food);
            else System.out.println("Friend : I eat " + food.getName());
        } else if (food.getName().equalsIgnoreCase("meat")) {
            System.out.println("Friend : I eat " + food.getName());
        } else if (visitor != null) visitor.handleFood(food);
    }
}
