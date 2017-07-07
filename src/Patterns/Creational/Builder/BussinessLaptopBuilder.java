package Patterns.Creational.Builder;

public class BussinessLaptopBuilder extends LaptopBuilder {

    @Override
    public void setRAM() {
        laptop.setRAM("4 GB");
    }

    @Override
    public void setHDD() {
        laptop.setHHD("500 GB");
    }

    @Override
    public void setProcessor() {
        laptop.setProcessor("Intel Core i5");
    }

    @Override
    public void setMonitor() {
        laptop.setMonitor("Samsung");
    }

}
