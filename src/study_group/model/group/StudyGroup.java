package study_group.model.group;

import study_group.model.student.StudentComparatorByAge;
import study_group.model.student.StudentComparatorByName;

import java.util.*;

public class StudyGroup<E extends GroupItem> implements Iterable<E> {
    private List<E> studentList;

    public StudyGroup() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(E student) {
        studentList.add(student);
    }

    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<>(studentList);
    }

    public void sortByName() {
        studentList.sort(new StudentComparatorByName<>());
//        Collections.sort(studentList, new StudentComparatorByName());

    }

    public void sortByAge() {
        studentList.sort(new StudentComparatorByAge<>());
    }
}
