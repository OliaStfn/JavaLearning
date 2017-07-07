package Patterns.Creational.Builder;

public class GameLaptopBuilder extends LaptopBuilder {

    @Override
    public void setRAM() {
        laptop.setRAM("6 GB");
    }

    @Override
    public void setHDD() {
        laptop.setHHD("1 TB");
    }

    @Override
    public void setProcessor() {
        laptop.setProcessor("Intel Core i7");
    }

    @Override
    public void setMonitor() {
       laptop.setMonitor("Asus");
    }
}
