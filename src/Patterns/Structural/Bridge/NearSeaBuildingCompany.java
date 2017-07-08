package Patterns.Structural.Bridge;

public class NearSeaBuildingCompany implements IBuildingCompany {
    private IWallCreator wallCreator;

   @Override
    public void setWallCreator(IWallCreator wallCreator) {
        this.wallCreator = wallCreator;
    }

    @Override
    public void buildRoof() {
        System.out.println("build roof near sea");
    }

    @Override
    public void buildFoundation() {
        System.out.println("build foundation near sea");
    }

    @Override
    public void buildRoom() {
        wallCreator.BuildWall();
        wallCreator.BuildWallWithDoor();
        wallCreator.BuildWallWithWindow();
        wallCreator.BuildWall();
        System.out.println("build room near sea");
    }
}
