package study_group.model.student;

import study_group.model.group.GroupItem;

public class Student implements Comparable<Student>, GroupItem {
    private long id;
    private String name;
    private int age;

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
//        if (this.name > o.name) {
//            return 1;
//        }
//        return 0;
        return name.compareTo(o.name);
    }
}


