package Patterns.Structural.Bridge;

public interface IBuildingCompany {
    void setWallCreator(IWallCreator wallCreator);
    void buildRoof();
    void buildFoundation();
    void buildRoom();
}
