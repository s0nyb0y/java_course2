package lesson17_hashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        // Ключ рекомендуется делать неизменяемым, то есть final, иначе после изменения ключа мы не сможем его найти.
        // Причина, при изменении объекта, меняется его хэш код
        Map<Student,Double>map = new HashMap<>();
        map.put(new Student("Ivan","Petrov",3),7.8);
        map.put(new Student("Piter","Ivanov",2),6.5);
        map.put(new Student("Igor","Sidorov",4),8.8);
        for (Map.Entry<Student,Double>map1:map.entrySet()){
            System.out.println(map1.getKey() + " : " + map1.getKey().hashCode());
        }
    }
}

final class Student{
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