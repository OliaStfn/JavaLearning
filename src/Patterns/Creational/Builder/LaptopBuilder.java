package Patterns.Creational.Builder;

public abstract class LaptopBuilder {
    protected Laptop laptop;

    public void createNewLaptop(){
        laptop= new Laptop();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public abstract void setRAM();
    public abstract void setHDD();
    public abstract void setProcessor();
    public abstract void setMonitor();
}
