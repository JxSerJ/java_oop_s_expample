package study_group.model.group;

import java.util.Iterator;
import java.util.List;

public class StudentIterator<E> implements Iterator<E> {
    private int index;
    private List<E> studentList;

    public StudentIterator(List<E> studentList) {
        this.studentList = studentList;
    }


    @Override
    public boolean hasNext() {
        return studentList.size() > index;
    }

    @Override
    public E next() {
        return studentList.get(index++);
    }
}
