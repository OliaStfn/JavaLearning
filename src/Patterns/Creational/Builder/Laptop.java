package Patterns.Creational.Builder;

public class Laptop {
    private String RAM;
    private String HHD;
    private String processor;
    private String monitor;

    public Laptop() {
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHHD() {
        return HHD;
    }

    public void setHHD(String HHD) {
        this.HHD = HHD;
    }

    public String getProcessor() {
        return processor;
}

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Laptop: " +
                "\nRAM: " + RAM +
                "\nHHD: " + HHD +
                "\nProcessor: " + processor +
                "\nMonitor: " + monitor;
    }
}
