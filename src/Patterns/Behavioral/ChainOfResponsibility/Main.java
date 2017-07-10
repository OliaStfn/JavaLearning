package Patterns.Behavioral.ChainOfResponsibility;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("Coffee"));
        foods.add(new Food("Coffee"));
        foods.add(new Food("Soup with meat"));
        foods.add(new Food("Potato with meat"));
        foods.add(new Food("Soup"));
        foods.add(new Food("Vegetables"));
        foods.add(new Food("Cappuccino"));


        GirlFriend girlFriend = new GirlFriend();
        Me me = new Me(girlFriend);
        Friend friend = new Friend(me);
        for (Food food : foods) {
            friend.handleFood(food);
        }
    }
}
