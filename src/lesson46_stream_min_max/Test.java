package lesson46_stream_min_max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Mariya", 20, 'f', 3);
        Student st2 = new Student("Mikhail", 18, 'm', 1);
        Student st3 = new Student("Marina", 21, 'f', 4);
        Student st4 = new Student("Petr", 19, 'm', 2);
        Student st5 = new Student("Darina", 22, 'f', 5);
        Collections.addAll(students, st1, st2, st3, st4, st5);
        // метод stream().min() возвращает самого молодого
        Student veryYang = students.stream().min((student1, student2) -> student1.getAge() - student2.getAge()).get();
        System.out.println(veryYang);
        // метод .stream().max() возвращает самого старого
        Student oldStudent = students.stream().max((student1, student2) ->student1.getAge() - student2.getAge()).get();
        System.out.println(oldStudent);
    }
}

class Student {
    private String name;
    private int age;
    private char sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
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