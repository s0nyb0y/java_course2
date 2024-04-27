package lesson8_collection_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();

        // добавление элемента в конец списка
        list.add("Mariya");
        list.add("Andrey");
        list.add("Ivan");
        System.out.println(list);

        // добавление элемента в определённое место
        list.add(1,"Misha");
        System.out.println(list);

        // изменение элемента по индексу
        list.set(2,"Evgeniy");
        System.out.println(list);

        // удаление элемента
        list.remove(2);
        System.out.println(list);

        // для корректного удаления объекта из list использовать переопределённый метод equals
        List<Student>students = new ArrayList<>();
        Student student1 = new Student("Mariya","Ivanova",3,7.5);
        Student student2 = new Student("Elena","Ivanova",2,7.0);
        Student student3 = new Student("Andrey","Petrov",1,9.5);
        Student student4 = new Student("Evgeniy","Sidorov",2,6.5);
        Student student5 = new Student("Anna","Grigoreva",4,7.8);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);

        Student student6 = new Student("Anna","Grigoreva",4,7.8);

        students.remove(student6);

        System.out.println(students);
    }
}
class Student {
    private final String name;
    private final String surname;
    private final int course;
    private final double avg;

    public Student(String name, String surname, int course, double avg) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.avg = avg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student students = (Student) o;
        return course == students.course && Double.compare(avg, students.avg) == 0
                && Objects.equals(name, students.name) && Objects.equals(surname, students.surname);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", avg=" + avg +
                '}';
    }
}
