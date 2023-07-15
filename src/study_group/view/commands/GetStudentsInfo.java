package study_group.view.commands;

import study_group.view.ConsoleUI;

public class GetStudentsInfo extends Command {

    public GetStudentsInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Get student list";
    }

    public void execute() {
        consoleUI.getStudentsListInfo();
    }

}
