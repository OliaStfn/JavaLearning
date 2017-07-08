package Patterns.Structural.Bridge;

public class CityBuildingCompany implements IBuildingCompany {
    private IWallCreator wallCreator;

  @Override
    public void setWallCreator(IWallCreator wallCreator) {
        this.wallCreator = wallCreator;
    }

    @Override
    public void buildRoof() {
        System.out.println("build roof in the city");
    }

    @Override
    public void buildFoundation() {
        System.out.println("build foundation in the city");
    }

    @Override
    public void buildRoom() {
        wallCreator.BuildWall();
        wallCreator.BuildWallWithDoor();
        wallCreator.BuildWallWithWindow();
        wallCreator.BuildWall();
        System.out.println("build room in the city");
    }
}
