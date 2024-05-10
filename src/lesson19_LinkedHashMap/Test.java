package lesson19_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        // LinkedHashMap сохраняет порядок добавления элементов если accessOrder в параметрах по умолчанию, то есть false,
        // иначе элемент который был использован последним будет выводиться в конце списка
        LinkedHashMap<Student,Double>lhm = new LinkedHashMap<>(16,0.75f,true);
        lhm.put(new Student("Mariya","Orlova",3),7.4);
        lhm.put(new Student("Elena","Kozlova",2),5.4);
        lhm.put(new Student("Ivan","Petrov",1),6.2);
        lhm.put(new Student("Petr","Ivanov",5),8.4);
        for (Map.Entry<Student,Double>entry:lhm.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // запросил элемент по ключу, то есть использовал
        lhm.get(new Student("Mariya","Orlova",3));
        System.out.println();

        for (Map.Entry<Student,Double>entry:lhm.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
class Student{
    private final String name;
    private final String surname;
    private final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}