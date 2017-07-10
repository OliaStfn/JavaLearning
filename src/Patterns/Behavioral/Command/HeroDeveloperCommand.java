package Patterns.Behavioral.Command;

public class HeroDeveloperCommand implements ICommand {
    private String projectName;
    private HeroDeveloper programist;

    public HeroDeveloperCommand(String projectName, HeroDeveloper programist) {
        this.projectName = projectName;
        this.programist = programist;
    }

    @Override
    public void execute() {
        programist.doAllHardWork(projectName);
    }
}
