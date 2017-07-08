package Patterns.Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        IBuildingCompany cityCompany = new CityBuildingCompany();
        IBuildingCompany nearSeaCompany = new NearSeaBuildingCompany();

        cityCompany.buildFoundation();
        cityCompany.setWallCreator(new BrickWallCreator());
        cityCompany.buildRoom();
        cityCompany.setWallCreator(new ConcreteSlabWallCreator());
        cityCompany.buildRoom();
        cityCompany.buildRoof();

        System.out.println();

        nearSeaCompany.buildFoundation();
        nearSeaCompany.setWallCreator(new ConcreteSlabWallCreator());
        nearSeaCompany.buildRoom();
        nearSeaCompany.buildRoom();
        nearSeaCompany.setWallCreator(new BrickWallCreator());
        nearSeaCompany.buildRoom();
        nearSeaCompany.buildRoof();
    }
}
