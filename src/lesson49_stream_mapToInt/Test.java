package lesson49_stream_mapToInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Students>students = new ArrayList<>();
        Students st1 = new Students("Marina",22,'f',4);
        Students st2 = new Students("Mariya",18,'f',1);
        Students st3 = new Students("Darina",19,'f',2);
        Students st4 = new Students("Petr",20,'m',43);
        Collections.addAll(students,st1,st2,st3,st4);

        // метод .mapToInt().boxed() выбирает инты из потока, выбранный элемент в потоке должен быть интом. Для double
        // элементов есть свой метод .mapToDouble().boxed
        List<Integer>age = students.stream().mapToInt(student ->student.getAge()).boxed().collect(Collectors.toList());
        System.out.println(age);

        // метод .sum() суммирует все элементы
        int sum = students.stream().mapToInt(student -> student.getAge()).sum();
        System.out.println(sum);

        // метод .average().getAsDouble() получает средне арифметическое
        double avgGrade = students.stream().mapToDouble(student -> student.getAge()).average().getAsDouble();

        // метод .min().getAsInt() возвращает минимальный целочисленный элемент
        int min = students.stream().mapToInt(student -> student.getAge()).min().getAsInt();
        System.out.println(min);

        // метод .max().getAsInt() возвращает максимальный целочисленный элемент
        int max = students.stream().mapToInt(student -> student.getAge()).max().getAsInt();
        System.out.println(max);
    }
}
class Students{
    private String name;
    private int age;
    private char sex;
    private int course;

    public Students(String name, int age, char sex, int course) {
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
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                '}';
    }
}