package lesson45_stream_findFirst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Mariya", 22, 'f', 4);
        Student st2 = new Student("Marina", 18, 'f', 1);
        Student st3 = new Student("Darina", 20, 'f', 3);
        Student st4 = new Student("Mikhail", 19, 'm', 2);
        Student st5 = new Student("Petr", 21, 'm', 4);
        Collections.addAll(students, st1, st2, st3, st4, st5);
        Map<Integer, List<Student>> map = students.stream().collect(Collectors.groupingBy(student -> student.getCourse()));
        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // метод .findFirst().get() возвращает первый элемент из потока
        Student first = students.stream().findFirst().get();
        System.out.println(first);
    }
}

class Student {
    private String name;
    private int age;
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

    public void setAge(int age) {
        this.age = age;
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