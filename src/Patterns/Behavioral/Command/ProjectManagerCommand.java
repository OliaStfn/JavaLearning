package Patterns.Behavioral.Command;

import java.util.ArrayList;

public class ProjectManagerCommand implements ICommand{
    private ArrayList<Requirement> requirements;
    private Team team;

    public ProjectManagerCommand(ArrayList<Requirement> requirements, Team team) {
        this.requirements = requirements;
        this.team = team;
    }


    @Override
    public void execute() {
        team.completeProject(requirements);
    }
}
