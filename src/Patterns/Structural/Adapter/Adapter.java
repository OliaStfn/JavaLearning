package Patterns.Structural.Adapter;

public class Adapter implements INewElectricitySystem{
private OldElectricitySystem system;

    public Adapter(OldElectricitySystem system) {
        this.system=system;
    }

    @Override
    public String MatchWideSocket() {
        return system.MatchThinSocket();
    }
}
