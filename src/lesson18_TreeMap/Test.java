package lesson18_TreeMap;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        // TreeMap сохраняет элементы в порядке возрастания ключа
        TreeMap<Double, Student2>treeMap = new TreeMap<>();
        treeMap.put(9.1,new Student2("Mariya","Ivanova",3));
        treeMap.put(5.3,new Student2("Elena","Petrova",2));
        treeMap.put(7.6,new Student2("Svetlana","Kozlova",4));
        treeMap.put(6.1,new Student2("Darina","Smirnova",3));
        treeMap.put(8.1,new Student2("Mikhail","Ivanov",2));
        treeMap.put(5.1,new Student2("Evgeniy","Sidorov",5));
        treeMap.put(7.1,new Student2("Anatoliy","Medvedev",1));

        for (Map.Entry<Double, Student2>entry: treeMap.entrySet()){
            System.out.println(entry);
        }

        // метод .get() возвращает элемент по ключу
        System.out.println(treeMap.get(5.3));

        // метод .remove() удаляет элемент по указанному ключу
        treeMap.remove(5.3);

        // метод .descendingMap() возвращает элементы в обратном порядке. От макс ключа к минимальному
        System.out.println(treeMap.descendingMap());

        // метод .lastEntry() возвращает последний элемент
        System.out.println(treeMap.lastEntry());

        // метод .firstEntry() возвращает первый элемент
        System.out.println(treeMap.firstEntry());
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