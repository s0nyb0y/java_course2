package lesson21_TreeSet;

import java.util.Collections;
import java.util.Objects;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // TreeSet сохраняет элементы в порядке возрастания
        TreeSet<Student>treeSet = new TreeSet<>();
        Student student1 = new Student("Mariya",4);
        Student student2 = new Student("Marina",1);
        Student student3 = new Student("Darina",3);
        Student student4 = new Student("Sasha",2);
        Student student5 = new Student("Elena",5);
        Student student6 = new Student("Igor",3);

        Collections.addAll(treeSet,student1,student2,student3,student4,student5,student6);

        System.out.println(student3.equals(student6));

        System.out.println(treeSet);

        // метод .first() возвращает первый элемент множества
        System.out.println(treeSet.first());

        // метод .last() возвращает последний элемент множества
        System.out.println(treeSet.last());

        // метод .headSet() возвращает элементы ниже элемента указанного в параметрах не включая его
        System.out.println(treeSet.headSet(student1));

        // метод .tailSet() возвращает элементы выше элемента указанного в параметрах включая его
        System.out.println(treeSet.tailSet(student1));

        // метод .subSet() возвращает элементы находящиеся между указанных элементов в параметрах
        System.out.println(treeSet.subSet(student6,student5));
    }
}
class Student implements Comparable<Student>{
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
