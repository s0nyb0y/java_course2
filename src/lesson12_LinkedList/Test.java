package lesson12_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student>list = new LinkedList<>();
        list.add(new Student("Mariya",4));
        list.add(new Student("Anastasiya",3));
        list.add(new Student("Victoriya",4));
        list.add(new Student("Elena",2));

        for (Student student: list){
            System.out.println(student);
        }

        // Методы такие же как у ArrayList. Основное отличие LinkedList от ArrayList в том что содержит в себе связанный список
        // на основе элементов и связи между ними, а ArrayList - это список на основе массива.
        // Если основными методами планируется использование добавление и удаление элементов предпочтительнее LinkedList.
        // Если получение при помощи метода get то - ArrayList.
    }
}
class Student{
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
}
