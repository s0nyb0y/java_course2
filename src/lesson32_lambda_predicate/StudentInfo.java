package lesson32_lambda_predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class StudentInfo {
    // Интерфейс Predicate имеет встроенный булевый метод .test(), который сравнивает предоставленный ему элемент,
    // на соответствие к требованию
    static void testStudents(List<Student> students, Predicate<Student> pc) {
        for (Student st : students) {
            if (pc.test(st)) {
                System.out.println(st);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Mariya", 19, 'f', 2, 7.3);
        Student st2 = new Student("Marina", 23, 'f', 5, 6.3);
        Student st3 = new Student("Darina", 22, 'f', 4, 7.7);
        Student st4 = new Student("Mikhail", 22, 'm', 1, 8.3);
        Student st5 = new Student("Petr", 21, 'm', 3, 9.3);

        List<Student> students = new ArrayList<>();
        Collections.addAll(students, st1, st2, st3, st4, st5);

        testStudents(students, s -> st2.getAge() > 20);

        // метод .removeIf() удаляет элементы подходящие требованию
        students.removeIf(student -> student.getName().length() < 5);
        System.out.println("---------------------------------");
        for (Student st:students){
            System.out.println(st);
        }
        System.out.println("---------------------------------");

        Predicate<Student>pc1 = student -> student.getAge() > 19;
        Predicate<Student>pc2 = student -> student.getSex() == 'm';

        // .or() - возвращает элементы соответствующие хотя-бы одному из требований
        testStudents(students,pc1.or(pc2));
        System.out.println("---------------------------------");

        // .and() - возвращает элементы соответствующие двум требованиям
        testStudents(students,pc1.and(pc2));

        // метод .negate() возвращает антонимы pc1
        testStudents(students,pc1.negate());
    }
}
