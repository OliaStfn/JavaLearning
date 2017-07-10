package Patterns.Behavioral.Command;

import java.util.ArrayList;

public class Customer {
    private ArrayList<ICommand> commands;

    public Customer() {
        commands=new ArrayList();
    }

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public void signContractWithBoss() {
        for (ICommand command : commands) {
            command.execute();
        }
    }
}
