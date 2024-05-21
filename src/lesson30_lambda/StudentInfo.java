package lesson30_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInfo {

    void testStudents(List<Student> al, StudentChecks sc) {
        for (Student st : al) {
            if (sc.check(st)) {
                System.out.println(st);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Mariya", 19, 'f', 2, 7.8);
        Student st2 = new Student("Marina", 18, 'f', 1, 8.8);
        Student st3 = new Student("Darina", 20, 'f', 3, 6.8);
        Student st4 = new Student("Mikhail", 21, 'm', 4, 8.5);
        Student st5 = new Student("Sasha", 22, 'm', 5, 6.6);
        List<Student> studentList = new ArrayList<>();
        Collections.addAll(studentList, st1, st2, st3, st4, st5);
        StudentInfo info = new StudentInfo();

        info.testStudents(studentList, (Student s) -> s.getAge() < 20);
        System.out.println("--------------------------");
        info.testStudents(studentList, (Student s) -> s.getCourse() < 4);
    }
}

interface StudentChecks {
    boolean check(Student s);
}