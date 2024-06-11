package lesson47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();
        Student st1 = new Student("Mariya",21,'f',4);
        Student st2 = new Student("Marina",20,'f',3);
        Student st3 = new Student("Darina",18,'f',1);
        Student st4 = new Student("Petr",19,'m',2);
        Collections.addAll(students,st1,st2,st3,st4);

        // метод .limit() ограничивает количество вывода информации с потока
        students.stream().filter(student -> student.getSex() == 'f').limit(2).forEach(System.out::println);
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