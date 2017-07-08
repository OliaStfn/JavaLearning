package Patterns.Structural.Bridge;

public class ConcreteSlabWallCreator implements IWallCreator{
    @Override
    public void BuildWallWithDoor() {
        System.out.println("Build slab wall with door");
    }

    @Override
    public void BuildWall() {
        System.out.println("Build slab wall");
    }

    @Override
    public void BuildWallWithWindow() {
        System.out.println("Build slab wall with window");
    }
}
