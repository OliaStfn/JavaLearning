package Patterns.Structural.Bridge;

public class BrickWallCreator implements IWallCreator{
    @Override
    public void BuildWallWithDoor() {
        System.out.println("Build brick wall with door");
    }

    @Override
    public void BuildWall() {
        System.out.println("Build brick wall");
    }

    @Override
    public void BuildWallWithWindow() {
        System.out.println("Build brick wall with window");
    }
}
