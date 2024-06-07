package lesson44_stream_groupingBy_and_partitioningBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Mariya", 22, 'f', 5);
        Student st2 = new Student("Marina", 18, 'f', 1);
        Student st3 = new Student("Darina", 21, 'f', 4);
        Student st4 = new Student("Mikhail", 19, 'm', 2);
        Student st5 = new Student("Petr", 20, 'm', 4);
        Collections.addAll(students, st1, st2, st3, st4, st5);
        Map<Integer, List<Student>> map = students.stream().map(student -> {
            student.setName(student.getName());
            return student;

            // метод .collect(Collectors.groupingBy()) объединяет мапы по соответствующим требованиям элементам
        }).collect(Collectors.groupingBy(el -> el.getCourse()));
        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // метод .collect(Collectors.partitioningBy()) разделяет мапу на два списка, соответствующие требованию и нет
        Map<Boolean, List<Student>> map2 = students.stream().collect(Collectors.partitioningBy(el->el.getAge() > 20));
        for (Map.Entry<Boolean,List<Student>>entry2 : map2.entrySet()){
            System.out.println(entry2.getKey() + " : " + entry2.getValue());
        }
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
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
