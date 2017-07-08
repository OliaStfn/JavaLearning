package Patterns.Structural.Adapter;

public class NewElectricitySystem implements INewElectricitySystem{
    @Override
    public String MatchWideSocket() {
        return "220 V";
    }
}
