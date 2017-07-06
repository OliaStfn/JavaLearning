package Patterns.Builder;

public class Main {
    public static void main(String[] args) {
        BuyLaptop buyLaptop = new BuyLaptop(new BussinessLaptopBuilder());
        buyLaptop.createLaptop();
        System.out.println(buyLaptop.getLaptop().toString());

        System.out.println();

        buyLaptop = new BuyLaptop(new GameLaptopBuilder());
        buyLaptop.createLaptop();
        System.out.println(buyLaptop.getLaptop().toString());
    }
}
