package study_group.group;

import study_group.student.Student;
import study_group.student.StudentComparatorByAge;
import study_group.student.StudentComparatorByName;

import java.util.*;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

    public void sortByName() {
        studentList.sort(new StudentComparatorByName());
//        Collections.sort(studentList, new StudentComparatorByName());

    }

    public void sortByAge() {
        studentList.sort(new StudentComparatorByAge());
    }
}
