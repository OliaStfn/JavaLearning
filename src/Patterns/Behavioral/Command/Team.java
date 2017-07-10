package Patterns.Behavioral.Command;

import java.util.ArrayList;

public class Team {
    private String nameTeam;

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public void completeProject(ArrayList<Requirement> requirements) {
        for (Requirement requirement : requirements) {
            System.out.println("Team : To do " + requirement.getName());
        }
    }
}
