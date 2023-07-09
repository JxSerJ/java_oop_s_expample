package study_group;

import study_group.group.StudyGroup;
import study_group.student.Student;

public class Service {
    private long id;
    private StudyGroup<Student> studyGroup;

    public Service() {
        this.studyGroup = new StudyGroup<>();
    }

    public void addStudent(String name, int age) {

        Student student = new Student(id++, name, age);
        studyGroup.addStudent(student);
    }

    public String getStudentsInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Students:\n");

//                  foreach loop
//        Iterator<Student> iterator = studyGroup.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            sb.append(student);
//            sb.append("\n");
//        }

        for (Student student : studyGroup) {
            sb.append(student);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByName() {
        studyGroup.sortByName();
    }

    public void sortByAge() {
        studyGroup.sortByAge();
    }
}
