package Patterns.Builder;

public class BuyLaptop {
    private LaptopBuilder builder;

    public BuyLaptop(LaptopBuilder builder) {
        this.builder = builder;
    }

    public Laptop getLaptop() {
        return builder.getLaptop();
    }

    public void createLaptop(){
        builder.createNewLaptop();
        builder.setRAM();
        builder.setHDD();
        builder.setProcessor();
        builder.setMonitor();
    }
}
