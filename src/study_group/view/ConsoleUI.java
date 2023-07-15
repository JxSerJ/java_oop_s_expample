package study_group.view;

import study_group.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {

    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter(this);
        this.work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        while (work) {
            System.out.println(menu.menu());
            String line = scanner.nextLine();
            // validate input
            int choice = Integer.parseInt(line);
            menu.execute(choice);
        }
    }

    public void endProgram() {
        System.out.println("Goodbye");
        this.work = false;
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getStudentsListInfo() {
        presenter.getStudentsListInfo();
    }

    public void addStudent() {
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student age: ");
        String ageString = scanner.nextLine();
        // implement age validation
        int age = Integer.parseInt(ageString);
        presenter.addStudent(name, age);
    }
}
