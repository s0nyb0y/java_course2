package lesson37_stream_filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Mariya", 20, 'f', 3);
        Student st2 = new Student("Marina", 22, 'f', 5);
        Student st3 = new Student("Darina", 19, 'f', 2);
        Student st4 = new Student("Mikhail", 21, 'm', 4);
        Student st5 = new Student("Petr", 18, 'm', 1);

        List<Student> students = new ArrayList<>();
        Collections.addAll(students, st1, st2, st3, st4, st5);
        students = students.stream().filter(student ->
                student.getAge() > 20 && student.getSex() == 'f').collect(Collectors.toList());
        System.out.println(students);
    }
}

class Student {
    private String name;
    private final int age;
    private final char sex;
    private int course;

    public Student(String name, int age, char sex, int course) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                '}';
    }
}