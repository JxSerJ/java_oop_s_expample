package study_group.view.commands;

import study_group.view.ConsoleUI;

public class EndProgram extends Command {
    public EndProgram(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Exit program";
    }

    public void execute() {
        consoleUI.endProgram();

    }
}
