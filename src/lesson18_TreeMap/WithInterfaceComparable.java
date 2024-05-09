package lesson18_TreeMap;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class WithInterfaceComparable {
    public static void main(String[] args) {
        // В случаи когда ключом является что-либо кроме стандартных классов или примитивов,
        // обязательно использовать интерфейс Comparable или Comparator для того чтобы TreeMap понимал почему сортировать
        TreeMap<Student2,Double>treeMap = new TreeMap<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        treeMap.put(new Student2("Mariya","Ivanova",3),9.1);
        treeMap.put(new Student2("Elena","Petrova",2),5.3);
        treeMap.put(new Student2("Svetlana","Kozlova",4),7.6);
        treeMap.put(new Student2("Darina","Smirnova",3),6.1);
        treeMap.put(new Student2("Mikhail","Ivanov",2),8.1);
        treeMap.put(new Student2("Evgeniy","Sidorov",5),5.1);
        treeMap.put(new Student2("Anatoliy","Medvedev",1),7.1);

        System.out.println(treeMap);
    }
}
class Student2 implements Comparable<Student2>{

    private final String name;
    private final String surname;
    private final int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student2 student = (Student2) object;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
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
    public int compareTo(Student2 o) {
        return this.course - o.course;
    }
}