package Patterns.Behavioral.ChainOfResponsibility;

import java.util.ArrayList;

public class Me extends WeirdCafeVisitor {
    private ArrayList<Food> foods;

    public Me(WeirdCafeVisitor visitor) {
        super(visitor);
        foods = new ArrayList<>();
    }

    @Override
    public void handleFood(Food food) throws Exception {
        if ((food.getName().equals("Coffee") || food.getName().equals("Cappuccino")) && visitor != null) {
            visitor.handleFood(food);
        } else System.out.println("Me : I eat " + food.getName());
    }
}
