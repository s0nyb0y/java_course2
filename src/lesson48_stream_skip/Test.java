package lesson48_stream_skip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();
        Student st1 = new Student("Marina",21,'f',4);
        Student st2 = new Student("Petr",18,'m',1);
        Student st3 = new Student("Mariya",20,'f',3);
        Student st4 = new Student("Mikhail",19,'m',2);
        Student st5 = new Student("Elena",22,'f',5);
        Student st6 = new Student("Olga",19,'f',2);
        Collections.addAll(students,st1,st2,st3,st4,st5,st6);

        // метод .skip() пропускает указанное в параметрах количество элементов
        students.stream().filter(student -> student.getSex() == 'f').limit(3).skip(1).forEach(System.out::println);
    }
}
class Student{
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