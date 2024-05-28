package lesson40_stream_chaining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) {
                e /= 3;
            }
            return e;
        }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);

        Student st1 = new Student("Marina", 20, 'f', 2);
        Student st2 = new Student("Mikhail", 21, 'm', 3);
        Student st3 = new Student("Mariya", 23, 'f', 5);
        Student st4 = new Student("Petr", 19, 'm', 2);
        Student st5 = new Student("Darina", 18, 'f', 1);

        List<Student> students = new ArrayList<>();
        Collections.addAll(students, st1, st2, st3, st4, st5);

        students.stream()
                .filter(student -> student.getSex() == 'f')
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student;
                }).forEach(System.out::println);
    }
}

class Student {
    private String name;
    private final int age;
    private final char sex;
    private final int course;

    public Student(String name, int age, char sex, int course) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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