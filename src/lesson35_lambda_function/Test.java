package lesson35_lambda_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Test {

    // Интерфейс Function<T, R> принимает значение в качестве аргумента одного типа и возвращает другое значение
    // Часто используется для преобразования одного значения в другое:
    static double avgOfSomething(List<Student>studentList, Function<Student,Double>function){
        double result = 0;
        for (Student st:studentList){
            result+=function.apply(st);
        }
        return result/studentList.size();
    }
    public static void main(String[] args) {
        Student st1 = new Student("Mariya",23,'f',5);
        Student st2 = new Student("Marina",19,'f',2);
        Student st3 = new Student("Darina",18,'f',1);
        Student st4 = new Student("Mikhail",22,'m',3);
        Student st5 = new Student("Petr",24,'m',4);

        List<Student>studentList = new ArrayList<>();
        Collections.addAll(studentList,st1,st2,st3,st4,st5);

        System.out.println(avgOfSomething(studentList,student -> (double)student.getAge()));
        studentList.sort((s1,s2) -> s1.getName().compareTo(s2.getName()));
        studentList.forEach(el -> System.out.println(el));
    }
}
class Student{
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