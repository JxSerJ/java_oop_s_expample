package study_group;

import study_group.model.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Stud5", 18);
        service.addStudent("Stud4", 16);
        service.addStudent("Stud2", 17);
        service.addStudent("Stud4", 18);
        service.addStudent("Stud6", 19);
        service.addStudent("Stud1", 29);

        System.out.println(service.getStudentsInfo());
        service.sortByName();
        System.out.println(service.getStudentsInfo());
        service.sortByAge();
        System.out.println(service.getStudentsInfo());

    }
}
