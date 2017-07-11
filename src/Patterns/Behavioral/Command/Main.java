package Patterns.Behavioral.Command;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Team team = new Team("Z");
        ArrayList<Requirement> requirements = new ArrayList<Requirement>();
        requirements.add(new Requirement("Cool web site"));
        requirements.add(new Requirement("Ability to book beer on site"));

        ICommand commandX = new ProjectManagerCommand(requirements, team);
        customer.addCommand(commandX);

        HeroDeveloper heroDeveloper = new HeroDeveloper();
        ICommand commandA = new HeroDeveloperCommand("A", heroDeveloper);
        customer.addCommand(commandA);

        customer.signContractWithBoss();
    }
}
