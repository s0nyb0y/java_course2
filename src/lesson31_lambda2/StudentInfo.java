package lesson31_lambda2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInfo {

    public static void main(String[] args) {
        Student st1 = new Student("Mariya", 19, 'f', 2, 7.8);
        Student st2 = new Student("Marina", 18, 'f', 1, 8.8);
        Student st3 = new Student("Darina", 20, 'f', 3, 6.8);
        Student st4 = new Student("Mikhail", 21, 'm', 4, 8.5);
        Student st5 = new Student("Sasha", 22, 'm', 5, 6.6);
        List<Student> studentList = new ArrayList<>();
        Collections.addAll(studentList, st1, st2, st3, st4, st5);

        // использование интерфейса Comparator при помощи лямбда выражения
        Collections.sort(studentList,(s1,s2) -> s1.getCourse() - s2.getCourse());
        for (Student s:studentList){
            System.out.println(s);
        }
    }
}