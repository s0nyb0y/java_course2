package lesson39_stream_sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] array = {8, 21, 7, 56, 125, 3, 78, 1, 15};

        // метод .sorted() - сортирует поток в естественном порядке
        array = Arrays.stream(array).sorted().toArray();
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        System.out.println();

        Student st1 = new Student("Mariya", 21, 'f', 4);
        Student st2 = new Student("Marina", 20, 'f', 3);
        Student st3 = new Student("Darina", 18, 'f', 1);
        Student st4 = new Student("Elena", 19, 'f', 2);

        List<Student> students = new ArrayList<>();
        Collections.addAll(students, st1, st2,st3,st4);

        students = students.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
        students.forEach(System.out::println);
    }
}
class Student{
    private final String name;
    private final int age;
    private final char sex;
    private final int course;

    public Student(String name, int age, char sex, int course) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
    }

    public String getName() {
        return name;
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
